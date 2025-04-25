package com.orangehrm.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.*;
import java.util.concurrent.TimeUnit;




public class BaseClass {
	 protected static WebDriver driver;
   
	@SuppressWarnings("deprecation")
	public void setUp() throws InterruptedException {
      //  WebDriverManager.ChromeDriver().setup();
    	
    	driver= new ChromeDriver();
    	
        driver.manage().window().maximize();
   
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
      //m n  WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        System.out.println("test timeout start .............");
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("test timeout start");
        
     
        System.out.println("timeout start done");
   
           }

//    public void tearDown() {
//       if (driver != null) {
//           driver.quit();
//        }
    }

