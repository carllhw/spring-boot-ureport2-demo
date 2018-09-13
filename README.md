# Spring Boot UReport2 Demo

## 初始化数据库

新建数据库
```
CREATE USER 'choerodon'@'%' IDENTIFIED BY "123456";

CREATE DATABASE report_test DEFAULT CHARACTER SET utf8;
GRANT ALL PRIVILEGES ON report_test.* TO choerodon@'%';
FLUSH PRIVILEGES;
```

初始化数据库
```bash
sh init-local-database.sh
```

## 修改配置并拷贝示例报表模板文件

修改配置文件`src/main/resources/ureport-config.properties`里的`ureport.fileStoreDir`属性为本地目录，例如`/Users/carllhw/ureportfiles`

拷贝`demo.ureport.xml`文件到上述目录即可

## 启动应用

```bash
mvn clean spring-boot:run
```

## 预览

浏览器访问地址[http://localhost:8080/ureport/designer?_u=file:demo.ureport.xml](http://localhost:8080/ureport/designer?_u=file:demo.ureport.xml)

点击预览
![](https://ws1.sinaimg.cn/large/b2b6a323gy1fv7znndcjlj21r20mmq6w.jpg)

即可看到预览结果，并可以以多种方式输出报表
![](https://ws1.sinaimg.cn/large/b2b6a323gy1fv7zskpavkj211a09utad.jpg)
