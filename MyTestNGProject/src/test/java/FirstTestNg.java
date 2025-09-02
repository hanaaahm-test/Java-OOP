import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstTestNg {
    ChromeDriver driver;
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.facebook.com/");
        Thread.sleep(3000);
    }
    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }
    @Test (priority = 1)
    public void signup() {
        System.out.println("signup");
    }
    @Test (priority = 2)
    public void login(){
        System.out.println("login");
    }
    @Test (priority = 3)
    public void search (){
        System.out.println("search");
    }
    @Test (priority = 4)
    public void add() {
        System.out.println("add to cart");
    }
    @Test (priority = 5)
    public void logout() {
        System.out.println("logout");
    }

}
