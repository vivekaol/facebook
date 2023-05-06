package com.facebook.tests; 
import com.facebook.pages.FBHomePage; 
import com.facebook.pages.FBLoginPage; 
import java.io.IOException; 
import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestBase 
{ 
// Declare WebDriver reference variable and make it static. 
     public static WebDriver driver = null; 

// Declare @BeforeTest annotation that will execute method before running each unit test. 
   @BeforeTest 
   public void basicSetUp() throws IOException 
   { 
     driver = new ChromeDriver(); 

// To maximize browser. 
     driver.manage().window().maximize(); 

// Implicit wait. 
     driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 

// Open Facebook page. 
     driver.get("https://www.facebook.com"); 
 }
// Declare @Test annotation and set priority equal to 0. 
   @Test(priority = 0) 
   public void login() 
   { 
// Create an object of FBLoginPage class and pass WebDriver reference to its constructor. 
     FBLoginPage fblogin = new FBLoginPage(driver); 

// Call loginData() method using reference variable fblogin and pass username and password as an input parameter. 
    fblogin.loginData("8383070187", "12345@qwerty"); 
} 
// Declare another @Test annotation and set priority equal to 1. 
   @Test(priority = 1) 
   public void home() 
   { 
// Create an object of FBHomePage and pass WebDriver reference to its constructor. 
      FBHomePage fbhome = new FBHomePage(driver); 
      fbhome.homePageTitle(); 

// Calling homePageTitle() method using reference variable fbhome. 
      //fbhome.navigationLabel(); 

// Calling navigationLabel() method. 
      fbhome.logout(); // Calling logout() method. 
} 
// Declare @AfterTest annotation that will execute method after running each unit test. 
   @AfterTest
   public void closingTest() 
   { 
     TestBase.driver.quit(); 
   } 
}