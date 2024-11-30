# Use a base image with Tomcat
FROM tomcat:9.0

# Copy the WAR file into the webapps directory of Tomcat
COPY target/ContactLink-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/

# Expose the port Tomcat runs on
EXPOSE 8080

# Define the command to run Tomcat
CMD ["catalina.sh", "run"]
