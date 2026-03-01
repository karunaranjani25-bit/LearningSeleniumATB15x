package com.thetestingacademy.ex03_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.WebElementToJsonConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium17_Mini_Project2_TagName {

    @Owner("Karuna")
    @Severity(SeverityLevel.BLOCKER)
    @TmsLink("https://bugzz.atlassian.net/browse/VWO-19")
    @Description("Verify that the error message comes with invalid email on signup page.")
    @Test
    public void vwo_free_trail_error_verify(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://vwo.com/free-trial/");

        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));

        WebElement email_inputbox = driver.findElement(By.name("email"));
        email_inputbox.sendKeys("abc");

        WebElement checkbox = driver.findElement(By.name("gdpr_consent_checkbox"));
        checkbox.click();

        WebElement button_create_account = driver.findElement(By.tagName("button"));
        button_create_account.click();

        WebElement error_msg = driver.findElement(By.className("invalid-reason"));


        //Assertion

        Assert.assertEquals(error_msg.getText(),"The email address you entered is incorrect.");

        driver.quit();

    }
}
