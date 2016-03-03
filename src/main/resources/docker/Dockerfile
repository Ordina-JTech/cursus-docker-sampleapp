FROM java:8-jdk

RUN echo 127.0.2.1 mongodb > /etc/hosts; cat /etc/hosts

ADD stickynote-service.jar /

EXPOSE 8080

CMD ["java","-jar","/stickynote-service.jar"]