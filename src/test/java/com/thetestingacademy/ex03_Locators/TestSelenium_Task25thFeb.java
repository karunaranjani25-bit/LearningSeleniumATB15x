package com.thetestingacademy.ex03_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.*;

public class TestSelenium_Task25thFeb {

    @Owner("Karuna")
    @Description("Selenium Katalon Mini Project")

    @Test
    public void TestKatalon() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        WebElement make_appointment = driver.findElement(By.linkText("Make Appointment"));
        make_appointment.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.tagName("button"));
        login_btn.click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(),"https://katalon-demo-cura.herokuapp.com/#appointment");

        String title_makeappointment = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(title_makeappointment,"Make Appointment");

        driver.quit();


    }

}
