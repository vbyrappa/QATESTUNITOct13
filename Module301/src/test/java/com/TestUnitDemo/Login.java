package com.TestUnitDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException{
	
	System.setProperty("webdriver.chrome.driver", "driver\\Chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.get("https://www.edureka.co/");
	Thread.sleep(3000);
	
	Thread.sleep(15000);
	driver.close();
	
	System.out.println("Page launched and it got closed");
	}
}
