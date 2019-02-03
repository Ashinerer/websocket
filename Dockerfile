FROM openjdk:8
COPY ./build/libs /tmp
#COPY ./out/production/classes/com/ws /tmp
WORKDIR /tmp
#ENTRYPOINT ["java", "main/java/com/ws/HelloWSS"]
#ENTRYPOINT ["java -jar wsClient-1.0.jar"]
CMD java -jar wsClient-1.0.jar