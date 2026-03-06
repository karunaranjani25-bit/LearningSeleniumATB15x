package com.thetestingacademy.ex_06_WebTables;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_WebTable02 {

    public void addUser(WebDriver driver,String fn,String ln,String email,String age,String salary,String dept) throws InterruptedException {
       driver.findElement(By.xpath("//button[@id= 'addNewRecordButton']")).click();
       driver.findElement(By.xpath("//input[@id= 'firstName']")).sendKeys(fn);
       driver.findElement(By.xpath("//input[@id= 'lastName']")).sendKeys(ln);
       driver.findElement(By.xpath("//input[@id= 'userEmail']")).sendKeys(email);
       driver.findElement(By.xpath("//input[@id= 'age']")).sendKeys(age);
       driver.findElement(By.xpath("//input[@id= 'salary']")).sendKeys(salary);
       driver.findElement(By.xpath("//input[@id= 'department']")).sendKeys(dept);
       driver.findElement(By.xpath("//button[@id= 'submit']")).click();

        Thread.sleep(2000);
    }

    @Owner("Karuna")
    @Description("Webtable task 2")
    @Test
    public void Webtable02() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/webtables");
        Thread.sleep(3000);


        //adding users
        addUser(driver,"Test01","last","test01@example.com","20","2000","HR");
        addUser(driver,"Test02","test","test02@example.com","25","20000","Compliance");
        addUser(driver,"Test03","test","test03@example.com","30","10000","Legal");
        addUser(driver,"Test04","test","test04@example.com","23","6000","Insurance");
        addUser(driver,"Test05","test","test05@example.com","35","30000","Compliance");


        WebElement del_first_Legal_ele = driver.findElement(By.xpath("//table/tbody/tr/td[6][contains(text(),'Legal')]/following-sibling::td/div/span[@title='Delete']"));
        WebElement del_ele = driver.findElement(By.xpath("//table/tbody/tr/td[6][contains(text(),'Legal')]"));
        System.out.println(del_ele.getText());
        del_first_Legal_ele.click();

        Thread.sleep(5000);
        driver.quit();

    }
}
