FROM openjdk:11-jre-slim

COPY 5NIDS1-G4-kaddem.jar .
EXPOSE 8089
ENV IMAGE_NAME="ahmedtlich_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "5nids1-g4-kaddem.jar"]