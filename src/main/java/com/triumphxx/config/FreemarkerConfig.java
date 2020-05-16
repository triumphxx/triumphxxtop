package com.triumphxx.config;


import com.triumphxx.template.HotsTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class FreemarkerConfig {

    @Autowired
    private freemarker.template.Configuration configuration;


    @Autowired
    HotsTemplate hotsTemplate;

    @PostConstruct
    public void setUp() {
        configuration.setSharedVariable("hots", hotsTemplate);
    }

}
