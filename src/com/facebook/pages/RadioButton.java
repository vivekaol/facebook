package com.facebook.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vivek\\eclipse-workspace\\facebook\\driver\\chromedriver.exe");
		
		driver.get("https://selenium08.blogspot.com/2019/08/radio-buttons.html");
		driver.manage().window().maximize();
		WebElement radioButton = driver.findElement(By.xpath("//input[@name='yellow']"));
		radioButton.click();
		
		if(radioButton.isSelected()) 
		{
			System.out.println("Radio button yellow is selected");
		}
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@name='red']")).click();
		
		WebElement anotherRadioBtn = driver.findElement(By.xpath("//input[@name='dhanbad']"));
		anotherRadioBtn.click();
		
		if(anotherRadioBtn.isSelected()) 
		{
			System.out.println("Radio button Dhanbad is selected");
		}
		
		
		driver.close();
		
	}

}
