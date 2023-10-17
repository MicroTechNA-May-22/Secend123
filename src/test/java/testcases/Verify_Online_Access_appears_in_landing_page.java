package testcases;

import base.Base;

public class Verify_Online_Access_appears_in_landing_page extends Base{

	public static void main(String[] args) {
		
		setup();
		
		//go to https://skyitschool.com
		//driver.get("https://skyitschool.com");
		
		navigateURL();
		
//		//Get the Text of that Element (H3) Online Access
//		WebElement element =  driver.findElement( 
//				By.xpath("//h3[text()='Online 24/7 Access']") );
//		//get the text of that element
//		String s = element.getText();
		
		//Get the Text of that Element (H3) Online Access and get the text of that element
		String s = getElementText("//h3[text()='Online 24/7 Access']");
		
		//Verify the Text is "Online 24/7 Access"
		if ( s.contentEquals("Online 24/7 Access") )
			System.out.println("Online 24/7 Access - Pass");
		else
			System.out.println("Online 24/7 Access - Fail");
		

		tearDown(); //close driver
	}

}
