FROM openjdk:8
COPY target/discovery*.jar /var/www/app.jar
EXPOSE 8080
WORKDIR /var/www
ENTRYPOINT ["java", "-jar", "app.jar", "--spring.profiles.active=docker"]
