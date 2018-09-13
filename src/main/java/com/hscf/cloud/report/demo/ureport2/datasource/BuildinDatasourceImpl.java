package com.hscf.cloud.report.demo.ureport2.datasource;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;

import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BuildinDatasourceImpl implements BuildinDatasource {

    private static final String NAME = "Spring Boot Demo Built-in DataSource";

    private Logger log = LoggerFactory.getLogger(BuildinDatasourceImpl.class);

    @Autowired
    private DataSource dataSource;

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            log.error("UReport buildin datasource: get connection failed !");
            throw new RuntimeException(e);
        }
    }
}
