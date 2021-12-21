package ShopPages;

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

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.top-bar > a")
    WebElement AKCorgLink;

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.top-bar > ul > li:nth-child(1) > a")
    WebElement PointsProgression;

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.top-bar > ul > li:nth-child(2) > a")
    WebElement CompetitorReports;

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.top-bar > ul > li:nth-child(3) > a")
    WebElement BreederReports;

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.top-bar > ul > li:nth-child(4) > a")
    WebElement Pedigrees;

    @FindBy(css = "#dog-supplies-amp-accessories > div.site-wrap.home > header.desktop-header__wrap > div.desktop-header > div.logo-bar > ul > li:nth-child(2) > a")
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

    @FindBy(xpath = "//section[@id='index']")
    WebElement HeroImage;

    @FindBy(css = "#shopify-section-featured-collections > div.featured-collections__titles-scroll-wrap")
    WebElement featuredCollectionTitles;

    @FindBy(css = "#shopify-section-featured-collections > div.featured-collections__titles-scroll-wrap > div > div > h3:nth-child(2)")
    WebElement GearForDogsTitle;

    @FindBy(css = "#shopify-section-featured-collections > div.featured-collections__titles-scroll-wrap > div > div > h3.featured-collections__title.is-open")
    WebElement AKCProShoTitle;

    @FindBy(css = "#shopify-section-featured-collections > div.featured-collections__items.is-open > a:nth-child(2) > div > img")
    WebElement ToysPlayTimeProduct;

    @FindBy(css = "#shopify-section-featured-collections > div.featured-collections__items.is-open > a.featured-collections__item.featured-collections__item--view-all")
    WebElement MoreGearForDogs;

    //

    @FindBy(css = "#shopify-section-headline-tiles > h2")
    WebElement SpeciaShopsSection;

    @FindBy(xpath = "/html[1]/body[1]/div[2]/div[3]/section[1]/div[3]/div[1]/div[1]/div[3]/a[1]/div[2]/button[1]")
    WebElement QuickShopButton;

    @FindBy(css = "#quick-view > div > div")
    WebElement QuickViewModal;

    @FindBy(css = "#shopify-section-headline-tiles > div > a:nth-child(2)")
    WebElement NovNewArrivals;

    @FindBy(css = "#main-content > div > h1")
    WebElement NovNewArrivalsPageTitle;

    @FindBy(css = "#isp_left_container_facets > div")
    WebElement NovNewArrivalsPageTitleSideMenu;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a")
    WebElement NovNewArrivalsPageProduct;

    @FindBy(css = "#shopify-section-headline-tiles > div > a:nth-child(1)")
    WebElement FallEntertainingLook;

    @FindBy(css = "#shopify-section-headline-tiles > div > a:nth-child(3)")
    WebElement PuppyEssentials;

    @FindBy(css = "#shopify-section-headline-tiles > div > a:nth-child(4)")
    WebElement HolidayShop;

    @FindBy(css = "#shopify-section-call-to-action-banner > div > div > a")
    WebElement ShopByBreedButton;

    @FindBy(css = "#shopify-section-collection-breeds > div > div > div > div > a")
    WebElement ShopByBreedTitle;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(5) > a")
    WebElement dogBreedAlaskan;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(78) > a")
    WebElement dogBreedFrenchBull;

    @FindBy(css = "#shopify-section-collection-breeds > div > ul > li:nth-child(188) > a")
    WebElement dogBreedYorkshireTerrier;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(3) > a")
    WebElement NextButton;

    @FindBy(css = "#collection-main > ul.pagination.clearfix > li:nth-child(1) > a")
    WebElement PrevButton;

    @FindBy(css = "#index > section:nth-child(2) > div.cta > a")
    WebElement ViewMoreBeeHoundButton;

    @FindBy(css = "#index > section:nth-child(3) > div.cta > a")
    WebElement ViewMoreNationalChamp2020;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement ProductTitle;

    @FindBy(css = "#shopify-section-footer > div > form > input[type=email]")
    WebElement emailCaseNewProducts;

    @FindBy(css = "#shopify-section-footer > div > form > p.footer__newsletter__success-message")
    WebElement formSubscribeSuccess;

    @FindBy(css = "#shopify-section-footer > div > form > button")
    WebElement EmailSubscribeButton;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials")
    WebElement SocialMediaIcons;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials > ul > li:nth-child(4) > a")
    WebElement SocialMediaIconTwitter;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials > ul > li:nth-child(1) > a")
    WebElement SocialMediaIconFb;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials > ul > li:nth-child(3) > a")
    WebElement SocialMediaIconPin;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials > ul > li:nth-child(2) > a")
    WebElement SocialMediaIconIt;

    @FindBy(css = "#shopify-section-footer > div > div.footer__socials > ul > li:nth-child(5) > a")
    WebElement SocialMediaIconYouT;

    @FindBy(css = "#shopify-section-footer > div > div.footer__links > ul > li:nth-child(2) > a")
    WebElement CustServ;

    @FindBy(css = "#s-ad4aed5b-9a8c-49c0-9f95-f0d6d828ecda > div > h1")
    WebElement CustServRefundsTitle;

    @FindBy(css = "#shopify-section-footer > div > div.footer__links > ul > li:nth-child(1) > a")
    WebElement ReturnsExchanges;

    @FindBy(css = "#s-ca51d8e3-51ef-48fb-8136-e2f6241f0876 > div > h1")
    WebElement ShippingPoliciesTitle;

    @FindBy(css = "#shopify-section-footer > div > div.footer__links > ul > li:nth-child(3) > a")
    WebElement PrivacyPoli;

    @FindBy(css = "#s-ad4aed5b-9a8c-49c0-9f95-f0d6d828ecda > div > h1")
    WebElement PrivacyPoliTitle;

    @FindBy(css = "#shopify-section-footer > div > div.footer__links > ul > li:nth-child(4) > a")
    WebElement TermsUse;

    @FindBy(css = "#page-title > h1")
    WebElement TermsUseTitle;

    @FindBy(css = "#shopify-section-footer > div > div.footer__links > ul > li:nth-child(5) > a")
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
        //this.TopHeaderPromoBar.click();
        //WebDriverWait wait = new WebDriverWait(driver, 5);
        //wait.until(ExpectedConditions.urlContains("/pages/shippingpolicies"));

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

    public void checkHeroImage() {


        this.HeroImage.isDisplayed();
        this.HeroImage.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(ProductTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void checkFeatureCollectionsSection() {

        this.featuredCollectionTitles.isDisplayed();
        this.GearForDogsTitle.isDisplayed();
        this.AKCProShoTitle.isDisplayed();
        this.GearForDogsTitle.click();
        this.ToysPlayTimeProduct.isDisplayed();
        this.MoreGearForDogs.isDisplayed();

    }

    public void checkQuickShop() {

        Actions actions = new Actions(driver);
        actions.moveToElement(SpeciaShopsSection).perform();
        this.QuickShopButton.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(QuickViewModal));
        //this.QuickViewModal.isDisplayed();

    }

    //Special Shop Section:


    public void clickFallEntertainingLook() {

        this.FallEntertainingLook.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.urlContains("/pages/fall-entertaining"));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void checkNovNewArrivals() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(NovNewArrivals));
        this.NovNewArrivals.click();
        wait.until(ExpectedConditions.visibilityOf(NovNewArrivalsPageTitle));
        wait.until(ExpectedConditions.visibilityOf(NovNewArrivalsPageTitleSideMenu));
        wait.until(ExpectedConditions.visibilityOf(NovNewArrivalsPageProduct));

    }

    public void checkPuppyEssentials() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(PuppyEssentials));
        this.PuppyEssentials.click();
        wait.until(ExpectedConditions.urlContains("https://retrievist.akc.org/essentials/"));

    }

    public void checkHolidayShop() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(HolidayShop));
        this.HolidayShop.click();
        wait.until(ExpectedConditions.urlContains("/gifts-for-humans-home-kitchen-holiday-decor"));

    }

    public void clickShopByBreedButton() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(ShopByBreedButton));
        this.ShopByBreedButton.click();
        wait.until(ExpectedConditions.visibilityOf(ShopByBreedTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(dogBreedAlaskan));
        wait.until(ExpectedConditions.visibilityOf(dogBreedFrenchBull));
        wait.until(ExpectedConditions.visibilityOf(dogBreedYorkshireTerrier));
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

    public void ClickCustServ() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CustServ.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(CustServRefundsTitle));

    }

    public void ClickReturnsExchanges() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 4000);");
        this.ReturnsExchanges.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(ShippingPoliciesTitle));

    }

    public void ClickPrivacyPoli() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.PrivacyPoli.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(PrivacyPoliTitle));

    }

    public void ClickTermsUse() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.TermsUse.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(TermsUseTitle));

    }

    public void ClickCaliPrivacyRight() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 3000);");
        this.CaliPrivacyRight.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(CaliPrivacyRightTitle));

    }

}
