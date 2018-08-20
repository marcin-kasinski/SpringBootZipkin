#!/bin/bash

ls -l /
cat /etc/init.d/filebeat
/etc/init.d/filebeat start
java -jar SpringBootZipkin-0.0.1-SNAPSHOT.jar --logging.level.zipkin2=DEBUG