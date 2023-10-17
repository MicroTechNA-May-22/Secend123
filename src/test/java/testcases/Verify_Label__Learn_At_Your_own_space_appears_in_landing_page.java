package testcases;

import base.Base;

public class Verify_Label__Learn_At_Your_own_space_appears_in_landing_page extends Base {

	public static void main(String[] args) {
		setup();
		navigateURL();
		String s = getElementText("//h2[text()='Sky IT School Popular Courses']/preceding-sibling::span");
		
		//Verify the Text is "Experts Teachers"
		if ( s.contentEquals("LEARN AT YOUR OWN PACE") )
			System.out.println("LEARN AT YOUR OWN PACE - Pass");
		else
			System.out.println("LEARN AT YOUR OWN PACE - Fail");
		
		tearDown();
	}

}
