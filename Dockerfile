
FROM openjdk:11 
EXPOSE 8082
COPY target/yass-0.0.1-SNAPSHOT.jar yass-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/yass-0.0.1-SNAPSHOT.jar"]