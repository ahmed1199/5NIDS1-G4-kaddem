FROM openjdk:8
EXPOSE 8089
WORKDIR /khaddem
COPY DEVOPSMS.jar /khaddem/DEVOPSMS.jar
ENTRYPOINT ["java", "-jar", "DEVOPSMS.jar"]