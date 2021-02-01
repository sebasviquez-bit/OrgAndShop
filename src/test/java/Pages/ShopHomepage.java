package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

public class ShopHomepage {

    @FindBy(id = "promo-bar")
    WebElement TopHeaderPromoBar;

    @FindBy(css = "#akc-org")
    WebElement AKCorgLink;

    @FindBy(css = "#tb-links > ul > li:nth-child(1) > a")
    WebElement PointsProgression;

    @FindBy(css = "#tb-links > ul > li:nth-child(2) > a")
    WebElement CompetitorReports;

    @FindBy(css = "#tb-links > ul > li:nth-child(3) > a")
    WebElement BreederReports;

    @FindBy(css = "#tb-links > ul > li:nth-child(4) > a")
    WebElement Pedigrees;

    @FindBy(css = "#tb-cart > a")
    WebElement ShoppingCart;

    @FindBy(css = "#cart > div > p")
    WebElement ShoppingCartEmpty;

    @FindBy(id = "ispbxii_0")
    WebElement ShopSearch;

    @FindBy(id = "isp_main_search_box")
    WebElement SecondarySearch;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a.isp_product_image_href > img")
    WebElement ProductImageResult;

    @FindBy(css = "#ui-id-1 > li:nth-child(5)")
    WebElement ProductResultClick;

    @FindBy(css = "#homepage-banner-controls > a:nth-child(1)")
    WebElement ShopNowBanner0DotIndicator;

    @FindBy(css = "#homepage-banners > a.homepage-banner.active > img")
    WebElement ShopNowBanner0;

    @FindBy(xpath = "//*[@id=\"dog-lovers-human-apparel-bee-and-the-hound\"]/li[1]/div/div[1]/img")
    WebElement BeeHoundProduct;

    @FindBy(xpath = "//*[@id=\"index\"]/section[2]/div[1]/ul/li[1]/div/div[1]/button")
    WebElement QuickViewButton;

    @FindBy(css = "#quick-view > div > div")
    WebElement QuickViewModal;
    //

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement dropDown;

    @FindBy(id = "#breed-collection-filter > div > div > a")
    WebElement chevronDown;

    @FindBy(css = "#index > section:nth-child(4) > div.cta > a")
    WebElement FurYourOwnGoodCampButton;

    @FindBy(css = "#index > section:nth-child(4) > div.cta > a")
    WebElement ViewMoreChewyButton;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(3) > a")
    WebElement NextButton;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(1) > a")
    WebElement PrevButton;

    @FindBy(css = "#index > section:nth-child(2) > div.cta > a")
    WebElement ViewMoreBeeHoundButton;

    @FindBy(css = "#index > section:nth-child(3) > div.cta > a")
    WebElement ViewMoreNationalChamp2020;

    @FindBy(css = "#collection-header > div.content > div > h1")
    WebElement AKCNationalChampTitle;

    @FindBy(id = "form-subscribe-input")
    WebElement emailCaseNewProducts;

    @FindBy(id = "form-subscribe-success")
    WebElement formSubscribeSuccess;

    @FindBy(id = "form-subscribe-button")
    WebElement EmailSubscribeButton;

    @FindBy(css = "#footer-connect > div > ul")
    WebElement SocialMediaIcons;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(1) > a")
    WebElement SocialMediaIconTwitter;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(2) > a > span.icon.icon-facebook")
    WebElement SocialMediaIconFb;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(3) > a > span.icon.icon-pinterest")
    WebElement SocialMediaIconPin;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(4) > a > span.icon.icon-instagram")
    WebElement SocialMediaIconIt;

    @FindBy(css = "#footer-connect > div > ul > li:nth-child(5) > a > span.icon.icon-youtube")
    WebElement SocialMediaIconYouT;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(2) > a")
    WebElement CustServ;

    @FindBy(css = "#page-content > h4")
    WebElement CustServRefundsTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(2) > a")
    WebElement AKCShopExp;

    @FindBy(css = "#side-nav > ul > li > div > ul")
    WebElement AKCShopExpList;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(3) > a")
    WebElement PrivacyPoli;

    @FindBy(css = "#collection-header > div > h1")
    WebElement PrivacyPoliTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(4) > a")
    WebElement TermsUse;

    @FindBy(css = "#collection-header > div > h1")
    WebElement TermsUseTitle;

    @FindBy(css = "#mm-0 > div.site-wrap > footer > div.footer-bottom > ul > li:nth-child(5) > a")
    WebElement CaliPrivacyRight;

    @FindBy(css = "#collection-header > div > h1")
    WebElement CaliPrivacyRightTitle;


    //------------------------//

    WebDriver driver;

    // Constructor
    public ShopHomepage (WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void checkTopHeaderPromoBar() {

        this.TopHeaderPromoBar.isDisplayed();
        this.TopHeaderPromoBar.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("/pages/shippingpolicies"));

    }

    public void checkAKCorgLink() {

        this.AKCorgLink.isDisplayed();
        this.AKCorgLink.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.akc.org/"));

    }

