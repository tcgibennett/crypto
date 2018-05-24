mvn validate
mvn test
mvn clean compile assembly:single
mv ./target/cryptor-1.0-jar-with-dependencies.jar ./target/cryptor-1.0.jar
mvn install:install-file -Dfile=./target/cryptor-1.0.jar -DgroupId=security -DartifactId=cryptor -Dversion=1.0 -Dpackaging=jar
