FROM openjdk:21

COPY ./target/calculator-1.0-SNAPSHOT.jar ./

WORKDIR /app

CMD ["java", "-cp", "calculator-1.0-SNAPSHOT.jar", "org.example.Main"]