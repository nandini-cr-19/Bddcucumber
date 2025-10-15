package com.selenium.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver1 =new ChromeDriver();
		driver1.get("https://sweetalert2.github.io/");
		Thread.sleep(2000);
        driver1.findElement(By.xpath("//button[normalize-space()='Show normal alert']")).click();
        Alert alert = driver1.switchTo().alert();
		System.out.println("text in the alert is "+ alert.getText());
		
		alert.accept();
		System.out.println("Alert accepted");
//        driver1.quit();
		
        }

}
