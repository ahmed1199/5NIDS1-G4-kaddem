FROM openjdk@sha256:467fbc5451c201f2ea6e51ad3a60707de35a54b14e46f04c788d6f3596b3787c

COPY target/DEVOPSMS.jar .
EXPOSE 8089
ENV IMAGE_NAME="maleksahli/maleksahli-5nids1-g4-khaddem"


ENTRYPOINT ["java", "-jar", "DEVOPSMS.jar"]
