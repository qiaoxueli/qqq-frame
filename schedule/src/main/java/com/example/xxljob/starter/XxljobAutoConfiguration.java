package com.example.xxljob.starter;

import com.xxl.job.core.executor.XxlJobExecutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@ConditionalOnClass(XxlJobExecutor.class)
@EnableConfigurationProperties(XxlJobCommonProperties.class)
public class XxljobAutoConfiguration {

    @ConditionalOnProperty(prefix = XxlJobCommonProperties.PREFIX, name = "enable", matchIfMissing = true)
    @ConditionalOnMissingBean
    @Bean
    public XxlJobExecutor xxlJobExecutor(XxlJobCommonProperties properties) {
        log.info("--------------");
        XxlJobExecutor executor = new XxlJobExecutor();
        executor.setAccessToken(properties.getAccessToken());
        executor.setLogPath(properties.getLogPath());
        executor.setLogRetentionDays(properties.getLogRetentionDays());
        executor.setAppname(properties.getAppName());
        return executor;
    }


}
