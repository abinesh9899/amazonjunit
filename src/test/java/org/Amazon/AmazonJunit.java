package org.Amazon;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AmazonJunit extends MainClass {
	
	@BeforeClass
	public static void Before_Class() {
		Browser_Launch("https://www.amazon.in/");
	}
	@Test
	
	public void TC_1() throws InterruptedException {
	  WindowMax();
	  Thread.sleep(3000);
	}
	@Test
	public void TC_2() {
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		SendKeys(element, "Iphone17");
	}
	@Test
	public void Button() {
		WebElement clk = driver.findElement(By.xpath("(//input[@class='nav-input nav-progressive-attribute'])[2]"));
		Button_Click(clk);
	}
	@AfterClass
	public static void After_Class() {
		Browser_Close();
	}
	
	private void added() {
		System.out.println("QA");

	}

}
