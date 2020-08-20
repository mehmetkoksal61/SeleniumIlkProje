package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day_Tekrar01 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        driver.manage().window().maximize();
        driver.navigate().to("http://a.testaddressbook.com/");

        WebElement seinIn = driver.findElement(By.id("sign-in"));
        seinIn.click();

        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("testtechproed@gmail.com");

        WebElement sifre = driver.findElement(By.name("session[password]"));
        sifre.sendKeys("Test1234!");

        WebElement sign = driver.findElement(By.name("commit"));
        sign.click();

    }
}
