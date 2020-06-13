package com.springbasics.properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SomeExternalService {

    private static Logger LOGGER = LoggerFactory.getLogger(SomeExternalService.class);

    @Value("${external.service.url}")
    private String url;

    public String returnServiceURL(){
        LOGGER.info("Returned URL: {}", this.url);
        return this.url;
    }
}
