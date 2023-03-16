package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public static WebDriver webDriver;
    public LoginPage(WebDriver webDriver){
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//h1[@class='text-4xl']")
    private WebElement loginPage;

    public boolean verifyLoginPage(){
        loginPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//form[@class='flex flex-col gap-2 ']/div[1]//input[@class='bg-transparent text-[16px] h-4 outline-none ']")
    private WebElement userName;

    public void setUserName(String dataUser){
        userName.sendKeys(dataUser);
    }

    @FindBy(xpath = "//form[@class='flex flex-col gap-2 ']/div[2]//input[@class='bg-transparent text-[16px] h-4 outline-none ']")
    private WebElement password;

    public void setPassword(String dataPass){
        password.sendKeys(dataPass);
    }

    @FindBy(xpath = "//button[@class='w-24 h-10 bg-blue text-white rounded-lg']")
    private WebElement loginButton;

    public void setLoginButton(){
        loginButton.click();
    }

    @FindBy(xpath = "//h1[@class='text-center']")
    private WebElement landingPage;

    public boolean verifyDashboardPage(){
        landingPage.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//input[@id='remember']")
    private WebElement remember;

    public void setRemember(){
        remember.click();
    }
}


