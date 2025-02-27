FROM eclipse-temurin:21-alpine-3.21
COPY target/netController-0.0.1-SNAPSHOT.jar netController-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "netController-0.0.1-SNAPSHOT.jar"]