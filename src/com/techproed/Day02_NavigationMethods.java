package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_NavigationMethods {
    public static void main(String[] args) {
        //Java projemize, chromedriver e gitmesini soyledik
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        // driver imiz ekrani kapliyor
        webDriver.manage().window().maximize();

        //// drivere a google.com a gitmesini soyledik
        webDriver.get("https://google.com");

        // get methodu ile ayni islemi yapiyor.
        webDriver.navigate().to("http://amazon.com");

        // navigate().back() methodu bir onceki sayfaya geri donmeye yariyor
        webDriver.navigate().back();

        // navigate().forward() methodu geri geldiginiz sayfaya gitmeye yarar
        // Ornek: google -> amazon -> amazon dan google a geri geldik
        // eger forward yaparsak, amazona geri gideriz
        webDriver.navigate().forward();

        // navigate().refresh() methodu sayfayi yenilememizi sagliyor
        webDriver.navigate().refresh();
    }
}
