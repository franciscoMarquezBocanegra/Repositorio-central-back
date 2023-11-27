FROM maven:3.8.4-openjdk-17

# Set the working directory in the container
WORKDIR /app

# Copy the pom.xml file and the source code from the build context (host) to the working directory in the container
COPY pom.xml .
COPY src ./src

# Expose the default port for Spring Boot applications
EXPOSE 8080

# Define the entrypoint for the container
ENTRYPOINT ["mvn", "spring-boot:run"]
