package org.sel.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {
	
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.chrome.driver", 
	    		"C:\\Users\\romar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
	    
	    WebDriver driver = new ChromeDriver();
	    driver.get("https://www.instagram.com/");
	    
	    //PageLoad Timeout
	    driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
	    
	    //Implicitily Wait
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    
	    driver.findElement(By.name("username")).sendKeys("Romario");
	    
	    
		}

}
