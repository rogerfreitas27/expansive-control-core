# syntax=docker/dockerfile:1

FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline



COPY src ./src

CMD ["./mvnw", "spring-boot:run"]