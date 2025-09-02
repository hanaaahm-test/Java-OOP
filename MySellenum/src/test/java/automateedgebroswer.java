import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.net.MalformedURLException;

public class automateedgebroswer {
        public static void main(String[] args) throws MalformedURLException, InterruptedException {
            ChromeOptions opt= new ChromeOptions();
            opt.addArguments("--remote-allow-origins=*"); //This line to fix Chrome Issue
            opt.addArguments("--disable-notifications");
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver(opt);
            driver.get("https://the-internet.herokuapp.com/login");
          /*  driver.findElement(By.id("username")).sendKeys("tomsmith");
            driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");*/
            driver.findElement(By.name("username")).sendKeys("tomsmith");
            driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
            driver.findElement(By.className("radius")).click();
            Thread.sleep (2000);
            driver.quit();
        }
}
