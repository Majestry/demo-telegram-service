FROM eclipse-temurin:17-jdk-alpine
EXPOSE 8080
WORKDIR /opt/app/
COPY ./target/*.jar telegram.jar
ENTRYPOINT ["java", "-jar", "telegram.jar"]