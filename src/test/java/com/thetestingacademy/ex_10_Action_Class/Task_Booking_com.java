package com.thetestingacademy.ex_10_Action_Class;

import com.thetestingacademy.CommonToAll;
import com.thetestingacademy.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Task_Booking_com extends CommonToAll {

   @Test
   public void Booking_com() {

       WebDriver driver = new ChromeDriver();
       openBrowser(driver, "https://booking.com");

       waitForVisibility(driver,"//button[@aria-label = 'Dismiss sign-in info.']");
       WebElement close_popup = driver.findElement(By.xpath("//button[@aria-label = 'Dismiss sign-in info.']"));
       close_popup.click();

       WebElement flights_btn = driver.findElement(By.xpath("//a[@id = 'flights']"));
       flights_btn.click();

       Actions actions = new Actions(driver);

       WebElement to_loc = driver.findElement(By.xpath("//span[contains(text(),'Going to')]"));
       to_loc.click();

       WebElement to = driver.findElement(By.xpath("//input[@data-ui-name='input_text_autocomplete']"));
       WaitHelpers.waitJVM(3000);
       actions.moveToElement(to).click().sendKeys("DELHI")
               .keyDown(Keys.TAB)
               .keyDown(Keys.ENTER).build().perform();
       WaitHelpers.waitJVM(5000);

       WebElement search_btn = driver.findElement(By.xpath("//button[@data-ui-name='button_search_submit']"));
       search_btn.click();

       driver.quit();

   }

}
