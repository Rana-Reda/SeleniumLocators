package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ID_Name_Classname {

    public static void main(String[] args) throws InterruptedException {
        //1-bridge between code and browser
        String value=System.getProperty("user.dir")+"\\Browsers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",value);
        //2-create new web driver object

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver=new ChromeDriver(options);
        //3-configuration to browser
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //4-navigate to website
        String url="https://the-internet.herokuapp.com/login";
        driver.navigate().to(url);


        //5-test steps
        //step1: enter valid username
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        //step2:enter valid password
        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword!");
        //step3:login
        driver.findElement(By.className("radius")).click();

        //6-quit driver
        Thread.sleep(3000);
        driver.quit();

    }
}
