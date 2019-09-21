import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {
   public static WebDriver driver;
    public static void main (String args[]){
    invokeChromeDriver();
    driver.get("https://www.facebook.com/");
    driver.findElement(By.name("firstname")).sendKeys("Pirik");
    driver.findElement(By.name("lastname")).sendKeys("Creek");




    }

    public static void invokeChromeDriver(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\murat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
    }



}
