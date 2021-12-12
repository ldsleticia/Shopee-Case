FROM adoptopenjdk/openjdk11

ADD target/shopee-case-1.0-SNAPSHOT.jar shopee-case-1.0-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "shopee-case-1.0-SNAPSHOT.jar"]