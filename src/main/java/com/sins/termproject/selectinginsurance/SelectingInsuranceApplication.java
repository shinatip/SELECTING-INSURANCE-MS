package com.sins.termproject.selectinginsurance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootConfiguration
@ComponentScan(basePackages = "com.sins.termproject.selectinginsurance")
@EntityScan(basePackages = "com.sins.termproject.selectinginsurance")
public class SelectingInsuranceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SelectingInsuranceApplication.class, args);
	}

}
