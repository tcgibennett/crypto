package security.cryptor;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Random;

public class Encryptor {
    private static final String _KEY = "cr1t1calm1ndsad!"; // 128 bit key
    private static final String[] ivChars = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z","1","2","3","4","5","6","7","8","9","0","_","+","-","=","`","`","!","@","#","$","%","^","&","*","(",")","[","]","{","}","\\","|","/","?",".",",","<",">","'",";",":"};

    public static String encrypt(String value) throws UnsupportedEncodingException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
            String initVector = randomIV();
            IvParameterSpec iv = new IvParameterSpec(initVector.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(_KEY.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            //cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
            cipher.init(Cipher.ENCRYPT_MODE, skeySpec, iv);

            byte[] encrypted = cipher.doFinal(value.getBytes());
            String enc = new String(Base64.encodeBase64String(encrypted));
            byte[] encwsalt = (initVector+""+enc).getBytes();

            return Base64.encodeBase64String(encwsalt);

    }

    public static String decrypt(String encrypted)  throws InvalidAlgorithmParameterException, NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException, UnsupportedEncodingException
    {
            byte[] encwsalt = Base64.decodeBase64(encrypted);
            String salt = new String(encwsalt).substring(0,16);
            String enc = new String(encwsalt).substring(16);

            IvParameterSpec iv = new IvParameterSpec(salt.getBytes("UTF-8"));
            SecretKeySpec skeySpec = new SecretKeySpec(_KEY.getBytes("UTF-8"), "AES");

            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            //cipher.init(Cipher.DECRYPT_MODE, skeySpec);
            cipher.init(Cipher.DECRYPT_MODE, skeySpec, iv);

            byte[] original = cipher.doFinal(Base64.decodeBase64(enc));

            return new String(original);

    }


    private static String randomIV()
    {
        StringBuilder iv = new StringBuilder();
        int Low = 0;
        int High = ivChars.length - 1;
        Random random = new Random();

        int randomNum = random.nextInt(High - Low) + Low;

        for (int x = 1; x <= 16; x++)
        {
            iv.append(ivChars[randomNum]);
            randomNum = random.nextInt(High - Low) + Low;
        }

        return iv.toString();
    }
}