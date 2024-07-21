import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driverppts {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http//goggle.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}