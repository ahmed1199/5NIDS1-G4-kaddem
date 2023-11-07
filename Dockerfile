FROM openjdk:11

COPY target/DEVOPSMS.jar .
EXPOSE 8089
ENV IMAGE_NAME="ghadaSaidi_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "DEVOPSMS.jar"]