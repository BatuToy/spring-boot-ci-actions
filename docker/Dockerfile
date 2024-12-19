FROM amazoncorretto:17-alpine AS build
WORKDIR /app
ARG APP_JAR="./targer/*jar"
COPY $APP_JAR  app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
CMD ["/app"]
EXPOSE 9090
