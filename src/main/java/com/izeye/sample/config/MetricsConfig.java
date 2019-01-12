package com.izeye.sample.config;

import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.micrometer.core.instrument.Clock;
import io.micrometer.core.instrument.logging.LoggingMeterRegistry;
import io.micrometer.core.instrument.logging.LoggingRegistryConfig;

/**
 * Configuration for metrics.
 *
 * @author Johnny Lim
 */
@Configuration
public class MetricsConfig {

	@Bean
	public LoggingMeterRegistry loggingMeterRegistry() {
		return new LoggingMeterRegistry(new LoggingRegistryConfig() {

			@Override
			public String get(String key) {
				return null;
			}

			@Override
			public Duration step() {
				return Duration.ofSeconds(5);
			}

		}, Clock.SYSTEM);
	}

}