package org.example.pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class UserPage {
    public static WebDriver webDriver;

    public UserPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//div[.='User']")
    private WebElement userMenu;
    public void clickUserMenu(){
        userMenu.click();
    }

    @FindBy(xpath = "//label[@class='btn bg-[#19345E]']")
    private WebElement addNew;
    public void setAddNew(){
        addNew.click();
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[1]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement nama;
    public void setNama(String inputNama){
        nama.sendKeys(inputNama);
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[2]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement email;
    public void setEmail (String inputEmail){
        email.sendKeys(inputEmail);
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[3]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement password;

    public void setPassword(String inputPassword){
        password.sendKeys(inputPassword);
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[4]//select[@class='mb-3 select select-bordered w-full max-w-xs']")
    private WebElement team;
    public void setTeam(String inputTeam){
        Select a = new Select(team);
        a.selectByVisibleText(inputTeam);
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[5]//select[@class='mb-3 select select-bordered w-full max-w-xs']")
    private WebElement status;
    public void setStatus(String inputStatus){
        Select a = new Select(status);
        a.selectByVisibleText(inputStatus);
    }

    @FindBy(xpath = "//label[@class='btn bg-[#19345E] w-20 flex gap-2']")
    private WebElement save;
    public void setSave(){
        save.click();
    }

    @FindBy(xpath = "//td[.='riski']")
    private WebElement user;
    public boolean verifyUser(){
        user.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//td[.='riski']")
    private WebElement user2;
    public boolean verifyUser2(){
        user2.getSize();
        return false;
    }

    @FindBy(xpath = "//label[@class='btn bg-white border-[#19345E] text-[#19345E] hover:bg-[#19345E] hover:text-white w-20 flex gap-2']")
    private WebElement cancelButton;

    public void setCancelButton(){
        cancelButton.click();
    }


    @FindBy(css = "tbody > tr:nth-of-type(2) .text-green-600")
    private WebElement editButton;

    public void setEditButton(){
        editButton.click();
    }

    @FindBy(xpath = "//table[@class='w-full']/tr[1]//input[@class='mb-3 input input-bordered w-full max-w-xs']")
    private WebElement editName;

    public void setEditName(String inputName){
        editName.sendKeys(inputName);
    }

    @FindBy(xpath = "//input[@value='sarah@gmail.com']")
    private WebElement editEmail;
    public void setEditEmail(String inputEmail){
        editEmail.sendKeys(inputEmail);
    }

    @FindBy(xpath = "//label[@class='btn bg-white border-[#19345E] text-[#19345E] hover:bg-[#19345E] hover:text-white w-20 flex gap-2']")
    private WebElement editCancelButton;
    public void setEditCancelButton(){
        editCancelButton.click();
    }

    @FindBy(xpath = "//label[@class='btn bg-[#19345E] w-20 flex gap-2']")
    private WebElement editSaveButton;
    public void setEditSaveButton(){
        editSaveButton.click();
    }

    @FindBy(xpath = "//p[@class='text-right']")
    private WebElement newName;
    public boolean setNewName(){
        newName.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//p[@class='text-right']")
    private WebElement page;
    public boolean verifyPageCancel(){
        page.isDisplayed();
        return true;
    }

    @FindBy(xpath = "//input[@class='input w-full max-w-[150px]']")
    private WebElement search;
    public void setSearch(String inputSearch){
        search.sendKeys(inputSearch);
    }

    @FindBy(xpath = "//tbody[1]//td[1]")
    private WebElement searchResult;

    public boolean setSearchResult(){
        searchResult.isDisplayed();
        return true;
    }

    @FindBy(css = "tbody > tr:nth-of-type(2) .text-green-600")
    private WebElement delete;

    public void setDelete(){
        delete.click();
    }
}
