FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY target/UserManagementSpring-0.0.1-SNAPSHOT.war usermanagementapp.war
EXPOSE 8081
ENTRYPOINT ["java","-jar","/app/usermanagementapp.war"]