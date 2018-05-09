FROM openjdk:8
COPY target/svc-book*.jar /var/www/app.jar
EXPOSE 8083
WORKDIR /var/www
ENTRYPOINT ["java", "-jar", "app.jar"]
