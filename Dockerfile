FROM maven:3.9.6-eclipse-temurin-21-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY src ./src

RUN mvn clean package

# Stage 2: Run
FROM eclipse-temurin:21-jdk

WORKDIR /app

# Copy WAR file from previous stage
COPY --from=build /app/target/*.war logging-example.war

EXPOSE 9090

ENTRYPOINT ["java", "-jar", "logging-example.war"]