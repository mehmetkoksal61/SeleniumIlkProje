package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day_Tekrar021 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();

        driver.navigate().to("http://a.testaddressbook.com/");

        WebElement signInPutonu = driver.findElement(By.id("sign-in"));
        signInPutonu.click();

        WebElement email = driver.findElement(By.className("form-control"));
        email.sendKeys("testtechproed@gmail.com");


    }
}
