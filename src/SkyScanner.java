import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyScanner {
    public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        driver = invokeChromeBrowser();
        driver.manage().window().maximize();
        driver.get("https://www.turkishairlines.com");
        Thread.sleep(3000);
        driver.findElement(By.className("thyHeaderLink")).click();


    }
    public static WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\murat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }



}
