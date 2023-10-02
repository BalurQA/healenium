import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.CheckoutPage;

import static org.testng.Assert.assertTrue;

/**
 * Project Name    : healenium-demo
 * Developer       : Osanda Deshan
 * Version         : 1.0.0
 * Date            : 10/17/2021
 * Time            : 7:31 PM
 * Description     :
 **/

public class HealeniumTest extends BaseTest {

    @Test
    public void testCheckoutWithAllFields() throws InterruptedException {
        new CheckoutPage(driver)
                .inputFirstName("Osanda")
                .inputLastName("Nimalarathna");
//                .inputUsername("osanda")
//                .inputEmail("osanda@mailinator.com")
//                .inputAddress1("Poramba")
//                .inputAddress2("Ambalangoda")
//                .selectCountry("United States")
//                .selectState("California")
//                .inputZip("90000CF")
//                .inputCreditCardName("Osanda Nimalarathna")
//                .inputCreditCardNumber("1234567890123456")
//                .inputCreditCardExpiration("12/23")
//                .inputCreditCardCvv("123")
//                .clickCheckoutButton();

//        assertTrue(driver.getCurrentUrl().contains("paymentMethod=on"), "Checkout failed!");
        driver.navigate().to("https://retool.com/use-case/build-angular-app?_keyword=angular&adgroupid=127257670000&utm_source=google&utm_medium=search&utm_campaign=13877466420&utm_term=angular&utm_content=533278342994&hsa_acc=7420316652&hsa_cam=13877466420&hsa_grp=127257670000&hsa_ad=533278342994&hsa_src=g&hsa_tgt=kwd-425964193&hsa_kw=angular&hsa_mt=p&hsa_net=adwords&hsa_ver=3&gad=1&gclid=EAIaIQobChMIotPv5d3EgQMVpmdMCh0wNw5oEAAYASAAEgK2zPD_BwE");
        driver.findElement(By.xpath("//a[@href='https://login.retool.com/auth/login']")).click();
        Thread.sleep(10000);
        driver.findElement(By.id("email")).sendKeys("test@test.com");
        Thread.sleep(10000);
        driver.navigate().to("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

    }
}
