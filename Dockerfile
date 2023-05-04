FROM openjdk:11
RUN mkdir workspace
RUN yum install git
RUN yum install maven
CMD sudo start tomcat
COPY target/01-maven-web-app*.war /usr/local/tomcat/webapps/maven-web-app.war
ENTRYPOINT["java", "-jar" , "dockerapp.jar" ]
