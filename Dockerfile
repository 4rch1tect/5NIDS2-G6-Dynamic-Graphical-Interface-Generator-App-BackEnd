
FROM openjdk:11
EXPOSE 8082
COPY target/yass-0.0.1-SNAPSHOT-1.0.jar yass-0.0.1-SNAPSHOT-1.0.jar
ENTRYPOINT ["java","-jar","/yass-0.0.1-SNAPSHOT-1.0.jar"]