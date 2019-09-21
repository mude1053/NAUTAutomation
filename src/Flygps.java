import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flygps {
    public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        String expectedText ="Sizin İçin Buradayız!";
        invokeChromeBrowser();
        driver.get("https://www.flypgs.com");
        Thread.sleep(2000);
   //   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div/div/label")).click();
        Thread.sleep(2000);
     //   driver.findElement(By.xpath("//*[@id='divHeaderCurrency']/div/div/div/div[1]/ul/li[5]/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(("/html/body/div[1]/div[3]/div/div/div/div[1]/ul/li[5]/a"))).click();
        Thread.sleep(2000);
        System.out.println("Validation: "+isTextTrue(expectedText));



    }
    public static void invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\murat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver =new ChromeDriver();
    }
    public static boolean isTextTrue(String expectedText){
       String resultValue = driver.findElement(By.xpath("/html/body/div[1]/section[4]/div/div/div[2]/div[3]/h2")).getText();
    return resultValue.equals(expectedText);
    }

}
