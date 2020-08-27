package StepDefinition;

import io.cucumber.java.cs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.event.ItemEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class MyStepdefs {
    WebDriver driver;
    @Given("^user is on login page$")
    public void user_is_on_login_page() {
        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Driver\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://www-qa2.safeway.com/account/sign-in.html#error=login_required");
    }

    @Given("^user is able to enter credentials and press login button$")
    public void user_is_able_to_enter_credentials_and_press_login_button() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.name("userId")).sendKeys("garapatisaisujith@gmail.com");
        driver.findElement(By.name("inputPassword")).sendKeys("Safeway01");
        driver.findElement(By.id("btnSignIn")).click();
        driver.findElement(By.id("skip-main-content")).sendKeys("108200133");
        driver.findElement(By.xpath("//button[@class='search-nav__icon searchBtn svg-icon-search-grey']//*[local-name()='svg']")).click();
        driver.findElement(By.id("addButton_108200133")).click();
        driver.findElement(By.id("inc_qtyInfo_108200133")).click();
        driver.findElement(By.id("skip-main-content")).clear();
        driver.findElement(By.id("skip-main-content")).sendKeys("960112214");
        driver.findElement(By.xpath("//button[@class='search-nav__icon searchBtn svg-icon-search-grey']//*[local-name()='svg']")).click();
        driver.findElement(By.id("addButton_960112214")).click();
        driver.findElement(By.id("inc_qtyInfo_960112214")).click();
        driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M6.0002856')]")).click();
        //Set<String> handles = driver.getWindowHandles();
        //driver.switchTo().window(child_window);
        // driver.switchTo().alert().accept();
        driver.findElement(By.className("primary-btn btn btn-default modal-checkout modal-checkout-enabled")).click();
        driver.findElement(By.className("btn btn-block btn-default primary-background-color")).click();
        driver.findElement(By.cssSelector("div.erums-main div.main-wrapper.modal-hide:nth-child(1) div.move-up:nth-child(3) div.top-level.container-fluid.pb-5.cart-list div.row div.col-lg-9.col-12.order-2.order-0.order-sm-2.pl-0.cart-item-list div.card.mx-2 div.card-body div.row div.mt-1.col-12.mb-4:nth-child(2) div.card.bT0.border div.row.box-padding div.col-lg-12 fieldset.row.mb-5:nth-child(3) div.col-12 div.mb-4.radioSlotPadding.dug-wrapper:nth-child(5) div:nth-child(1) div.radio-btn > label.time-label")).click();
        driver.findElement(By.className("btn btn-block btn-default primary-background-color")).click();
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Then("^user is navigated to the login page$")
    public void user_is_navigated_to_the_login_page() {
        //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
       // driver wait = new ChromeDriver(driver,30);
        String title = driver. getTitle();
        System.out.println(title);
       // Assert.assertEquals("Home - Online Grocery Delivery | Safeway", title);
    }
}
