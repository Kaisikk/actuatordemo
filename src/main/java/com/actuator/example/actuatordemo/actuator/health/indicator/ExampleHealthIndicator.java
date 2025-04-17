package com.actuator.example.actuatordemo.actuator.health.indicator;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class ExampleHealthIndicator implements HealthIndicator {
    @Override
    public Health health() {
        int test = (int) (Math.random() * 2) + 1;
        if (test == 1) {
            return Health.down().withDetail("Example Indicator Error", test).build();
        }
        return Health.up().build();
    }
}
