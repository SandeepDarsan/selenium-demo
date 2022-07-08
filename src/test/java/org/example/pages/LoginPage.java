package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;

    //Locators

    private String email = "//label[text()='Email']/..//input";
    private String password = "//label[text()='Password']/..//input[@name='password']";

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement loginEmail(){
        return driver.findElement(By.xpath(email));
    }

    public WebElement loginPassword(){
        return driver.findElement(By.xpath(password));
    }


    public void Login(String email, String password){
        loginEmail().sendKeys(email);
        loginPassword().sendKeys(password);
    }
}
