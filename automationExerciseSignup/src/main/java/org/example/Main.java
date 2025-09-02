package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeDriver driver;
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        //Goto Website
        driver.navigate().to("https://automationexercise.com/");
        driver.manage().window().maximize();
        //Signup-Login Page
        driver.findElement(By.linkText("Signup / Login")).click();
        //Goto Signup page
        driver.findElement(By.name("name")).sendKeys("Hanaa");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("hanaahmed5486@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
        //Fill data
        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("password")).sendKeys("hana86@2025");
        driver.findElement(By.id("first_name")).sendKeys("Hanaa");
        driver.findElement(By.id("last_name")).sendKeys("Fahmy");
        driver.findElement(By.id("address1")).sendKeys("cairo,Egypt");
        driver.findElement(By.id("country")).sendKeys("United States");
        driver.findElement(By.id("state")).sendKeys("New York");
        driver.findElement(By.id("city")).sendKeys("New York");
        driver.findElement(By.id("zipcode")).sendKeys("12345");
        driver.findElement(By.id("mobile_number")).sendKeys("0394029994");
        driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div[1]/form/button")).click();

        //driver.findElement(By.name("Signup")).click();
//        driver.findElement(By.name("q")).sendKeys(text+ Keys.ENTER);
//        System.out.println("you searched about : "+text);
        Thread.sleep(5000);
        //driver.quit();
    }
}