package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

			public static void main(String[] args) throws InterruptedException {
				
				// set system properties
				
				System.setProperty("webdriver.chrome.driver", 
						"C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
				
				//create driver object				
			WebDriver driver1 = new ChromeDriver();
			driver1.get("http://www.google.com");

			WebDriver driver2 = new ChromeDriver();
			driver2.get("http://www.hsihouston.org");
			
			WebDriver driver3 = new ChromeDriver();
			driver3.get("http://www.ebay.com");
			}

		}
		
		
		
		
	


