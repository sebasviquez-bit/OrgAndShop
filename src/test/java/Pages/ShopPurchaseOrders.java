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

    @FindBy(css = "#product-4804947804254 > div > div.card-details > a > h2")
    WebElement ProductText;

    @FindBy(css = "#product-4804947804254 > div > div.product-card-img-wrap > img")
    WebElement ProductImage;

    @FindBy(css = "#dog-lovers-human-apparel-bee-and-the-hound > li:nth-child(1) > div > div.product-card-img-wrap > button")
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

    @FindBy(css = "#checkout-wrap > div > div > div.main > div.main__content > div.step > div > form > div.section.section--payment-method > div.section__content > div:nth-child(2) > fieldset > div:nth-child(5) > div.radio__label > label")
    WebElement PaypalPayment;

    @FindBy(css = "#checkout-wrap > div > div > div.main > div.main__content > div.step > div > form > div.section.section--billing-address > div.section__content > fieldset > div:nth-child(2) > label")
    WebElement SameAsShippingAdd;

    @FindBy(css = "#checkout-wrap > div > div > div.main > div.main__content > div.step > div > form > div.section.section--billing-address > div.section__content > fieldset > div:nth-child(3) > label")
    WebElement DifferentBillingAdd;
    //


    WebDriver driver;

    // Constructor

    public ShopPurchaseOrders (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    //Methods

    public void BasicPurchase() {

        Actions actions = new Actions(driver);
        actions.moveToElement(FurYourOwnGoodSection).perform();
        assert(ProductText.isEnabled());
        this.ProductText.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll(0, 400);");
        this.ProductDetails.isDisplayed();
        this.AddToCartText.isDisplayed();
        this.AddToCartText.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOf(CheckOutButton));
        this.CheckOutButton.click();
        wait.until(ExpectedConditions.visibilityOf(ShoppingCartSection));
        jse.executeScript("scroll(0, 400);");
        this.ShoppingCartSection.isDisplayed();
        this.CheckOutButton2.isDisplayed();
        this.CheckOutButton2.click();
        wait.until(ExpectedConditions.visibilityOf(CheckOutForm));
        this.CheckOutFormEmail.sendKeys("sebas.viquez@hotmail.com");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormFirstName));
        this.CheckOutFormFirstName.sendKeys("sebas");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormLasttName));
        this.CheckOutFormLasttName.sendKeys("viquez");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormShippingAddres));
        this.CheckOutFormShippingAddres.sendKeys("NY");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormCity));
        this.CheckOutFormCity.sendKeys("NY");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormContry));
        this.CheckOutFormContry.sendKeys("United States");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormState));
        this.CheckOutFormState.sendKeys("New York");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormZip));
        this.CheckOutFormZip.sendKeys("10001");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormPhone));
        this.CheckOutFormPhone.sendKeys("919-233-9767");
        wait.until(ExpectedConditions.visibilityOf(ContinueShippingButton));
        this.ContinueShippingButton.click();
        wait.until(ExpectedConditions.visibilityOf(CheckOutWrapForm));
        wait.until(ExpectedConditions.visibilityOf(CheckOutWrapFormEmail));
        wait.until(ExpectedConditions.elementToBeClickable(CheckOutWrapFormContinueButton));
        this.CheckOutWrapFormContinueButton.click();
        wait.until(ExpectedConditions.visibilityOf(PaymentGateway));
        wait.until(ExpectedConditions.visibilityOf(CreditCardFields));
        wait.until(ExpectedConditions.visibilityOf(CreditCardNumberCase));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[1]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("number")).sendKeys("4321123456789034");
        driver.switchTo().defaultContent();
        this.CreditCardNameCase.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[2]/div/div/iframe")));
        driver.findElement(By.id("name")).sendKeys("Sebas Viquez");
        driver.switchTo().defaultContent();
        this.ExpDate.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[3]/div/div/iframe")));
        driver.findElement(By.id("expiry")).sendKeys("10 21");
        driver.switchTo().defaultContent();
        this.SecuCode.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[4]/div/div[1]/iframe")));
        driver.findElement(By.id("verification_value")).sendKeys("123");
        driver.switchTo().defaultContent();
        this.PaypalPayment.isDisplayed();
        this.SameAsShippingAdd.isDisplayed();
        this.DifferentBillingAdd.isDisplayed();
        this.PayNowButton.click();

    }

    public void QuickViewPurchase() throws InterruptedException {

        Actions actions = new Actions(driver);
        actions.moveToElement(ProductImage).perform();
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
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(CheckOutButton));
        this.CheckOutButton.click();
        wait.until(ExpectedConditions.visibilityOf(ShoppingCartSection));
        jse.executeScript("scroll(0, 400);");
        this.ShoppingCartSection.isDisplayed();
        this.CheckOutButton2.isDisplayed();
        this.CheckOutButton2.click();
        wait.until(ExpectedConditions.visibilityOf(CheckOutForm));
        this.CheckOutFormEmail.sendKeys("sebas.viquez@hotmail.com");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormFirstName));
        this.CheckOutFormFirstName.sendKeys("sebas");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormLasttName));
        this.CheckOutFormLasttName.sendKeys("viquez");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormShippingAddres));
        this.CheckOutFormShippingAddres.sendKeys("NY");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormCity));
        this.CheckOutFormCity.sendKeys("NY");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormContry));
        this.CheckOutFormContry.sendKeys("United States");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormState));
        this.CheckOutFormState.sendKeys("New York");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormZip));
        this.CheckOutFormZip.sendKeys("10001");
        wait.until(ExpectedConditions.visibilityOf(CheckOutFormPhone));
        this.CheckOutFormPhone.sendKeys("919-233-9767");
        wait.until(ExpectedConditions.visibilityOf(ContinueShippingButton));
        this.ContinueShippingButton.click();
        wait.until(ExpectedConditions.visibilityOf(CheckOutWrapForm));
        wait.until(ExpectedConditions.visibilityOf(CheckOutWrapFormEmail));
        wait.until(ExpectedConditions.elementToBeClickable(CheckOutWrapFormContinueButton));
        this.CheckOutWrapFormContinueButton.click();
        wait.until(ExpectedConditions.visibilityOf(PaymentGateway));
        wait.until(ExpectedConditions.visibilityOf(CreditCardFields));
        wait.until(ExpectedConditions.visibilityOf(CreditCardNumberCase));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath
                ("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[2]/div[2]/fieldset[1]/div[3]/div[3]/div[1]/div[1]/div[1]/iframe[1]")));
        driver.findElement(By.id("number")).sendKeys("4321123456789034");
        driver.switchTo().defaultContent();
        this.CreditCardNameCase.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[2]/div/div/iframe")));
        driver.findElement(By.id("name")).sendKeys("Sebas Viquez");
        driver.switchTo().defaultContent();
        this.ExpDate.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[3]/div/div/iframe")));
        driver.findElement(By.id("expiry")).sendKeys("10 21");
        driver.switchTo().defaultContent();
        this.SecuCode.isDisplayed();
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt
                (By.xpath("//*[@id=\"payment-gateway-subfields-5885129\"]/div[3]/div[4]/div/div[1]/iframe")));
        driver.findElement(By.id("verification_value")).sendKeys("123");
        driver.switchTo().defaultContent();
        this.PaypalPayment.isDisplayed();
        this.SameAsShippingAdd.isDisplayed();
        this.DifferentBillingAdd.isDisplayed();
        this.PayNowButton.click();

    }



}
