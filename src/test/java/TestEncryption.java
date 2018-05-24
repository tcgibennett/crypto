import com.metaopsis.crypto.Encryptor;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

import org.junit.Test;

/**
 * Created by tbennett on 11/14/16.
 */
public class TestEncryption {

    @Test
    public void TestEncryption()
    {
        //String value = "lak3v13w.c0m";
        // Just Informatica
        //String value = "{\"company\":\"Unico Solution\",\"contact\":\"Thomas Bennett\",\"email\":\"tbennett@unicosolution.com\",\"expires\":\"2017-12-31\",\"analyze\":true,\"convert\":true,\"licenses\":[{\"source\":\"Power Center\",\"target\":\"Informatica Cloud\",\"valid\":true},{\"source\":\"Power Center\",\"target\":\"Talend\",\"valid\":true}]}";
        // Informatica and Talend
        //String value = "{\"company\":\"Critical Minds Advisory\",\"contact\":\"Thomas Bennett\",\"email\":\"tbennett@criticalmindsad.com\",\"expires\":\"2017-12-31\",\"analyze\":true,\"convert\":true,\"licenses\":[{\"source\":\"PowerCenter\",\"target\":\"InformaticaCloud\",\"valid\":true},{\"source\":\"PowerCenter\",\"target\":\"Talend\",\"valid\":true}]}";

        //String encrypted = Encryptor.encrypt(value);
        //System.out.println(encrypted);
        //String encrypted = "NE9SYSdcdW9jW0Rpam1jTlo1NTI4ODNzTU11RS9MWkhpVjFiWVVhbVF6RUFnWVdYbUczdTNUQWV1aEZHc2U3blpCd3pnWEp6czdqc1M1UUdQUVE0YmJvY0o4VVZqUWZQallkMVJ3dWJCWHVOVTR0eTlUYnV3L0NwbDFMU1ZySjZQY2lMTk1vMmpnaUl4ajVnemUyZUFVZXE4amF1YUxqSUZ6UHlMRzlYSG1CYkFZTk9vTS96UXJJQWFQVm1wR242ZG1aVjNHQ1BMWk94NjRTNldoQzE4ZCtyZmVVMlVVTzVzQ0NpK2owRXhhYk44OGEzTmRqcitzdDdKNDVGNGt2WWhqdWJHMk16YnFzajRPNnRLUlFNWHo5bnZuRVgzVzFmSWNFRGRtUWxDUnNEeTBBMHp0RjQvWUNZQUdhbStOcVJwNDhqT3E1eS94OFgxL1VQ";
        //String encrypted = "NE9SYSdcdW9jW0Rpam1jTlo1NTI4ODNzTU11RS9MWkhpVjFiWVVhbVF6RUFnWVdYbUczdTNUQWV1aEZHc2U3blpCd3pnWEp6czdqc1M1UUdQUVE0YmJvY0o4VVZqUWZQallkMVJ3dWJCWHVOVTR0eTlUYnV3L0NwbDFMU1ZySjZQY2lMTk1vMmpnaUl4ajVnemUyZUFVZXE4amF1YUxqSUZ6UHlMRzlYSG1CYkFZTk9vTS96UXJJQWFQVm1wR242ZG1aVjNHQ1BMWk94NjRTNldoQzE4ZCtyZmVVMlVVTzVzQ0NpK2owRXhhYk44OGEzTmRqcitzdDdKNDVGNGt2WWhqdWJHMk16YnFzajRPNnRLUlFNWHo5bnZuRVgzVzFmSWNFRGRtUWxDUnNEeTBBMHp0RjQvWUNZQUdhbStOcVJwNDhqT3E1eS94OFgxL1VQ";
        //String encrypted = "SVUraTI5M1pgT2NXbUQsX1FvNk54NE95dS9USjFpaENMSkxwOXg3VXBYNnpRdWg1VnBxdnZ3NjlKRzFVUWNZQTJEN2t6T29IOFZrYVZjTGpnMCt4RlJDZVk0L0J3TEY2UHMvVm9iVnRHVXM3SEVUZmJ1ZmV4T0cyMXM3YlhGRUQ4R1VubmlVbkhmem92MlBITDJnRlR3WTlCOGNMbEFoemdLQnFwS2xuaDVUUzkvTXlyaGJrelRtYmJkOFpiSXlYM2VjczR2V2o0SHNmdC9la1BKMG1Jc01Bb244T3R6VkxTOU5ZMFhabXZjOWhpRnJQN0h5bnFEZ0NaczFtM1R5elQzam82OVFuN3ZINGlPcklBbVdYYlFONDBTSDN3bHJTT2xqSDdWYmZyNlV4ZjBIUlMrQzVFWk5GYWNhQ1FFT2ltRCtPV3YrazEwbUhoU3lTNjhlOGo2eDR0UEhQNklDaEJSTFYwd1ZCdkJFbnd1Mmg3YU8vbjhoamJDVlRjY1NnVFptaVIzSmNKYVEyU0IwQg==";

		 //String encrypted = "cj01MVMwbXd4MHIuTl89JTkyMWJqeUtEL0pSTnhaNVNIQ3lVcmc9PQ==";
		  //String encrypted = "QGBKYCRLL1hpZWd6WW5PdmVjck1XYmZnNz1WSC9qeHJtRGFSeVE9PQ==";
		//String encrypted = "bjIuYDZBZlVIQychQ0pUWzhsNlA5Z2tzbHcrb2N2M25NWitOM2c9PQ==";
		String encrypted = "LDlmYll3UWlbKyQnb1JzXzlReGpHbzBNOVpSYUNyaytPa04yK1E9PQ==";
		String decrypted;
        
		try {
			decrypted = Encryptor.decrypt(encrypted);
			System.out.println(decrypted);
			System.out.println(Encryptor.encrypt("InfaP@$$"));
			//System.out.println(Encryptor.encrypt("{\"company\":\"Unico Solution\",\"contact\":\"Thomas Bennett\",\"email\":\"tbennett@unicosolution.com\",\"expires\":\"2018-12-31\",\"analyze\":true,\"convert\":true,\"licenses\":[{\"source\":\"Power Center\",\"target\":\"Informatica Cloud\",\"valid\":true},{\"source\":\"Power Center\",\"target\":\"Talend\",\"valid\":true}]}"));
		} catch (InvalidKeyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidAlgorithmParameterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalBlockSizeException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (BadPaddingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        //assert(decrypted.equals(value));
    }
}
