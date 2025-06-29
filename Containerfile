FROM gcr.io/distroless/java17-debian12:latest-arm64
VOLUME /tmp
COPY target/tennis-0.0.1-SNAPSHOT.jar app.jar
CMD ["app.jar"]