import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SecondTestNg {


        WebDriver driver;
        @BeforeTest
        public void openBrowser() throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.navigate().to("https://www.google.com/");
            Thread.sleep(3000);
        }
        @AfterTest
        public void closeBrowser(){
            driver.quit();
        }
        @Test
        public void signup() {
            System.out.println("signup");
        }
        @Test
        public void login(){
            System.out.println("login");
        }
        @Test
        public void search (){
            System.out.println("search");
        }
        @Test
        public void add() {
            System.out.println("add to cart");
        }
        @Test
        public void logout() {
            System.out.println("logout");
        }

    }

