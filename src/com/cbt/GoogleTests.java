package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {
	
	public static void main(String[] args) {
		
		/*
		 * test case 1 
				1. open chrome
				2. go to url www.goole.com
				3. verify title
				4. Expected result should be : google
		 */
		
		
		//		1. Open Chrome
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
		//create driver object				
		//2. got to url www.google.com
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");
		
		//3. Verify title   Expected Google
		
		String expected = "Google";
		String actual = driver.getTitle();
		
		if(expected.equals(actual)) {
		System.out.println("pass");
		}else
			System.out.println("fail");
		System.out.println("Expected : \t" + expected);
		System.out.println("Actual : \t" + actual);
		
		
		/*
		 * 
		 * test case 2 verify  url
			1. open chrome
			2. go to cybertekschool.com
			3. verify url www.cybertekschool.com
			4. verify url contains
			expected sybertekschool
		 */
		
		
		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://www.cybertekschool.com");
		
		String expected1 = "cybertekschool";
		String actual1 = driver1.getCurrentUrl();
		
		if(expected1.contains(actual1)) {
			System.out.println("pass");
		}else
			System.out.println("fail");
		System.out.println("Expected : \t" + expected1);
		System.out.println("Actual : \t" + actual1);
		}
		
		
	}


