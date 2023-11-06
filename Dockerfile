# Use an official OpenJDK runtime as a parent image
FROM openjdk:11-jre-slim

# Set the working directory in the container
WORKDIR /app

# Copy the application JAR into the container at the working directory
COPY target/yass-0.0.1-SNAPSHOT.jar ./app.jar

# Run the application
CMD ["java", "-jar", "app.jar"]