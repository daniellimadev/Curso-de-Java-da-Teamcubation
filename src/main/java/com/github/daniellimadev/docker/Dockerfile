# Exemplo de Dockerfile

FROM openjdk:17-oracle
WORKDIR /app
COPY /target/Api-Transacao-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]