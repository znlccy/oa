package com.youda.oa.health;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class User implements HealthIndicator {

    @Override
    public Health health() {
        return Health.up().withDetail("client", "100").build();
    }
}
