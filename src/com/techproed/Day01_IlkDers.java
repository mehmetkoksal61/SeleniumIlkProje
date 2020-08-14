package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day01_IlkDers {
    public static void main(String[] args) {

        //Java projemize' chromedirveri tanittik.

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");

        //webDriver nesnesi olusturarak, chrome driveri kullanabilir hale getirdik
        WebDriver webDriver = new ChromeDriver();

        //driverimize google.com a gitmesini soyledik.
        webDriver.get("https://www.google.com");

        //driverimizde acik olan pencereyi kapatir
        // webDriver.close();

        //driverimizi komple kapatir
        webDriver.quit();


    }
}

