#!/bin/bash
mkdir -p bin
if [ ! -f bin/choerodon-tool-liquibase.jar ]
then
    curl https://oss.sonatype.org/content/groups/public/io/choerodon/choerodon-tool-liquibase/0.6.2.RELEASE/choerodon-tool-liquibase-0.6.2.RELEASE.jar -o ./bin/choerodon-tool-liquibase.jar
fi
java -Dspring.datasource.url="jdbc:mysql://localhost:3306/report_test?useUnicode=true&characterEncoding=utf-8&useSSL=false" \
 -Dspring.datasource.username=choerodon \
 -Dspring.datasource.password=123456 \
 -Ddata.drop=false -Ddata.init=true \
 -Ddata.dir=./src/main/resources \
 -jar ./bin/choerodon-tool-liquibase.jar
