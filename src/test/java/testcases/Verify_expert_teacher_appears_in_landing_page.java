package testcases;

import base.Base;


public class Verify_expert_teacher_appears_in_landing_page extends Base {
//	static WebDriver driver;
//	
//	public static void setup() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver(); 
//	}
	public static void main(String[] args) throws InterruptedException {

		setup();
		
		//go to https://skyitschool.com
		//driver.get("https://skyitschool.com");
		
		navigateURL();
		
//		//Get the Text of that Element (H3) Expert Teacher
//		WebElement element =  driver.findElement( 
//				By.xpath("//h3[text()='Experts Teachers']") );
//		//get the text of that element
//		String s = element.getText();
		
		String s = getElementText( "//h3[text()='Experts Teachers']" );
		
		
		//Verify the Text is "Experts Teachers"
		if ( s.contentEquals("Experts Teachers") )
			System.out.println("Experts Teachers - Pass");
		else
			System.out.println("Experts Teachers - Fail");
		
		Thread.sleep(10000);
		//driver.close(); //close current tab of browser
		//driver.quit(); //close the browser with all tab
		tearDown();
	}

}
