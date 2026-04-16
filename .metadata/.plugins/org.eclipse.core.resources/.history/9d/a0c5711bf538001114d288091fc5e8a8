FROM openjdk:17-jdk-alpine
COPY target/helloapp.war helloapp.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/helloapp.war"]