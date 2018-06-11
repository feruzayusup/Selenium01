package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahoogaKirish {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty ("webdriver.chrome.driver", "C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
			
		/*
		 * open chrome
		 * http://yahoo.com
		 * enter username "osiyo5789@gmail.com"
		 * password "osiyohon11"
		 * click on Sign in button
		 * verify title contains
		 * Expected find a flight
		 * 
		 */
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/login");
		driver.findElement(By.name("username")).sendKeys("rav_yusup@yahoo.com");
		driver.findElement(By.name("signin")).click();
		

		
		
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("Missouri1974");
//		driver.findElement(By.xpath("//input[@id='login-passwd']")).sendKeys("Missouri1974");
//		driver.findElement(By.name("password")).sendKeys("Missouri1974");
		driver.findElement(By.name("verifyPassword")).click();

		Thread.sleep(2000);
		String expected = "Yahoo";
		String actual = driver.getTitle();
		if(actual.contains(expected)) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
			System.out.println("actual : " + actual);
			System.out.println("expected : " + expected );
			Thread.sleep(1000);

		}
		driver.close();
		
		
		
	}

}
