FROM adoptopenjdk:17-jdk-hotspot

WORKDIR /app

COPY ./target/calculator-1.0-SNAPSHOT.jar ./

CMD ["java", "-jar", "calculator-1.0-SNAPSHOT.jar"]