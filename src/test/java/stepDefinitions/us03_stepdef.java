package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ForgotPasswordPage;
import utilities.ConfigReader;
import utilities.Driver;

public class us03_stepdef {

    ForgotPasswordPage forgotPasswordPage = new ForgotPasswordPage();

    @Given("Kullanıcı belirtilen url'e gider")
    public void kullanıcıBelirtilenUrlEGider() {

        Driver.getDriver().get(ConfigReader.getProperty("kitapsec_url"));
    }

    @When("Kullanıcı Üye Girişi butonuna tıklar")
    public void kullanıcıÜyeGirişiButonunaTıklar() {

        forgotPasswordPage.uyeGirisiButton.click();
    }

    @And("Kullanıcı açılan kutucukta email bilgisini girer")
    public void kullanıcıAçılanKutucuktaEmailBilgisiniGirer() {

        forgotPasswordPage.firstEmailButton.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı açılan kutucukta şifre bölümünü boş bırakır")
    public void kullanıcıAçılanKutucuktaŞifreBölümünüBoşBırakır() {

        forgotPasswordPage.firstEmailButton.sendKeys("");
    }

    @And("Kullanıcı Şifremi Unuttum butonuna tıklar")
    public void kullanıcıŞifremiUnuttumButonunaTıklar() {

        forgotPasswordPage.forgotPasswordButton.click();

    }

    @And("Kullanıcı yeni sayfada E-Posta bölümüne tıklar")
    public void kullanıcıYeniSayfadaEPostaBölümüneTıklar() {

        forgotPasswordPage.secondEmailButton.click();

    }

    @And("Kullanıcı sistemde kayıtlı olan E-Posta adresini yazar")
    public void kullanıcıSistemdeKayıtlıOlanEPostaAdresiniYazar() {

        forgotPasswordPage.secondEmailButton.sendKeys(ConfigReader.getProperty("email"));
    }

    @And("Kullanıcı Güvenlik Kodu bölümüne tıklar")
    public void kullanıcıGüvenlikKoduBölümüneTıklar() {

        forgotPasswordPage.securityCodeButton.click();
    }

    @And("Kullanıcı sayfada gördüğü güvenlik kodunu ilgili kutuya yazar")
    public void kullanıcıSayfadaGördüğüGüvenlikKodunuIlgiliKutuyaYazar() {

    }


    @And("Kullanıcı Devam Et butonuna tıklar")
    public void kullanıcıDevamEtButonunaTıklar() {
    }

    @And("Kullanıcı kendi email adresine gider")
    public void kullanıcıKendiEmailAdresineGider() {
    }

    @And("Kullanıcı siteden gelen aktivasyon kodunu kopyalar")
    public void kullanıcıSitedenGelenAktivasyonKodunuKopyalar() {
    }

    @And("Kullanıcı tekrar Kitap Sec sitesine döner")
    public void kullanıcıTekrarKitapSecSitesineDöner() {
    }

    @And("Kullanıcı açılan sayfada Aktivasyon Kodu bölümüne tıklar ve kopyaladığı kodu yapıştırır")
    public void kullanıcıAçılanSayfadaAktivasyonKoduBölümüneTıklarVeKopyaladığıKoduYapıştırır() {
    }

    @And("Kullanıcı Email bölümüne tıklar ve sistemdeki mailini yazar")
    public void kullanıcıEmailBölümüneTıklarVeSistemdekiMailiniYazar() {
    }

    @And("Kullanıcı Yeni Şifreniz bölümüne tıklar ve valid bir değer yazar")
    public void kullanıcıYeniŞifrenizBölümüneTıklarVeValidBirDeğerYazar() {
    }

    @And("Kullanıcı Şifre Tekrarı bölümüne tıklar ve yeni şifreyi tekrar yazar")
    public void kullanıcıŞifreTekrarıBölümüneTıklarVeYeniŞifreyiTekrarYazar() {
    }

    @And("Kullanıcı Güvenlik Kodu bölümüne tıklar ve sayfada bulunan güvenlik kodunu yazar")
    public void kullanıcıGüvenlikKoduBölümüneTıklarVeSayfadaBulunanGüvenlikKodunuYazar() {
    }

    @And("Kullanıcı Onaylıyorum butonuna tıklar")
    public void kullanıcıOnaylıyorumButonunaTıklar() {
    }

    @Then("Kullanıcı Tebrikler mesajının görünürlüğünü doğrular")
    public void kullanıcıTebriklerMesajınınGörünürlüğünüDoğrular() {
    }
}
