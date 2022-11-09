package org.sel.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {

	public static void main(String[] args) {
    System.setProperty("webdriver.chrome.driver", 
    		"C:\\Users\\romar\\eclipse-workspace\\Selenium\\Driver\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.amazon.in/");
    
    List<WebElement> tagA = driver.findElements(By.xpath("//a"));
//    System.out.println(tagA.size());
    
    int count = 0;
    
    for (WebElement webE : tagA) {
		String attribute = webE.getAttribute("href");
		if(attribute!=null) {
		System.out.println(attribute);
		}
		count++;
	}
    
    System.out.println(count);
    
    
	}

}
