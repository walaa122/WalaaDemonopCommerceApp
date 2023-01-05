package org.example.walaastepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;
    @Before
    public void openBrowser(){
         System.setProperty("webdriver.chrome.driver", "E:\\android development\\Walaa-demonopcommerce\\src\\main\\resources\\chromedriver.exe");
         driver = new ChromeDriver();

         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
         driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public void quitDriver() throws InterruptedException{
        Thread.sleep(4000);
        driver.quit();
    }
}
