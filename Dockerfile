FROM openjdk:21-jdk-slim

WORKDIR /app

COPY target/cursos-0.0.1-SNAPSHOT.jar /app/cursos.jar

EXPOSE 8081

CMD ["java", "-jar", "cursos.jar"]