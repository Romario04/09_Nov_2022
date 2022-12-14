package org.sel.com;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	
public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Users\\romar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.facebook.com/");
	    
	    //Explicitly Wait
	    
	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	    
	    driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
	    
	    WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
	    
	   element.sendKeys("Romario");
	    
}

}


