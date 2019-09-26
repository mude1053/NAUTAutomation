import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SkyScanner {
    public static WebDriver driver;
    public static void main(String args[]) throws InterruptedException {
        password();
        driver = invokeChromeBrowser();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("laylaylom@gmail.com");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("");
        driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div/div/div/form/div[3]/button")).click();


    }
    public static WebDriver invokeChromeBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\murat\\Downloads\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }
    public static void password(){
        String[] pass;
        char a=0;
        for (int i=0; i<10; i++) {
            double random = Math.random()*256;
            int randInt =(int)random;
            a = (char) random;
        }
    }


}
