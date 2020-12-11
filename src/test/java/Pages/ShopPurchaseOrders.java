package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class ShopPurchaseOrders {

    @FindBy(css = "#homepage-banners > a.homepage-banner.active > h2 > span.cta")
    WebElement ShopNowBanner0;

    @FindBy(css = "#product-11595701892 > div > div.card-details > a > h2")
    WebElement BaseballCaps;

    @FindBy(css = "#product-11595701892 > div > div.product-card-img-wrap")
    WebElement BaseballCap;

    @FindBy(css = "#product-11595701892 > div > div.product-card-img-wrap > button")
    WebElement QuickViewButton;

    @FindBy(css = "#quick-view > div > div")
    WebElement QuickViewModal;

    @FindBy(css = "#quick-view > div > div > div.quick-view__product-fields > a")
    WebElement QVModalProdDetail;
    //

    @FindBy(css = "#index > section:nth-child(4)")
    WebElement FurYourOwnGoodSection;

    @FindBy(id = "collection-header")
    WebElement CollectionHeader;

    @FindBy(css = "#collection-main > ul > li:nth-child(1) > div > div > div.card-details")
    WebElement ItemPriceDetails;

    @FindBy(id = "product-image-main")
    WebElement ProductDetails;

    @FindBy(id = "AddToCartText")
    WebElement AddToCartText;

    @FindBy(css = "#AddToCartForm > div.checkout-callout > a")
    WebElement CheckOutButton;

    @FindBy(id = "cart")
    WebElement ShoppingCartSection;

    @FindBy(css = "#cart > div > table > tbody > tr.actions > td > button")
    WebElement CheckOutButton2;

    @FindBy(css = "#checkout-wrap > div > div > div.main > div.main__content > div.step > form")
    WebElement CheckOutForm;

    @FindBy(css = "#checkout_email")
    WebElement CheckOutFormEmail;

    @FindBy(css = "#checkout_shipping_address_first_name")
    WebElement CheckOutFormFirstName;

    @FindBy(css = "#checkout_shipping_address_last_name")
    WebElement CheckOutFormLasttName;

    @FindBy(css = "#checkout_shipping_address_address1")
    WebElement CheckOutFormShippingAddres;

    @FindBy(css = "#checkout_shipping_address_city")
    WebElement CheckOutFormCity;

    @FindBy(css = "#checkout_shipping_address_country")
    WebElement CheckOutFormContry;

    @FindBy(css = "#checkout_shipping_address_province")
    WebElement CheckOutFormState;

    @FindBy(css = "#checkout_shipping_address_zip")
    WebElement CheckOutFormZip;

    @FindBy(css = "#checkout_shipping_address_phone")
    WebElement CheckOutFormPhone;

    @FindBy(id = "continue_button")
    WebElement ContinueShippingButton;

    @FindBy(id = "checkout-wrap")
    WebElement CheckOutWrapForm;

    @FindBy(css = "#checkout-wrap > div > div > div.main > div.main__content > div.step > form > div.step__sections > div:nth-child(1) > div > div > div:nth-child(1) > div.review-block__inner > div.review-block__content > bdo")
    WebElement CheckOutWrapFormEmail;

    @FindBy(id = "continue_button")
    WebElement CheckOutWrapFormContinueButton;

    @FindBy(id = "payment_gateway_5885129_description")
    WebElement PaymentGateway;

    @FindBy(id = "payment-gateway-subfields-5885129")
    WebElement CreditCardFields;

    @FindBy(css = "div.field:nth-child(2) > div:nth-child(1) > div:nth-child(2)")
    WebElement CreditCardNumberCase;

    @FindBy(css = "#payment-gateway-subfields-5885129 > div.fieldset > div:nth-child(4) > div > label")
    WebElement ExpDate;

    @FindBy(css = "#payment-gateway-subfields-5885129 > div.fieldset > div:nth-child(5) > div > label")
    WebElement SecuCode;

    @FindBy(id = "continue_button")
    WebElement PayNowButton;

    @FindBy(css = "#payment-gateway-subfields-5885129 > div.fieldset > div:nth-child(3) > div > label")
    WebElement CreditCardNameCase;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[4]/div[1]/input[1]")
    WebElement PaypalPayment;

    @FindBy(id = "checkout_different_billing_address_false")
    WebElement SameAsShippingAdd;


    WebDriver driver;

    // Constructor

    public ShopPurchaseOrders (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    //Methods

    public void BasicPurchase() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(FurYourOwnGoodSection).perform();
        assert(BaseballCaps.isEnabled());
        this.BaseballCaps.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 400);");
        this.ProductDetails.isDisplayed();
        this.AddToCartText.isDisplayed();
        this.AddToCartText.click();
        sleep(1000);
        this.CheckOutButton.isDisplayed();
        this.CheckOutButton.click();
        sleep(1000);
        jse.executeScript("scroll(0, 400);");
        this.ShoppingCartSection.isDisplayed();
        this.CheckOutButton2.isDisplayed();
        this.CheckOutButton2.click();
        sleep(2000);
        this.CheckOutForm.isDisplayed();
        sleep(1000);
        this.CheckOutFormEmail.sendKeys("sebas.viquez@hotmail.com");
        sleep(1000);
        this.CheckOutFormFirstName.sendKeys("sebas");
        sleep(1000);
        this.CheckOutFormLasttName.sendKeys("viquez");
        sleep(1000);
        this.CheckOutFormShippingAddres.sendKeys("NY");
        sleep(1000);
        this.CheckOutFormCity.sendKeys("NY");
        sleep(1000);
        this.CheckOutFormContry.sendKeys("United States");
        sleep(1000);
        this.CheckOutFormState.sendKeys("New York");
        sleep(1000);
        this.CheckOutFormZip.sendKeys("10001");
        sleep(1000);
        this.CheckOutFormPhone.sendKeys("919-233-9767");
        sleep(1000);
        this.ContinueShippingButton.click();
        sleep(1000);
        this.CheckOutWrapForm.isDisplayed();
        this.CheckOutWrapFormEmail.isDisplayed();
        sleep(2000);
        this.CheckOutWrapFormContinueButton.click();
        sleep(2000);
        this.PaymentGateway.isDisplayed();
        this.CreditCardFields.isDisplayed();
        sleep(1000);
        this.CreditCardNumberCase.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[1]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("number")).sendKeys("4321123456789034");
        driver.switchTo().defaultContent();
        this.CreditCardNameCase.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[2]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("name")).sendKeys("Sebas Viquez");
        driver.switchTo().defaultContent();
        this.ExpDate.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[3]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("expiry")).sendKeys("10 20");
        driver.switchTo().defaultContent();
        this.SecuCode.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[4]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("verification_value")).sendKeys("123");
        driver.switchTo().defaultContent();
        this.PaypalPayment.isDisplayed();
        this.SameAsShippingAdd.isDisplayed();
        this.PayNowButton.click();
        sleep(2000);
    }

    public void QuickViewPurchase() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(BaseballCap).perform();
        assert(QuickViewButton.isEnabled());
        this.QuickViewButton.click();
        this.QuickViewModal.isDisplayed();
        this.QVModalProdDetail.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 400);");
        this.ProductDetails.isDisplayed();
        this.AddToCartText.isDisplayed();
        this.AddToCartText.click();
        sleep(1000);
        this.CheckOutButton.isDisplayed();
        this.CheckOutButton.click();
        sleep(1000);
        jse.executeScript("scroll(0, 400);");
        this.ShoppingCartSection.isDisplayed();
        this.CheckOutButton2.isDisplayed();
        this.CheckOutButton2.click();
        sleep(2000);
        this.CheckOutForm.isDisplayed();
        sleep(1000);
        this.CheckOutFormEmail.sendKeys("sebas.viquez@hotmail.com");
        sleep(1000);
        this.CheckOutFormFirstName.sendKeys("sebas");
        sleep(1000);
        this.CheckOutFormLasttName.sendKeys("viquez");
        sleep(1000);
        this.CheckOutFormShippingAddres.sendKeys("NY");
        sleep(1000);
        this.CheckOutFormCity.sendKeys("NY");
        sleep(1000);
        this.CheckOutFormContry.sendKeys("United States");
        sleep(1000);
        this.CheckOutFormState.sendKeys("New York");
        sleep(1000);
        this.CheckOutFormZip.sendKeys("10001");
        sleep(1000);
        this.CheckOutFormPhone.sendKeys("919-233-9767");
        sleep(1000);
        this.ContinueShippingButton.click();
        sleep(1000);
        this.CheckOutWrapForm.isDisplayed();
        this.CheckOutWrapFormEmail.isDisplayed();
        sleep(2000);
        this.CheckOutWrapFormContinueButton.click();
        sleep(2000);
        this.PaymentGateway.isDisplayed();
        this.CreditCardFields.isDisplayed();
        sleep(1000);
        this.CreditCardNumberCase.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[1]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("number")).sendKeys("4321123456789034");
        driver.switchTo().defaultContent();
        this.CreditCardNameCase.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[2]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("name")).sendKeys("Sebas Viquez");
        driver.switchTo().defaultContent();
        this.ExpDate.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[3]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("expiry")).sendKeys("10 20");
        driver.switchTo().defaultContent();
        this.SecuCode.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[4]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("verification_value")).sendKeys("123");
        driver.switchTo().defaultContent();
        this.PaypalPayment.isDisplayed();
        this.SameAsShippingAdd.isDisplayed();
        this.PayNowButton.click();
        sleep(2000);


    }



}
