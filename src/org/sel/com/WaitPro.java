package org.sel.com;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitPro {
	
public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Users\\romar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://demo.automationtesting.in/Register.html");
	    
	    //Explicitly Wait
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    //alertIsPresent
//	    driver.findElement(By.xpath("//button[@onclick='alertbox()']")).click();
//	    wait.until(ExpectedConditions.alertIsPresent());
//	    Alert alert = driver.switchTo().alert();
//	    alert.accept();
	    
	    //elementToBeClickable
//	    WebElement btn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@onclick='alertbox()']")));
//	    btn.click();
	    
	    //elementToBeSelected
//	    wait.until(ExpectedConditions.elementToBeSelected(By.xpath("//input[@value='Male']")));
	    
	    //titleContains
	    
	    
	    
	    
	    
	    
}

}
