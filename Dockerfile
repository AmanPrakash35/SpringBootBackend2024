FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/SpringBootBackend.jar SpringBootBackend.jar
EXPOSE 8080
CMD ["java","-jar","SpringBootBackend.jar"]