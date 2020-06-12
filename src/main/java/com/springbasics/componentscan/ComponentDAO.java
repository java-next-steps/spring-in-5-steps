package com.springbasics.componentscan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

    @Autowired
    ComponentJdbcConnection componentJdbcConnection;

    public ComponentJdbcConnection getComponentJdbcConnection() {
        return componentJdbcConnection;
    }

    public void setJdbcConnection(ComponentJdbcConnection jdbcConnection) {
        this.componentJdbcConnection = jdbcConnection;
    }
}
