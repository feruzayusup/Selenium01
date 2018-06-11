package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AnotherTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		
	WebDriver driver = new ChromeDriver();
	//navigate().to == get();   -----> this is for interview
	
	driver.navigate().to("http://www.cybertekschool.com");
	
	String expected = "cybertekschool";
	
	//get the URL of website
	String actual = driver.getCurrentUrl();
	
	if(actual.contains(expected)) {
		System.out.println("pass");
	}else {
		System.out.println("fail");
	System.out.println("actual : " + actual );
	System.out.println("expected: " + expected);
	}
	
	Thread.sleep(1000); //keeps open for 1 second
	driver.navigate().to("http://google.com");
	
	Thread.sleep(1000);
	driver.navigate().back(); //goes back

	Thread.sleep(1000);

	driver.navigate().forward(); //goes forward in browsing history
	
	Thread.sleep(1000);
	driver.navigate().refresh();
	driver.close();   //closes the current tab
//	driver.quit(); closes all windows
		
		
		
	}

}
