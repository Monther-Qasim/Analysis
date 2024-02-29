ARG JAR_FILE=target/*.jar
FROM openjdk:11-jre-slim
COPY ${JAR_FILE} analysis.jar
ENTRYPOINT ["java", "-jar", "/analysis.jar"]
EXPOSE 8761