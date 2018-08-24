FROM openjdk:8
ADD target/mongo-spring-boot-crud.jar mongo-spring-boot-crud.jar
EXPOSE 2244
ENTRYPOINT ["java","-jar","mongo-spring-boot-crud.jar"]