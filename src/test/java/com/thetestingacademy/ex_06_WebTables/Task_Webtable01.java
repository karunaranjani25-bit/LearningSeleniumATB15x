package com.thetestingacademy.ex_06_WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Task_Webtable01 {

    @Owner("Karuna")
    @Description("orange hrm task")
    @Test
    public void orangehrm_terminate() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://awesomeqa.com/hr/web/index.php");
        Thread.sleep(5000);

        WebElement username = driver.findElement(By.xpath("//input[@name = 'username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@type= 'password']"));
        password.sendKeys("Hacker@4321");

        WebElement login_btn = driver.findElement(By.xpath("//button[@type= 'submit']"));
        login_btn.click();

        Thread.sleep(3000);

//        WebElement emp_list = driver.findElement(By.xpath("//a[contains(text(), 'Employee List')]"));
//        emp_list.click();

//        List<WebElement> terminated_emp = driver.findElements(By.xpath("//div[@role='row']/div[@role='cell']/div[text() = 'Terminated']"));
       //WebElement delete_btn = driver.findElement(By.xpath("//div[text() = 'Terminated']//ancestor::div[@role= 'row']//button[.//i[@class = 'oxd-icon bi-trash']]"));

        WebElement delete_btn = driver.findElement(By.xpath("//div[@role='row']/div[@role='cell']/div[text() = 'Terminated'][1]/ancestor::div[@role = 'row']/div[9]/div/button[@type='button']/i[@class='oxd-icon bi-trash'][1]"));

        delete_btn.click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        driver.quit();

    }
}


