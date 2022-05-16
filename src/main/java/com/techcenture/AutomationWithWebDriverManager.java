package com.techcenture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutomationWithWebDriverManager {
    public static void main(String[] args) throws InterruptedException {
        
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();


        driver.navigate().to("https://amazon.com");

        driver.get("https://yahoo.com");
        driver.get("https://google.com");

        driver.get("https://automationpractice.com");

        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().forward();


        Thread.sleep(3000);

        driver.close();

        driver.quit();


        
        
        
    }
    
}
