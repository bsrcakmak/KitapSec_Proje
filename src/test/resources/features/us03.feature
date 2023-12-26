@KitapSec_us03
  Feature: US03_KitapSec
    Background: sifremi_unuttum_butonuna_git
      Given Kullanıcı belirtilen url'e gider
      When Kullanıcı Üye Girişi butonuna tıklar
      And Kullanıcı açılan kutucukta email bilgisini girer
      And Kullanıcı açılan kutucukta şifre bölümünü boş bırakır
      And Kullanıcı Şifremi Unuttum butonuna tıklar

    Scenario: TC01_unutulan_sifreyi_yenileme
      And Kullanıcı yeni sayfada E-Posta bölümüne tıklar
      And Kullanıcı sistemde kayıtlı olan E-Posta adresini yazar
      And Kullanıcı Güvenlik Kodu bölümüne tıklar
      And Kullanıcı sayfada gördüğü güvenlik kodunu ilgili kutuya yazar
      And Kullanıcı Devam Et butonuna tıklar
      And Kullanıcı kendi email adresine gider
      And Kullanıcı siteden gelen aktivasyon kodunu kopyalar
      And Kullanıcı tekrar Kitap Sec sitesine döner
      And Kullanıcı açılan sayfada Aktivasyon Kodu bölümüne tıklar ve kopyaladığı kodu yapıştırır
      And Kullanıcı Email bölümüne tıklar ve sistemdeki mailini yazar
      And Kullanıcı Yeni Şifreniz bölümüne tıklar ve valid bir değer yazar
      And Kullanıcı Şifre Tekrarı bölümüne tıklar ve yeni şifreyi tekrar yazar
      And Kullanıcı Güvenlik Kodu bölümüne tıklar ve sayfada bulunan güvenlik kodunu yazar
      And Kullanıcı Onaylıyorum butonuna tıklar
      Then Kullanıcı Tebrikler mesajının görünürlüğünü doğrular