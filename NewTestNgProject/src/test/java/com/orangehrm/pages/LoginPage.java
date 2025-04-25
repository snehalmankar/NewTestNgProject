package com.orangehrm.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

  
    By username = By.name("username");
    By password = By.name("password");
    By loginButton = By.xpath("*//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']");
   
    By adminButton = By.xpath("(*//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]");
    By Adminusername = By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]");
    By dropdwnclick =  By.xpath("(//div[@class='oxd-select-text--after'])[1]");
    By selectdrpdwn = By.xpath("(//div[@role='option'])[2]");
    By Searchclk   =By.xpath("//div/button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']");
    By Recordfound = By.xpath("//div/span[@class='oxd-text oxd-text--span']");
    
    public void enterUsername(String uname) {
        driver.findElement(username).sendKeys(uname);
    }

    public void enterPassword(String pwd) {
        driver.findElement(password).sendKeys(pwd);
    }

    public void clickLogin() {
        driver.findElement(loginButton).click();
    }
     
    public void clickAdmin() {
        driver.findElement(adminButton).click();
    }

    
    public void Adminusername2(String suname) {
        driver.findElement(Adminusername).sendKeys(suname);
    }
    
    public void dropdwnclick() {
        driver.findElement(dropdwnclick).click();
    }
    
    public void selectdrpdwn() {
    	driver.findElement(selectdrpdwn).click();
    	 

      }
    public void Searchclk() {
    	driver.findElement(Searchclk).click();
    	 

      }
    public void Recordfound() {
    	driver.findElement(Recordfound).click();
    	 

      }
}
