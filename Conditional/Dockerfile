FROM openjdk:17
WORKDIR /app
EXPOSE 8080
COPY target/Conditional-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]