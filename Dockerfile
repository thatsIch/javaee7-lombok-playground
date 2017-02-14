FROM airhacks/payara-micro
MAINTAINER thatsich, github.com/thatsIch

COPY target/javaee7-lombok-playground.war ${DEPLOYMENT_DIR}
ENV ARCHIVE_NAME javaee7-lombok-playground.war
