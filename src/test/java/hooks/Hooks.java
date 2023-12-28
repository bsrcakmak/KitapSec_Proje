package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

import java.time.Duration;

public class Hooks {

     /*
   Cucumber'da step definitions package'i içinde @Before @After gibi bir notasyon varsa
   extends testbase dememize gerek olmadan her senaryodan once ve/veya sonra bu methodlar calısacaktır.

   Bu da bizim isteyeceğimiz bir drum degildir.

   Cucumber'da @Before @After gibi bir notasyonları kulanma ihtiyacımız olursa
   bunu step definitions package'i içinde olusturacagımız Hooks clasına koyarız.


    Biz her senaryodan sonra test soucunu kontrol edip failed olan senaryolar icin
    screenshoot alması amacıyla @After methodunu kullanacagız
     */

    @Before
    public void before_ui(){
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        Driver.getDriver().manage().window().maximize();
    }

    @After
    public void tearDown() {
        Driver.closeDriver();
    }


}
