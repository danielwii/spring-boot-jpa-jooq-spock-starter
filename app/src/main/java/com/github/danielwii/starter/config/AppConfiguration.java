package com.github.danielwii.starter.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.Clock;

@Slf4j
@Configuration
public class AppConfiguration {

    public static final String TAG = "APP";

    @PostConstruct
    public void init() {
        log.debug("[{}] System zone is: [{}]", TAG, Clock.systemDefaultZone());
    }

}
