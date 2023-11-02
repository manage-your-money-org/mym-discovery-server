FROM eclipse-temurin:17-jdk-alpine
COPY build/libs/*.jar mym-discovery-server.jar
ENTRYPOINT ["java", "-jar", "/mym-discovery-server.jar"]