    public void checkPointsProgression() {

        this.PointsProgression.isDisplayed();
        this.PointsProgression.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkCompetitorReports() {

        this.CompetitorReports.isDisplayed();
        this.CompetitorReports.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkBreederReports() {

        this.BreederReports.isDisplayed();
        this.BreederReports.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkPedigrees() {

        this.Pedigrees.isDisplayed();
        this.Pedigrees.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/apps/store/index.cfm"));

    }

    public void checkShoppingCart() {

        this.ShoppingCart.isDisplayed();
        this.ShoppingCart.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ShoppingCartEmpty));
        this.ShoppingCartEmpty.isDisplayed();

    }

    public void SecondarySearch() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ShopSearch));
        this.ShopSearch.sendKeys("Jackets");
        sleep(2000);
        this.ProductResultClick.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(SecondarySearch));
        this.SecondarySearch.isDisplayed();
        driver.findElement(By.id("isp_main_search_box")).clear();
        sleep(1000);
        this.SecondarySearch.sendKeys("tshirts");
        sleep(1000);
        driver.findElement(By.id("isp_main_search_box")).sendKeys(Keys.RETURN);
        sleep(1000);
        this.ProductImageResult.isDisplayed();

    }

    public void checkShopNowBanner0() {


        this.ShopNowBanner0DotIndicator.isDisplayed();
        this.ShopNowBanner0DotIndicator.click();
        this.ShopNowBanner0.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AKCNationalChampTitle));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void checkQuickView() {

        Actions actions = new Actions(driver);
        actions.moveToElement(BeeHoundProduct).perform();
        assert(QuickViewButton.isEnabled());
        this.QuickViewButton.click();
        this.QuickViewModal.isDisplayed();

    }

    public void FurYourOwnGoodCampButton() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#footer-connect > div > h4"));
        builder.moveToElement(element).build().perform();
        this.FurYourOwnGoodCampButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/dog-lovers-human-apparel-its-fur-your-own-good-donation-campaign"));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void ViewMoreChewyProdCampButton() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ViewMoreChewyButton));
        this.ViewMoreChewyButton.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("chewy"));
        wait.until(ExpectedConditions.elementToBeClickable(NextButton));
        this.NextButton.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.urlContains("page=2"));
        Actions actions = new Actions(driver);
        actions.moveToElement(NextButton).perform();
        assert(NextButton.isEnabled());
        this.NextButton.click();
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("page=3"));
        actions.moveToElement(NextButton).perform();
        assert(NextButton.isEnabled());
        this.NextButton.click();
        wait.until(ExpectedConditions.urlContains("page=4"));
        actions.moveToElement(PrevButton).perform();
        assert(PrevButton.isEnabled());
        this.PrevButton.click();
        wait.until(ExpectedConditions.urlContains("page=3"));

    }

    public void ViewMoreBeeHoundButton() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 1500);");
        this.ViewMoreBeeHoundButton.isDisplayed();
        this.ViewMoreBeeHoundButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/collections/dog-lovers-human-apparel-bee-and-the-hound"));

    }

    public void ViewMoreNationalChamp2020()  {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2000);");
        this.ViewMoreNationalChamp2020.isDisplayed();
        this.ViewMoreNationalChamp2020.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/akc-national-championship-2020"));

    }
    
    //Footer Tests >

    public void checkSubsEmail() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2500);");
    this.emailCaseNewProducts.isDisplayed();
    this.emailCaseNewProducts.click();
    sleep(1000);
    this.emailCaseNewProducts.sendKeys("sebas.viquez@hotmail.com");
    sleep(1000);
    this.EmailSubscribeButton.click();
    sleep(1000);
    this.formSubscribeSuccess.isDisplayed();

    }

    public void SocialMediaIcons() throws InterruptedException {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIcons.isDisplayed();
    this.SocialMediaIconTwitter.isDisplayed();
    this.SocialMediaIconTwitter.click();
    WebDriverWait wait = new WebDriverWait(driver, 5);
    wait.until(ExpectedConditions.urlContains("https://twitter.com/akcdoglovers"));
    driver.navigate().to("https://shop.akc.org/?test=true");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconFb.isDisplayed();
    this.SocialMediaIconFb.click();
    wait.until(ExpectedConditions.urlContains("https://www.facebook.com/AmericanKennelClub/"));
    driver.navigate().to("https://shop.akc.org/?test=true");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconPin.isDisplayed();
    this.SocialMediaIconPin.click();
    wait.until(ExpectedConditions.urlContains("https://www.pinterest.com/akcshop/"));
    driver.navigate().to("https://shop.akc.org/?test=true");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconIt.isDisplayed();
    this.SocialMediaIconIt.click();
    wait.until(ExpectedConditions.urlContains("https://www.instagram.com/americankennelclub/"));
    driver.navigate().to("https://shop.akc.org/?test=true");
    sleep(2000);
        jse.executeScript("scroll(0, 2300);");
    this.SocialMediaIconYouT.isDisplayed();
    this.SocialMediaIconYouT.click();
    wait.until(ExpectedConditions.urlContains("https://www.youtube.com/americankennelclub"));
    driver.navigate().to("https://shop.akc.org/?test=true");
    sleep(1000);

    }

    public void ClickCustServ() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CustServ.click();
        sleep(2000);
        this.CustServRefundsTitle.isDisplayed();

    }

    public void ClickAKCShopExp() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.AKCShopExp.click();
        sleep(2000);
        this.AKCShopExpList.isDisplayed();

    }

    public void ClickPrivacyPoli() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.PrivacyPoli.click();
        sleep(2000);
        this.PrivacyPoliTitle.isDisplayed();

    }

    public void ClickTermsUse() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.TermsUse.click();
        sleep(2000);
        this.TermsUseTitle.isDisplayed();

    }

    public void ClickCaliPrivacyRight() throws InterruptedException{

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CaliPrivacyRight.click();
        sleep(2000);
        this.CaliPrivacyRightTitle.isDisplayed();

    }

}
