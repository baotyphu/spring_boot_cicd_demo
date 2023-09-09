FROM openjdk:11
EXPOSE 8080
ADD target/demo1-0.0.1-SNAPSHOT.jar devops-spring-boot.jar
ENTRYPOINT ["java","-jar","/devops-spring-boot.jar"]