package com.thetestingacademy.ex_04_Xpath;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class TestSelenium21_MiniProject {

    @Owner("Karuna")
    @Severity(SeverityLevel.CRITICAL)
    @Description("Verify Login is working")
    @Test
    public void Test_OHRM_login() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
        WebElement password = driver.findElement((By.xpath("//input[@name = 'password']")));
        WebElement Login_btn = driver.findElement(By.xpath("//button"));

        username.sendKeys("admin");
        password.sendKeys("Hacker@4321");
        Login_btn.click();

        Thread.sleep(3000);

        WebElement h6 = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));

        Assert.assertEquals(h6.getText(),"PIM");

        List<WebElement> imgs = driver.findElements(By.xpath("//img"));
        imgs.get(1).click();

        driver.quit();


    }
}
