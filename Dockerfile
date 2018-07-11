FROM graemeo/jdk8

COPY build/libs/room-api.jar .

EXPOSE 8080

CMD ["/usr/bin/java", "-jar" , "room-api.jar"]