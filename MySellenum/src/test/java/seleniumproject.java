import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.MalformedURLException;

public class seleniumproject {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*"); //This line to fix Chrome Issue
        opt.addArguments("--disable-notifications");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(opt);
        driver.get("https://www.google.com/");
        driver.manage().window().fullscreen();
        String windowhandle =driver.getWindowHandle();
        System.out.println(windowhandle);
        //String sourcecode= driver.getPageSource();
        //System.out.println(sourcecode);
       /* Thread.sleep (3000);
        String googleurl= driver.getCurrentUrl();
        String googletitle= driver.getTitle();
        System.out.println("The google title is = "+googlteitle);

        System.out.println("The google url is = "+googleurl);
        driver.navigate().to("https://www.facebook.com/");
        String facebooktitle= driver.getTitle();
        String facebookurl= driver.getCurrentUrl();
        System.out.println("The facebook url is = "+facebookurl);
        System.out.println("The facebook title is = "+facebooktitle);
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        Thread.sleep (2000);
*/
        driver.quit();
    }
}
