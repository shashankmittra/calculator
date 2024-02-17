FROM openjdk:17-jdk-slim

WORKDIR /app

COPY ./target/calculator-1.0-SNAPSHOT.jar ./

CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]