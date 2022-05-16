package com.techcenture;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class AutomationPracticeLogin {

    final static String URL = "https://automationpractice.com";
    final static String  EMAIL_ADDRESS = "kevin123@gmail.com";
    final static String  PASSWORD = "kevin123";

    public static void main(String[] args) throws InterruptedException {

        //this will set up the chrome driver before it is launched
        WebDriverManager.chromedriver().setup();

        //this will create an instance of a Chrome Browser
        WebDriver driver = new ChromeDriver();

        driver.get(URL);


        WebElement signInLink = driver.findElement(By.className("login"));
        signInLink.click();

        WebElement emailInput = driver.findElement(By.id("email"));
        emailInput.sendKeys(EMAIL_ADDRESS);

        WebElement passwdInput = driver.findElement(By.id("passwd"));
        passwdInput.sendKeys(PASSWORD);

        WebElement submitLoginBtn = driver.findElement(By.id("SubmitLogin"));
        submitLoginBtn.click();

        WebElement logoutLink = driver.findElement(By.className("logout"));
        logoutLink.click();

        Thread.sleep(3000);
        driver.close();



    }
}
