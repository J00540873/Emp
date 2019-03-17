FROM openjdk:8-jdk-alpine
MAINTAINER jamiedurr@gmail.com
RUN apk add --no-cache bash
COPY Employee-*-SNAPSHOT.jar /opt/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]