package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	
	public static WebDriver driver; //default
	
	public static void setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
	}
	public static void navigateURL() {
		driver.get("https://skyitschool.com");
	}
	
	public static void click(String xpath) {
		driver.findElement(By.xpath( xpath )).click();
	}
	
	public static void sendkeys(String xpath, String value) {
		driver.findElement(By.xpath( xpath )).sendKeys( value  );
	}
	
	public static String getElementText(String v) {
		//Get the Text of that Element (H3) Online Access
		WebElement element =  driver.findElement(By.xpath( v ) );
		//get the text of that element
		String s = element.getText();	
		return s;
	}
	
	
	
	public static void tearDown() {
		driver.quit();
	}
}
