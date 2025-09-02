import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TagName {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.partialLinkText("Sortable")).click();
        WebElement table=driver.findElement(By.id("table1"));
        List<WebElement> tableRow= table.findElements(By.tagName("tr"));
        System.out.println(tableRow.size());
        

    }
}
