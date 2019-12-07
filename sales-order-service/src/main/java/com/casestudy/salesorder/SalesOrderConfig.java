package com.casestudy.salesorder;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix="sales-order-service")
@Component
public class SalesOrderConfig {

	private String fallbackmessage;

	public String getFallbackmessage() {
		return fallbackmessage;
	}

	public void setFallbackmessage(String fallbackmessage) {
		this.fallbackmessage = fallbackmessage;
	}
}
