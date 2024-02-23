FROM openjdk:21
COPY ./target/Calculator_Project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "Calculator_Project-1.0-SNAPSHOT.jar", "org.example.Main"]

