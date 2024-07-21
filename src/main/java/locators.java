import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class locators {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webDriver.driver.chromeDriver","Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("kee");
        driver.findElement(By.name("inputPassword")).sendKeys("hello123");
        driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
        driver.findElement(By.linkText("Forgot  your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("anu");
        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@crc.com");
        driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
        driver.findElement(By.cssSelector("input[placeholder='Email']:nth-child(3)")).sendKeys("anu@yahoo.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("8172634376");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        driver.findElement(By.cssSelector("from p")).getText();
        driver.findElement(By.xpath("//div[@class=forgot-pwd-container]/button[1]"));
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("kee");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.id("chkboxOne")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();




    }
}
