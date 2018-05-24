mvn validate
mvn test
mvn clean compile assembly:single
mv ./target/crypto-1.0-jar-with-dependencies.jar ./target/crypto-1.0.jar
mvn install:install-file -Dfile=./target/crypto-1.0.jar -DgroupId=com.metaopsis -DartifactId=crypto -Dversion=1.0 -Dpackaging=jar
