import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropsdown {
    public static  void main(String[] args){
        System.setProperty("Webdriver.chrome.driver", "/Users/m_308224/Desktop/keerti files/selenium notes/Imp Files/chromedriver");

         WebDriver driver=new ChromeDriver();
         driver.get("https://rahulshettyacademy.com/dropdownsPratices/");
         WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
         Select dropdown=new Select(staticdropdown);
         dropdown.selectByIndex(3);
         System.out.println(dropdown.getFirstSelectedOption().getText());
         dropdown.deselectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("INR");
         System.out.println(dropdown.getFirstSelectedOption().getText());


    }
}
