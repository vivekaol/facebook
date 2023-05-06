package com.facebook.pages; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver; 
public class FBLoginPage 
{ 
// Create WebDriver reference variable. 
     WebDriver driver; 

// Create a constructor and pass WebDriver reference. 
   public FBLoginPage(WebDriver driver) 
   { 
     this.driver = driver; 
   } 
// Identify web elements using locators by By.xpath. 
   //By titleText = By.xpath("//a[@title = 'Go to Facebook home']"); 
   By username = By.xpath("//input[@id = 'email']"); 
   By password = By.xpath("//input[@id = 'pass']"); 
   By login = By.xpath("//button[@name = 'login']"); 

// Create a method to perform operations on each web element. 
  /* public void titleText() 
   { 
      //String getText = driver.findElement(titleText).getText(); 
      //System.out.println("Title of Facebook Login Page: " +getText); 
   
   if(getText.equalsIgnoreCase("Facebook")) 
   { 
     System.out.println("Title is successfully verified"); 
   } 
   else { 
       System.out.println("Something went wrong"); 
   } 
  } */
public void setUsername(String strUsername) 
{ 
   driver.findElement(username).sendKeys(strUsername); 
 } 
public void setPassword(String strPassword) 
{ 
   driver.findElement(password).sendKeys(strPassword); 
} 
public void loginClick() 
{ 
   driver.findElement(login).click(); 
} 
public void loginData(String strUsername, String strPassword) 
{ 
   //this.titleText(); 
   this.setUsername(strUsername); 
   this.setPassword(strPassword); 
   this.loginClick(); 
  } 
}