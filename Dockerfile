FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/spring-boot-backend.jar spring-boot-backend.jar
EXPOSE 8080
CMD ["java","-jar","spring-boot-backend.jar"]