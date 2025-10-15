package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {
	public static void main (String [] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("login1")).sendKeys("login@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.name("proceed")).click();
		System.out.println("rediff login attempted successfully");
	}
	}


