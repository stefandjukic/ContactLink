FROM maven:3.8.3-openjdk-17-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

FROM openjdk:17-slim
COPY --from=build /app/target/ContactLink.jar /ContactLink.jar
EXPOSE 8080
CMD ["java", "-jar", "/ContactLink.jar"]