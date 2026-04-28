# Build stage
FROM maven:3.8.4-openjdk-11-slim AS build
COPY . .
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:11-jre-alpine
COPY --from=build /target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
