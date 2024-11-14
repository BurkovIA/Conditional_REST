FROM openjdk:11
WORKDIR /app
EXPOSE 8081
COPY target/Conditional-0.0.1-SNAPSHOT.jar prodapp.jar
ENTRYPOINT ["java", "-jar", "prodapp.jar"]