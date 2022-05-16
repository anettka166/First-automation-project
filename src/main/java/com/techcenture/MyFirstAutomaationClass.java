package com.techcenture;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class MyFirstAutomaationClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Which browser would you like to use?: ");
        String browser = scanner.nextLine();

        WebDriver driver = null;
        switch (browser){

            case "chrome":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eva\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new ChromeDriver();
               break;

            case "firefox":
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eva\\Downloads\\chromedriver_win32\\chromedriver.exe");
                driver = new FirefoxDriver();
                break;
            default:
                System.out.println("Invalid browser");

        }

/*

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Eva\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://amazon.com");

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headless bluetooth headset");

        driver.findElement(By.xpath("//input[@value='Go]")).click();

        driver.close();

*/

    }
}
