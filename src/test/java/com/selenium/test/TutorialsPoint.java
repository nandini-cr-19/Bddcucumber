package com.selenium.test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TutorialsPoint {
	public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("name"))).sendKeys("sudeep");
        driver.findElement(By.id("email")).sendKeys("sudeep@gmai.com");

        WebElement maleRadio = driver.findElement(By.id("gender"));
       
        maleRadio.click();
        driver.findElement(By.id("mobile")).sendKeys("5434543256");
        driver.findElement(By.id("subjects")).sendKeys("science");
        
        driver.findElement(
      
        		By.xpath("//label[text()='Reading']/preceding-sibling::input")).click();
        driver.findElement(By.xpath("//label[text()='Music']/preceding-sibling::input")).click();

        Select stateSelect = new Select(driver.findElement(By.id("state")));
        stateSelect.selectByVisibleText("Haryana");

        Select citySelect = new Select(driver.findElement(By.id("city")));
        citySelect.selectByVisibleText("Agra");

        System.out.println("Form automated successfully");

        driver.close();
    }
}
