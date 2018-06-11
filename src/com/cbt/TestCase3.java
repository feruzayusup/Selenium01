package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		/*
		 * open chrome
		 * http://newtours.demoaut.com
		 * enter username tutorial
		 * password" tutorial
		 * click on Sign in button
		 * verify title contains
		 * Expected find a flight
		 * 
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("http://testing-ground.scraping.pro/login");
		
		//findElement --> finds element on a page
		//locator 
		Thread.sleep(1000);
		driver.findElement(By.name("usr")).sendKeys("admin");
		Thread.sleep(1000);
		driver.findElement(By.name("pwd")).sendKeys("12345");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='submit']")).click();
//		driver.findElement(By.xpath("//input[@value='Login']")).click();

		
		Thread.sleep(1000);
		String expected = "welcome";
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
