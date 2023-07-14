FROM tomcat:9.0.78-jdk8-corretto-al2
RUN sed -i 's/port="8080"/port="80"/' ${CATALINA_HOME}/conf/server.xml
COPY /target/webapp.war /usr/local/tomcat/webapps/
EXPOSE 80
CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
