FROM ghcr.io/graalvm/jdk-community:24
VOLUME /tmp
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]