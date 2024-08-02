package com.task9;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que3wikipedia {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver=new ChromeDriver();
		
	     driver.navigate().to("https://www.wikipedia.org/");
					 
		 //implicit with synchronization
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 driver.manage().window().maximize();
		 
		 //locate an element
		 Thread.sleep(2000);
		 WebElement searchelement=driver.findElement(By.id("searchInput"));
		 
		 //type the input in text box
    	 searchelement.sendKeys("Artificial Intelligence ",Keys.ENTER);
    	 
    	 //click on history
    	 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//div[@class='mw-heading mw-heading2'])[5]")).click();
		 
		 //print title
		 String url=driver.getTitle();
		 System.out.println("Title of website "+ url);
		 

	}

}

