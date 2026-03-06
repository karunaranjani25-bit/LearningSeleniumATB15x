package com.thetestingacademy.ex_06_WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task_CSS_Selector_Waits {

    @Description("Css selectors and waits")
    @Owner("Karuna")
    @Test
    public void test_Css_and_Wait(){

        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vwo.com/#/login");
        driver.manage().window().maximize();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement email = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-username")));
        email.sendKeys("admin@admin.com");
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#login-password")));
        password.sendKeys("admin");
        WebElement signin_Btn = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#js-login-btn")));
        signin_Btn.click();

        WebElement err = driver.findElement(By.cssSelector(".notification-box-description"));
        wait.until(ExpectedConditions.visibilityOf(err));

        String err_msg = driver.findElement(By.cssSelector(".notification-box-description")).getText();

        System.out.println(err_msg);

        Assert.assertEquals(err_msg,"Your email, password, IP address or location did not match");

        driver.quit();
    }

}
