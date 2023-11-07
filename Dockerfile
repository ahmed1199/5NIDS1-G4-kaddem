FROM openjdk:17-jre-slim

COPY target/DEVOPSMS.jar .
EXPOSE 8089
ENV IMAGE_NAME="maleksahli-5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "DEVOPSMS.jar"]
