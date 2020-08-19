package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver webDriver = new ChromeDriver();

        webDriver.get("http://facebook.com");
// -----------------------------------------------------------------------
        String title = webDriver.getTitle();
        if(title.toLowerCase().equals("facebook")){
            System.out.println("Sayfa basligi 'facebook' ");
        }else{
            System.out.println("Baslik :"+title);
        }
// -----------------------------------------------------------------------
        String url = webDriver.getCurrentUrl();
        if(url.toLowerCase().contains("facebook")){
            System.out.println("Url 'facebook' kelimesini iceriyor");
        }else{
            System.out.println("Url :"+url);
        }
// -----------------------------------------------------------------------
        webDriver.navigate().to("https://www.walmart.com/");

        String title2 =webDriver.getTitle();
        if(title2.toLowerCase().contains("Walmart.com")){
            System.out.println("Sayfa basligi 'Walmart.com' iceriyor ");
        }else {
            System.out.println("Sayfa basligi 'Walmart.com' icermiyor ");
        }
// ---------------------------------------------------------------------
        webDriver.navigate().back();
        webDriver.navigate().refresh();
        webDriver.manage().window().maximize();
        webDriver.quit();
    }
}
