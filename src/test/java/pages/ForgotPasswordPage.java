package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ForgotPasswordPage {

    public ForgotPasswordPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[text() = 'Üye Girişi']")
    public WebElement uyeGirisiButton;

    @FindBy(xpath = "//*[@id='uyegirisi_Email']")
    public WebElement firstEmailButton;


    @FindBy(xpath = "//*[@id='uyegirisi_Sifre']")
    public WebElement firstPasswordButton;


    @FindBy(xpath = "//*[text() = 'Şifremi Unuttum']")
    public WebElement forgotPasswordButton;


    @FindBy(xpath = "//*[@class = 'textform radius']")
    public WebElement secondEmailButton;


    @FindBy(xpath = "//*[@name = 'Gkodu']]")
    public WebElement securityCodeButton;

}
