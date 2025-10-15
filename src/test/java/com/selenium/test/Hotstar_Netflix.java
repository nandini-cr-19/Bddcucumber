package com.selenium.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hotstar_Netflix {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.hotstar.com");
		Thread.sleep(2000);
		System.out.println(" title" +driver.getCurrentUrl());
		System.out.println("hotstar"+driver.getTitle());

		driver.navigate().to("https://www.netflix.com");
		driver.navigate().back(); 
		driver.navigate().forward();
		driver.navigate().refresh();
		System.out.println("Window Handles: " + driver.getWindowHandles());

		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.manage().window().minimize();
		Thread.sleep(1000);
		driver.manage().window().fullscreen();

		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.google.com");
		//		        driver.close();
		//		        driver.quit();	
	} 
}
