package com.chandu.design.patterns.ioc;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class IocDesignPatternApplicationTests {

	// Injecting the Vehicle class into the Test Class
	@Autowired
	Vehicle vehicle;

	@Test
	void testpayment() {

		vehicle.produce();
	}

}
