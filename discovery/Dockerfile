FROM openjdk:8
COPY target/discovery*.jar /var/www/app.jar
EXPOSE 8082
WORKDIR /var/www
ENTRYPOINT ["java", "-jar", "app.jar"]
