# Todo --> Error: Unable to access jarfile java -github-actions-ci-cd-0.0.1-SNAPSHOT.jar
# Build Stage!
FROM maven:3.8.4-openjdk-17-slim AS build
WORKDIR /build
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests=true
# Run Stage
FROM openjdk:17-jdk-slim
EXPOSE 9000
WORKDIR /app
COPY --from=build /build/target/*.jar app.jar
CMD ["java","-jar","app.jar"]




