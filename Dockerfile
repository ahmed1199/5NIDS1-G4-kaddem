FROM openjdk:11-jre-slim@sha256:93af7df2308c5141a751c4830e6b6c5717db102b3b31f012ea29d842dc4f2b02

COPY target/khaddem-4.0.jar .
EXPOSE 8089
ENV IMAGE_NAME="ahmedtlich_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "khaddem-4.0.jar"]