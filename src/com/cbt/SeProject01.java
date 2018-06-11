package com.cbt;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeProject01 {

	public static <WebElement> void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Feruza\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
		
		
		driver.findElement(By.name("ctl00$MainContent$username")).sendKeys("Tester");
		
		driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");

		driver.findElement(By.name("ctl00$MainContent$login_button")).click();

		driver.findElement(By.name("aspnetForm")).click();

		driver.findElement(By.xpath("//a[@href='Process.aspx']")).click();
		

		String midName = "abcdefghijklmnopqrstuvwxyz";
		String randomString="";
		int length = 5;
		int number=1;
		int number1=1;
		Random rand = new Random();

		char [] text = new char [length];
		for (int i=0; i<length; i++) {
			text[i]=midName.charAt(rand.nextInt(midName.length()));
		}
		for (int i=0; i<text.length; i++) {
			randomString +=text[i];
		}
		
		
			number= number + 1+rand.nextInt(750000);
			number1= number1 + 1+rand.nextInt(100_000_000);
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtName")).sendKeys("John " + randomString.toUpperCase() + " Smith");//name
		
		
		
		
		
		String street = "abcdefghijklmnopqrstuvwxyz";
		String randomString1="";
		int num=1;
		Random rand1 = new Random();

		char [] street1 = new char [length];
		for (int i=0; i<length; i++) {
			text[i]=street.charAt(rand1.nextInt(street.length()));
		}
		for (int i=0; i<text.length; i++) {
			randomString1 +=text[i];
		}
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity")).sendKeys("2");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox2")).sendKeys("123 " + randomString1.toUpperCase());
		
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox3")).sendKeys("Missouri City");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox4")).sendKeys("Texas");
		driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox5")).sendKeys(""+number);
	
		
				String card = "" + ((int)(Math.random() * ((2 - 0) + 1)) + 0);
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_" + card)).click();
			
		
				if (card.equals("0")) {
					String CardIndex = "4";
					for (int i = 0; i < 15; i++) {
						CardIndex += ((int)(Math.random() * ((9 - 0) + 1)) + 0);	
					}
					driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(CardIndex);
				} else if (card.equals("1")) {
					String CardIn5 = "5";
					for (int i = 0; i < 15; i++) {
						CardIn5 += ((int)(Math.random() * ((9 - 0) + 1)) + 0);	
					}
					driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(CardIn5);
				} else {
					String CardIn3 = "3";
					for (int i = 0; i < 14; i++) {
						CardIn3 += ((int)(Math.random() * ((9 - 0) + 1)) + 0);	
					}
					driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox6")).sendKeys(CardIn3);
				}
				driver.findElement(By.name("ctl00$MainContent$fmwOrder$TextBox1")).sendKeys("16/25");
			
				driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();
		

                Thread.sleep(2000);
                		String expected = "New order has been successfully added.";
                		String text3 = driver.findElement(By.tagName("body")).getText();
                		if (text3.contains(expected)) {
                			System.out.println("pass");
                		} else {
                			System.out.println("fail");
                			System.out.println("Expected:\t" + expected);
                		}
                		
//				
				
				
				
	}

}

