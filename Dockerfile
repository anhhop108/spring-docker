#FROM openjdk:11
#COPY target/classes/ /tmp
#COPY pom.xml .
#COPY . .
#WORKDIR /tmp
#CMD java com.example.springdocker.SpringDockerApplication
#EXPOSE 3000


#FROM maven:3.5-jdk-8-alpine
#
#FROM openjdk:11
##ARG JAR_FILE=target/*.jar
#WORKDIR /app
##COPY ${JAR_FILE} /app
#COPY target/*.jar /app
##VOLUME ["src/main/resources/static"]
#EXPOSE 8088
##ENTRYPOINT ["java","-jar","/app"]


# syntax=docker/dockerfile:1
#dùng đoạn này vẫn chạy dự án bth nhưng phải download maven khi deploy
#nhưng hiện tại đang lỗi khi không sinh được code repository
#FROM openjdk:11
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]


#chi build file jar,đã bao gồm thư viện trong này nen k cần download


FROM openjdk:11
COPY target/spring-docker-0.0.1-SNAPSHOT.jar /code
ENTRYPOINT ["java","-jar","/code"]
EXPOSE 8088