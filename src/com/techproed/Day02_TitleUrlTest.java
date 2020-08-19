package com.techproed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day02_TitleUrlTest {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver" , "C:\\Users\\w2345\\Documents\\selenium dependencies\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("http://youtube.com");
        String youtubeTitle = driver.getTitle();
        if(youtubeTitle.contains("Video")){
            System.out.println("Video kelimesini iceriyor.");
        }else{
            System.out.println("Video kelimesini ICERMIYOR.");
        }
    }
}