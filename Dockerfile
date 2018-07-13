FROM graemeo/jdk8

ARG BUILD_NUMBER

ENV BUILD_NUMBER=$BUILD_NUMBER

COPY build/libs/room-api-$BUILD_NUMBER.jar .

EXPOSE 8080

CMD ["/bin/sh", "-c", "java -jar room-api-$BUILD_NUMBER.jar"]