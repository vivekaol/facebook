package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\eclipse-workspace\\facebook\\driver\\chromedriver.exe");
		
		driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		driver.manage().window().maximize();
		WebElement green = driver.findElement(By.xpath("//input[@name='green']"));
		if(green.isEnabled() ) 
		{
			System.out.println("Radio button green is enabled");
		}
		else
		{
			System.out.println("Radio button green is not enabled");
		}
		
		
		if(!green.isSelected() && green.isEnabled() ) 
		{
			green.click();
			System.out.println("Radio button Green is selected");
		}
		
				
		driver.close();
		
	}

}
