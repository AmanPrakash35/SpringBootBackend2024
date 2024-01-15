FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/spring-boot-backend-3.2.1.jar spring-boot-backend-3.2.1.jar
EXPOSE 8080
CMD ["java","-jar","spring-boot-backend-3.2.1.jar"]