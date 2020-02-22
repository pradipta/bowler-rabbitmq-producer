package com.pradipta.bowlerrabbitmqproducer;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(properties = {"spring.datasource.url=jdbc:mysql://localhost:3306/bowler"})
class BowlerRabbitmqProducerControllerApplicationTests {

	@Test
	void contextLoads() {
	}

}
