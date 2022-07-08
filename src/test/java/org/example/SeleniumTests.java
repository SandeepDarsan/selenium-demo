package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumTests {

    private WebDriver driver;

    @BeforeEach
    public void setUp(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(chromeOptions);
        driver.manage().deleteAllCookies();
        driver.get("https://www.phptravels.net/login");
    }

    @Test
    public void sampleTest() throws InterruptedException {
        System.out.println("Sample web test using JUnit");
        LoginPage login = new LoginPage(driver);
        login.Login("user@phptravels.com","demouser");
        Thread.sleep(5000);
    }


    @AfterEach
    public void tearDown(){
        driver.close();
        driver.quit();
    }
}
