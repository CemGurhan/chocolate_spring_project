package com.bnta.chocolate;



import com.bnta.chocolate.controllers.ChocolateController;
import com.bnta.chocolate.models.Chocolate;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ChocolateApplicationTests {



	@Autowired
	private ChocolateController chocolateController;

	@Test
	void contextLoads() {
	}

	@Test
	void cocoaGreaterThan60(){
		
	}

	
}
