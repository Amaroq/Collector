# Base image
FROM openjdk:21-slim
ENV JAR_NAME=collector.jar

# copy JAR file into container
COPY build/libs/Spring-0.0.1-SNAPSHOT.jar /collector.jar
COPY src/main/resources/static /static

# expose port
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/collector.jar"]