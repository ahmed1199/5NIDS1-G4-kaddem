FROM openjdk

COPY target/DEVOPSMS.jar .
EXPOSE 8089
ENV IMAGE_NAME="maleksahli/maleksahli-5nids1-g4-khaddem"


ENTRYPOINT ["java", "-jar", "DEVOPSMS.jar"]
