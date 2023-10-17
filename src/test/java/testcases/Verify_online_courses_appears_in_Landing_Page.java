package testcases;


import base.Base;



public class Verify_online_courses_appears_in_Landing_Page extends Base {
//	static int          age;
//	static WebDriver driver; //driver declaration
//
//	public static void setup() {
//		int age=67; //local variable
//		WebDriverManager.chromedriver().setup();
//		//WebDriver driver;
//		driver = new ChromeDriver(); //driver instantiation
//	}

	public static void main(String[] args) {
		//Verify_online_courses_appears_in_Landing_Page a;
		//a = new Verify_online_courses_appears_in_Landing_Page();
		//a.age = 6;
		//age =6;
		//System.out.println(age);
//		WebDriverManager.chromedriver().setup();
//		WebDriver driver;
//		driver = new ChromeDriver();
		setup();
		//go to https://skyitschool.com
		//driver.get("https://skyitschool.com");
		navigateURL();
//		//Get the Text of that Element (H3) online course
//		//locate that element
//		WebElement element = driver.findElement(By.xpath("//h3[text()='Online Courses']"));
//		//get the text of that element
//		String s = element.getText();

		String s = getElementText( "//h3[text()='Online Courses']" );
		
		
		//Verify the Text is "Online Courses"
		//if (s=="") x
		if ( s.contentEquals("Online Courses") )
			System.out.println("Pass");
		else
			System.out.println("Fail");
		
		//driver.quit();
		tearDown();
	}//main
	
	

}//class
