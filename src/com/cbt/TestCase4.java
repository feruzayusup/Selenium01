package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver () ;
		
		
		driver.get("https://www.orbitz.com/");
		driver.findElement(By.xpath("//button[@type='button']")).click();       //this line is not working Why?
		driver.findElement(By.xpath("//button[@id='header-account-signin-button']")).click();
		driver.findElement(By.name("signin-loginid")).sendKeys("feruza_yusup@yahoo.com");		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Manzurahon1974");
		driver.findElement(By.xpath("//button[@id='submitButton']")).click();
		


	
	
	

	
		
		
		
		
		
		
		
	}

}
