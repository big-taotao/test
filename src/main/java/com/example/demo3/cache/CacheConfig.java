package com.example.demo3.cache;

import org.springframework.boot.autoconfigure.cache.CacheProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;

@Configuration
public class CacheConfig {

    @Bean
    public CacheProperties cacheProperties() {
        final CacheProperties cacheProperties = new CacheProperties();
        cacheProperties.setCacheNames(CacheNames.list());
        final CacheProperties.Redis redis = cacheProperties.getRedis();
        redis.setCacheNullValues(false);
        redis.setUseKeyPrefix(true);
        redis.setTimeToLive(Duration.ofMillis(30));
        return cacheProperties;
    }

}
