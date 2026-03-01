package com.thetestingacademy.ex02_Selenium_Basics;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium003 {

    public static void main(String[] args) {

        //Selenium 3 -
        //System.getProperty("webdriver.gecko.driver","/path/geckdriver");

        FirefoxDriver driver = new FirefoxDriver();
        // new FirefoxDriver(); - This START of the Selenium Session
        // Session - Fresh copy of browser is started!.
        // POST request to the Server - Firefox Driver.

        driver.get("https://sdet.live");
        // Commmand number 2 - POST request to give to the driver to navigate to a URL

    }
}
