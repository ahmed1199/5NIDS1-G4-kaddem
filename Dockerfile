FROM openjdk:11

COPY target/khaddem-4.0.jar .
EXPOSE 8088
ENV IMAGE_NAME="ghadaSaidi_5nids1-g4-kaddem"
ENTRYPOINT ["java", "-jar", "khaddem-4.0.jar"]