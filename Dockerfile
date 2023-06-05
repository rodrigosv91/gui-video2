FROM openjdk:17
EXPOSE 8080
ADD target/gui-video-0.0.1-SNAPSHOT.jar gui-video.jar
ENTRYPOINT ["java", "-jar", "/gui-video.jar"]