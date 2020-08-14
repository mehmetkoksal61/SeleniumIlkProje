package com.techproed;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day02_TitleUrlTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("http://youtube.com");

        if(driver.getTitle().contains("Video")){
            System.out.println("VAR :"+driver.getTitle());
        }else{
            System.out.println("YOK :"+driver.getTitle());
        }
        driver.close();

    }
}
