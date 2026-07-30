package org.Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MainClass {
	
	public static WebDriver driver;
	
	public static void Browser_Launch(String URL) {
		 driver = new ChromeDriver(); 
		
		driver.get(URL);
		
	}
	
	public static void WindowMax() {
		driver.manage().window().maximize();
		
	}
	
	
	public static void SendKeys(WebElement ele, String Input) {
		ele.sendKeys(Input);
		
	}
	
	public static void Button_Click(WebElement ele) {
		ele.click();
	}
	
	public static void Browser_Close(){
		driver.quit();
		
	}

}
