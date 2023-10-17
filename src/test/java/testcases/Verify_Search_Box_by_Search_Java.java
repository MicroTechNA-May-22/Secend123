 package testcases;

import base.Base;

public class Verify_Search_Box_by_Search_Java extends Base {

	public static void main(String[] args) {
		
		setup();
		navigateURL();
	
		//driver.findElement(By.xpath( "//div[@class='collapse navbar-collapse mean-menu']/div/div/form/input[@name='q']" )).sendKeys("java");
		sendkeys("//div[@class='collapse navbar-collapse mean-menu']/div/div/form/input[@name='q']", "java");
		
		//driver.findElement(By.xpath("//div[@class='collapse navbar-collapse mean-menu']/div/div/form/button")).click();
		click("//div[@class='collapse navbar-collapse mean-menu']/div/div/form/button");
		
		
		tearDown(); 
		
	}

}
/*
Make 5 Project with 5 company
Make 4 Test cases for each company

*/