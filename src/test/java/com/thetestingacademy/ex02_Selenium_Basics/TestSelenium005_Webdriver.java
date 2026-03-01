package com.thetestingacademy.ex02_Selenium_Basics;
import org.openqa.selenium.*;

import org.openqa.selenium.chrome.ChromeDriver;

public class TestSelenium005_Webdriver {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sdet.live");

    }
}
