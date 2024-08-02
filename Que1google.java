package com.task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Que1google {

	public static void main(String[] args) throws InterruptedException {
		
		//create a driver instance
		WebDriver driver=new FirefoxDriver();
		
	    //to maximize
		driver.manage().window().maximize();
		 
		//navigate to google website
		driver.navigate().to("https://www.google.com/");
		
		//print the url of current title
		String currenturl=driver.getCurrentUrl();
		System.out.println("Current url"+currenturl);
		
		Thread.sleep(3000);
		
		//reload the page
		driver.navigate().refresh();
		
		driver.close();
		
				 

	}

}
