package com.example.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component
@Data
@Getter
@Setter
@ConfigurationProperties("limits-service")
public class LimitsConfig {
	
	private int minimum;
	private int maximum;

}
