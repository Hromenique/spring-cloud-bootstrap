FROM openjdk:8
COPY target/clients*.jar /var/www/app.jar
EXPOSE 9000
WORKDIR /var/www
ENTRYPOINT ["java", "-jar", "app.jar"]
