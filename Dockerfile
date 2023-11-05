FROM openjdk:11-jre-slim

COPY target/5NIDS1-G4-kaddem.jar .
EXPOSE 8089
ENV IMAGE_NAME="ahmedtlich_5NIDS1-G4-kaddem"
ENTRYPOINT ["java", "-jar", "5NIDS1-G4-kaddem.jar"]