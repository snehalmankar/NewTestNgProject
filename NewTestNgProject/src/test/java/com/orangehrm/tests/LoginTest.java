package com.orangehrm.tests;

import java.sql.Driver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;

import com.orangehrm.base.BaseClass;
import com.orangehrm.pages.LoginPage;

public class LoginTest extends BaseClass {

    @BeforeMethod
    public void setUpDriver() throws InterruptedException {
        setUp();
    }

    @Test(groups="login")
    public void testLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLogin();
       
        loginPage.clickAdmin();
   
        loginPage.Adminusername2("admin");
        loginPage.dropdwnclick();
        loginPage.selectdrpdwn();
        loginPage.Searchclk();
        loginPage.Recordfound();
        
       
        // Add assertions to verify login success
        System.out.println("Login test completed successfully.");
    }

//    @AfterMethod
//    public void closeDriver() {
//        tearDown();
//    }
}
