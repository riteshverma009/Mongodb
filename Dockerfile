FROM openjdk:11
EXPOSE 8081
ADD target/spring-mongo-docker.jar spring-mongo-docker.jar
ENTRYPOINT ["java","-jar","/spring-mongo-docker.jar"]
