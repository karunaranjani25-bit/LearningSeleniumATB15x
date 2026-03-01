package com.thetestingacademy.ex03_Locators;

import io.qameta.allure.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSelenium_ProjectTTA {

    @Owner("Karuna")
    @Description("Project TTA Bank")

    @Test
    public void TTA_Bank() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://tta-bank-digital-973242068062.us-west1.run.app/");



        WebElement Signup_btn = driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]"));
        Signup_btn.click();

        WebElement full_name = driver.findElement(By.xpath("//input[@type='text']"));
        full_name.sendKeys("Karuna");

        WebElement email_inputbox = driver.findElement(By.xpath("//input[@type = 'email']"));
        email_inputbox.sendKeys("karuna@ttabank.com");

        WebElement password_inputbox = driver.findElement(By.xpath("//input[@type = 'password']"));
                password_inputbox.sendKeys("P@ssw0rd");

        WebElement create_account_btn = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
        create_account_btn.click();
        Thread.sleep(5000);

        WebElement transfer_funds_btn = driver.findElement(By.xpath("//button[normalize-space()='Transfer Funds']"));
        transfer_funds_btn.click();

        WebElement amount = driver.findElement(By.xpath("//input[@type='number']"));
        amount.sendKeys("5000");

        WebElement continue_btn = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
        continue_btn.click();

        WebElement confirm_transfer_btn = driver.findElement(By.xpath("//button[normalize-space()='Confirm Transfer']"));
        confirm_transfer_btn.click();

        WebElement dashboard = driver.findElement(By.xpath("//button[normalize-space()='Dashboard']"));
        dashboard.click();

        Thread.sleep(5000);

        WebElement tot_bal = driver.findElement(By.xpath("//h3[@class = 'mt-2 text-3xl font-bold']"));
        System.out.println(tot_bal.getText());

        Assert.assertEquals(tot_bal.getText(), "$45,000.00");

        driver.quit();
    }

}
