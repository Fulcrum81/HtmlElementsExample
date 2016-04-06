import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MailPage;

import java.util.concurrent.TimeUnit;

/**
 * Created by vadimzubovich on 4/6/2016.
 */
public class MailRuTest {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://mail.ru/");

        driver.findElement(By.id("mailbox__login")).sendKeys("strong.zubovich");
        driver.findElement(By.id("mailbox__password")).sendKeys("ZXCvbn123!");
        driver.findElement(By.cssSelector("option[value='bk.ru']")).click();
        driver.findElement(By.id("mailbox__auth__button")).click();
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }


    @Test
    public void searchTest() throws InterruptedException {
        MailPage mailPage = new MailPage(driver);

        mailPage.search("Selenium");
        Thread.sleep(2000);
    }

    @Test
    public void goToContactsTest() throws InterruptedException {
        MailPage mailPage = new MailPage(driver);
        mailPage.gotoContacts();
        Thread.sleep(2000);
    }
}
