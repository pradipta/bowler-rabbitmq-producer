FROM openjdk:8
ADD target/bowler-rabbitmq-producer-0.0.1-SNAPSHOT.jar bowler.jar
COPY target/bowler-rabbitmq-producer-0.0.1-SNAPSHOT.jar bowler.jar
#COPY /build/libs/book-manager-1.0-SNAPSHOT.jar book-manager-1.0-SNAPSHOT.jar
#COPY /build/libs/bowler-1.0-SNAPSHOT.jar book-manager-1.0-SNAPSHOT.jar
#EXPOSE 8181
#EXPOSE 8181
ENTRYPOINT ["java", "-jar", "bowler.jar"]