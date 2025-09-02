package com.example;

import com.aventstack.extentreports.ExtentTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)
public class SearchInGoogle
{
    @DataProvider(name="testdata")
    public Object[][]getData()
    {
        return new Object[][]{
                {"java course"},
                {"selenium course"},
                {"test automation course"},
                {"Manual Test Worshops"}
        };
    }

   @Test(dataProvider = "testdata")
    public void SearchResult(String text) throws InterruptedException
   {   ChromeDriver driver;
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.navigate().to("https://www.google.co.uk/");
       driver.findElement(By.name("q")).sendKeys(text+ Keys.ENTER);
       System.out.println("you searched about : "+text);
       Thread.sleep(3000);
       driver.quit();

   }
  }
