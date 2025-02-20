FROM maven:3.5.4-jdk-8-alpine as maven

COPY ./pom.xml ./pom.xml
COPY ./src ./src

RUN mvn dependency:go-offline -B

RUN mvn package

FROM openjdk:8u171-jre-alpine

WORKDIR /project-dockerimg

COPY --from=maven target/maven-web-project*.jar ./project-dockerimg/maven-web-project.jar

CMD ["java", "-jar", "./project-dockerimg/maven-web-project.jar"]
