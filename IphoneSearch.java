package AllegroSearch;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class IphoneSearch {
    private WebDriver driver;
    private WebDriverWait wait;

    @Before

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @After

    public void quitDriver() {
        driver.close();
        driver.quit();
    }

    @Test

    public void searchTest() {
        wait = new WebDriverWait(driver, 10);

        driver.get("https://allegro.pl/");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//img[@class='mjyo_6x mse2_40 meqh_en msa3_z4 m0s5_e6 mg9e_4 mvrt_4 mj7a_4 mh36_4 isflp mupj_5k']")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='string']")))).sendKeys("Iphone 11");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//fieldset[10]//div[1]//ul[1]//li[1]//label[1]")))).click();

        int numberIphone = driver.findElements(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-listing-layout:nth-child(2) div._e219d_2xK5A div._1yyhi._e219d_2fgnH:nth-child(2) div._3kk7b._otc6c._19orx._e219d_3S9Lf:nth-child(1) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ey:nth-child(2) div.opbox-sheet._26e29_11PCu.card._9f0v0.msts_n7 div._9c44d_378hD section._9c44d_3pyzl div.mpof_ki.mqen_m6.mp7g_oh.mh36_0.mvrt_0.mg9e_8.mj7a_8.m7er_k4._1y62o._9c44d_1I1gg div.mpof_ki.myre_zn._9c44d_1Hxbq:nth-child(2) div._9c44d_3AMmE:nth-child(2) div.mpof_92.myre_zn:nth-child(1) div.msa3_z4._9c44d_2K6FN > span._1svub._lf05o")).size();
        System.out.println("Number of displayed Iphone 11: " + numberIphone);

        driver.navigate().refresh();

        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-listing-layout:nth-child(2) div._e219d_2xK5A div._1yyhi._e219d_2fgnH:nth-child(2) div._3kk7b._otc6c._19orx._e219d_3S9Lf:nth-child(1) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ey:nth-child(2) div.opbox-sheet._26e29_11PCu.card._9f0v0.msts_n7 div._9c44d_378hD section._9c44d_3pyzl div.mpof_ki.mqen_m6.mp7g_oh.mh36_0.mvrt_0.mg9e_8.mj7a_8.m7er_k4._1y62o._9c44d_1I1gg div.mpof_ki.myre_zn._9c44d_1Hxbq:nth-child(2) div._9c44d_3AMmE:nth-child(2) div.mpof_92.myre_zn:nth-child(1) div.msa3_z4._9c44d_2K6FN > span._1svub._lf05o")));
        List<WebElement> priceElements = driver.findElements(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-listing-layout:nth-child(2) div._e219d_2xK5A div._1yyhi._e219d_2fgnH:nth-child(2) div._3kk7b._otc6c._19orx._e219d_3S9Lf:nth-child(1) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ey:nth-child(2) div.opbox-sheet._26e29_11PCu.card._9f0v0.msts_n7 div._9c44d_378hD section._9c44d_3pyzl div.mpof_ki.mqen_m6.mp7g_oh.mh36_0.mvrt_0.mg9e_8.mj7a_8.m7er_k4._1y62o._9c44d_1I1gg div.mpof_ki.myre_zn._9c44d_1Hxbq:nth-child(2) div._9c44d_3AMmE:nth-child(2) div.mpof_92.myre_zn:nth-child(1) div.msa3_z4._9c44d_2K6FN > span._1svub._lf05o"));
        for (int i = 0; i < priceElements.size(); i++){
            System.out.println(priceElements.get(i).getText());
        }

        Select sortIphone = new Select(driver.findElement(By.xpath("//select[@class='_1h7wt _k70df _7qjq4 _27496_3VqWr']")));
        sortIphone.selectByVisibleText(" cena: od najwyższej ");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-listing-layout:nth-child(2) div._e219d_2xK5A div._1yyhi._e219d_2fgnH:nth-child(2) div._3kk7b._otc6c._19orx._e219d_3S9Lf:nth-child(1) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ey:nth-child(2) div.opbox-sheet._26e29_11PCu.card._9f0v0.msts_n7 div:nth-child(2) div:nth-child(4) div._9c44d_378hD section._9c44d_3pyzl > article:nth-child(1)")));
        List<WebElement> priceMax = driver.findElements(By.cssSelector("div.main-wrapper:nth-child(3) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_k4:nth-child(2) div.opbox-sheet._26e29_11PCu div.opbox-listing-layout:nth-child(2) div._e219d_2xK5A div._1yyhi._e219d_2fgnH:nth-child(2) div._3kk7b._otc6c._19orx._e219d_3S9Lf:nth-child(1) div.opbox-sheet-wrapper.m7er_k4.munh_56.m3h2_56._26e29_2AYAm.mjru_ey:nth-child(2) div.opbox-sheet._26e29_11PCu.card._9f0v0.msts_n7 div._9c44d_378hD section._9c44d_3pyzl div.mpof_ki.mqen_m6.mp7g_oh.mh36_0.mvrt_0.mg9e_8.mj7a_8.m7er_k4._1y62o._9c44d_1I1gg div.mpof_ki.myre_zn._9c44d_1Hxbq:nth-child(2) div._9c44d_3AMmE:nth-child(2) div.mpof_92.myre_zn:nth-child(1) div.msa3_z4._9c44d_2K6FN > span._1svub._lf05o"));
        for (int i = 0; i < priceMax.size(); i++) {
            System.out.println("Requested Iphone11 " + priceMax.get(i).getText());
            String priceMaxElement = priceMax.get(i).getText().replace(" zł", "").replace(" ", "").replace(",", ".");
            Double.parseDouble(priceMaxElement);
            double PriceVat = Double.parseDouble(priceMaxElement) * 0.23 + Double.parseDouble(priceMaxElement);
            System.out.println(("Price increased by vat " + PriceVat + "zł"));
        }
    }
}
