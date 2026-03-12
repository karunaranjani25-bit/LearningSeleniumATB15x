package com.thetestingacademy.ex_10_Action_Class;

import com.thetestingacademy.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_Booking_com extends CommonToAll {

   @Test
   public void Booking_com() {

       WebDriver driver = new ChromeDriver();
       openBrowser(driver, "https://booking.com");

       WebElement flights_btn = driver.findElement(By.xpath("//a[@id = 'flights']"));
       flights_btn.click();

       WebElement from_loc = driver.findElement(By.xpath("//input[@data-ui-name ='input_text_autocomplete']"));
       from_loc.click();



   }

}
