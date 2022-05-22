FROM bitnami/java:17

WORKDIR /app

COPY ./target/WarInNewWorld-0.0.1-SNAPSHOT.jar ./WarInNewWorld.jar

EXPOSE 8098

CMD [ "java", "-jar", "WarInNewWorld.jar" ]
