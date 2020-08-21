package com.techproed;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Day05_Xpath02 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("http://a.testaddressbook.com/");

        // tagName ile ekrandaki yaziyi bulalim
        WebElement tagName = driver.findElement(By.tagName("h1"));
        System.out.println(tagName.getText());

        //xpath ile bulalim. Sadece tagname yazmak yeterlidir
        WebElement welcomeYazisi = driver.findElement(By.xpath("//h1"));
        System.out.println(welcomeYazisi.getText());
    }
}
