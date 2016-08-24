package com.it.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:appliactionContext.xml")
/**
 * ≤‚ ‘homeController
 * 
 * @author KAY
 *
 */
public class HomeControllerTestCase {

	@Autowired
	private HomeController homeController;

	@Test
	public void ShowHomePageTest() {
		String viewName = homeController.showHomePage();
	}
}
