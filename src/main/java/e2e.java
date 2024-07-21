import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2e {
    public static void main(String[] arg) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.spicejet.com");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA'] "));
        driver.findElement(By.cssSelector(".ui-state-default.-state-highlight.ui-state-active")).click();
        driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount'")).click();
        System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());
        if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
        {
            System.out.println("its enabled");
            Assert.assertTrue(false);
        }
        else
        {
            Assert.assertTrue(true);
        }
        for(int i=1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"4 Adult");
        WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdown=new Select(staticdropdown);
        dropdown.selectByIndex(3);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();




    }


    }

