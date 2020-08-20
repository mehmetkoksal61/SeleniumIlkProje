package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day04_LocatorGiris {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("http://a.testaddressbook.com/");

        WebElement signInLink = driver.findElement(By.id("sign-in"));
        signInLink.click();

        WebElement emailKutusu = driver.findElement(By.className("form-control"));
        emailKutusu.sendKeys("testtechproed@gmail.com");

        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("Test1234!");

        WebElement sigNin = driver.findElement(By.name("commit"));
        sigNin.click();
    }
}
