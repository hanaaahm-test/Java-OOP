package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {

        ChromeDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Goto Website
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("Test automation"+ Keys.ENTER);
        driver.findElement(By.className("VuuXrf")).click();
    }
}