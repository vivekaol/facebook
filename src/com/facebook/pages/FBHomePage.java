package com.facebook.pages; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
public class FBHomePage 
{ 
  WebDriver driver; 
public FBHomePage(WebDriver driver) 
{ 
  this.driver = driver; 
} 
By homepageTitle = By.xpath("//span[text() = 'Facebook']"); 
By userNavigationlevel = By.xpath("//div"); 
By logout = By.xpath("//text()[.='Log Out']/ancestor::span[1]"); 

public void homePageTitle() 
{ 
  //String getHomepageTitle = driver.findElement(homepageTitle).getText(); 
  //System.out.println("Home Page Title : " +getHomepageTitle); 
	String FBtitle = driver.getTitle();
	System.out.println("Page title is : " + FBtitle);
 } 
public void navigationLabel() 
{ 
   driver.findElement(userNavigationlevel).click(); 
 } 
public void logout() 
{ 
  driver.findElement(logout).click(); 
  System.out.println("Logout successfully"); 
 } 
}