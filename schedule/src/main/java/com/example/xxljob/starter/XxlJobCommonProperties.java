package com.example.xxljob.starter;


import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Getter
@Setter
@ConfigurationProperties(prefix = XxlJobCommonProperties.PREFIX)
public class XxlJobCommonProperties {

    public static final String PREFIX = "frame.xxljob.task";

    @Value("spring.application.name")
    private String appName;

    private String accessToken;

    private String logPath;

    private List<String> executors;

    private int logRetentionDays = 30;

}
