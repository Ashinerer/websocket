FROM openjdk:8
COPY . /tmp
#COPY ./out/production/classes/com/ws /tmp
WORKDIR .
#ENTRYPOINT ["java", "main/java/com/ws/HelloWSS"]
#ENTRYPOINT ["java -jar wsClient-1.0.jar"]
#CMD java -jar build/libs/wsClient-1.0.jar
CMD ls