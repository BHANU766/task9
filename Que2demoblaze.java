package com.task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2demoblaze {

	public static void main(String[] args) {
		
		       //to check you have landed on the correct page or not
		
				WebDriver driver=new ChromeDriver();
				
			    driver.get("https://www.demoblaze.com/");
			    
			    driver.manage().window().maximize();
			    
			    //get title
			    String title=driver.getTitle();
		        //condition
			    if(title.equals("STORE")) {
			    	System.out.println("page landed on the correct website");	    	
			    }else {
			    	System.out.println("page not landed on the correct website");
			    }
			    

	}

}
