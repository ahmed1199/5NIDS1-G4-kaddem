FROM openjdk:11-jre-slim

COPY target/khaddem-4.0.jar .
EXPOSE 8089
ENV IMAGE_NAME="ahmedtlich_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "khaddem-4.0.jar"]