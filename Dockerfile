FROM openjdk:8
ADD target/bowler.jar bowler.jar
#EXPOSE 8181
#EXPOSE 8181
ENTRYPOINT ["java", "-jar", "bowler.jar"]