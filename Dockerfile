#FROM openjdk:17-jdk-alpine
FROM openjdk:17
COPY ./target/spring-api-0.0.1-SNAPSHOT.jar app.jar
LABEL authors="MoAd007"

ENTRYPOINT ["java", "-jar", "/app.jar"]