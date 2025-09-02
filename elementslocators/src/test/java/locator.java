public class locator {
    public static void main(String[] args) {
        ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--remote-allow-origins=*"); //This line to fix Chrome Issue
        opt.addArguments("--disable-notifications");

    }
}
