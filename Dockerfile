FROM openjdk:11-jre-slim

COPY target/khaddem-4.0.jar .
EXPOSE 8089
ENTRYPOINT ["java", "-jar", "khaddem-4.0.jar"]