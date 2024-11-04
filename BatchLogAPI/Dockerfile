FROM amazoncorretto:11
VOLUME /tmp
COPY target/openapi-spring-1.0.0.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]