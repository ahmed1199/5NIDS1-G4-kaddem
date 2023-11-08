FROM openjdk:11

COPY target/devPROJECT.jar .
EXPOSE 8089
ENV IMAGE_NAME="siwarmathlouthi_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "devPROJECT.jar"]