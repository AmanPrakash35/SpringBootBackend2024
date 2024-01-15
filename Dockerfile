FROM eclipse-temurin:17-jdk-alpine
WORKDIR /app
COPY target/spring-boot-backend2024.jar spring-boot-backend2024.jar
EXPOSE 8080
CMD ["java","-jar","spring-boot-backend2024.jar"]