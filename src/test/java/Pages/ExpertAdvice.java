package Pages;

import Helpers.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;


public class ExpertAdvice {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(2)")
    WebElement menuexpadv;

    @FindBy(css = "#expert-advice > div:nth-child(1) > div > div > div.content-card__body > a")
    WebElement artexpadv;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement allcateg;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement dogbreeding;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement grooming;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement health;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement homeliving;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(6) > a")
    WebElement lifestyle;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement news;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement nutrition;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement puppyinfo;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement sports;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement training;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(6) > a")
    WebElement vetcorner;

    @FindBy(css = "#expert-advice > div:nth-child(3) > div > div > div > ul > li:nth-child(1) > a > div")
    WebElement findmatch;

    @FindBy(css = "#expert-advice > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a > div")
    WebElement dognamefind;

    @FindBy(css = "#expert-advice > div:nth-child(3) > div > div > div > ul > li:nth-child(3) > a > div")
    WebElement candogeat;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(1) > a")
    WebElement akctv;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(2) > a")
    WebElement akcmag;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(3) > a")
    WebElement newsletter;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(4) > a")
    WebElement presscenter;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(5) > a")
    WebElement akcdetection;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(6) > a")
    WebElement akccanine;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(7) > a")
    WebElement government;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(8) > a")
    WebElement akceducation;

    @FindBy(css = "#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(9) > a")
    WebElement akclibrary;

    @FindBy(css = "#page-title > h1")
    WebElement artexpadvElement;

    @FindBy(css = "#page-title > h1")
    WebElement allcategElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement dogbreedingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement groomingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement healthElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement homelivingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement lifestyleElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement newsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement nutritionElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement puppyinfoElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement sportsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement trainingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement vetcornerElement;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-intro-title.mb2.bps-mb8 > div.breed-select-intro-title__title > h1")
    WebElement findmatchElement;

    @FindBy(xpath = "//html/body/main/div[2]/section/div[1]/h2[2]")
    WebElement dognamefindElement;

    @FindBy(xpath = "//html/body/main/div/section/h1")
    WebElement candogeatElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcmagElement;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > div.subscription__page-header-container > h1")
    WebElement newsletterElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement presscenterElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcdetectionElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement governmentElement;

    @FindBy(xpath = "//*[@id=\"page-title\"]/div/h1")
    WebElement akceducationElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akclibraryElement;

    @FindBy(css = "body > div:nth-child(6) > div.page-container > div.page-layout > main > div.my4 > form > div > div > label > span.form-label")
    WebElement VideosBox;

    @FindBy(xpath = "//html/body/div[5]/div[1]/div[3]/main/div[3]/div/div/div[1]/div/div[2]/a")
    WebElement Video1;

    @FindBy(xpath = "//html/body/div[5]/div[1]/div[3]/main/div[3]/div/div/div[1]/div/div[2]/a")
    WebElement nails;

    @FindBy(xpath = "/html/body/div[5]/div[1]/div[3]/aside/div/div[1]/span")
    WebElement mediatitle;

    @FindBy(css = "body > div:nth-child(6) > div.page-container > div.page-layout > aside > div > nav > ul > li:nth-child(9) > a")
    WebElement fitness;

    @FindBy(xpath = "/html/body/div[5]/div[1]")
    WebElement pageBody;

    @FindBy(css = "#google_ads_iframe_\\/120519536\\/AKC\\.Expert-Advice\\/home-living_2__container__")
    WebElement topAdd;

    @FindBy(xpath = "//*[@id=\"newsletter-widget-side__title\"]")
    WebElement newsCase;

    @FindBy(css = "#google_ads_iframe_\\/120519536\\/AKC\\.Expert-Advice\\/home-living_3__container__")
    WebElement bottompAdd;

    @FindBy(xpath = "//html/body/div[8]")
    WebElement HMfooter;

    @FindBy(css = "body > div:nth-child(6) > div.page-container > div.page-layout > aside > div > nav > ul > li:nth-child(6) > a")
    WebElement LSquizzMenu;

    @FindBy(css = "body > div:nth-child(7) > div.page-container > div.page-layout > main > div.content-card-grid > div > div > div:nth-child(3) > div > div.content-card__body > a")
    WebElement LSquizzSport;

    @FindBy(xpath = "//span[@class='toggle__visual-input slider']")
    WebElement editorPick;

    @FindBy(xpath = "//a[contains(text(),'Alternative Medicine')]")
    WebElement alternativeMed;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-info-container > div.subscription__form-info-input-container > div:nth-child(1) > input")
    WebElement SubsFormFirstName;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-info-container > div.subscription__form-info-input-container > div:nth-child(2) > input")
    WebElement SubsFormLastName;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-info-container > div.subscription__form-info-input-container > div:nth-child(3) > input")
    WebElement SubsFormEmail;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-info-container > div.subscription__form-info-input-container > div.subscription__form-info-input.subscription__form-info-input-full > select")
    WebElement SubsFormBreedName;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-info-container > div.subscription__form-info-input-container > div.subscription__form-info-input.subscription__form-info-input-full > select > option:nth-child(5)")
    WebElement SubsFormBreedAkita;

    @FindBy(css = "#subscription__form-item-halved-0 > div.subscription__form-item.subscription__form-item-bottom.subscription__form-item-halved-bottom > div.subscription__form-checkbox-akc-nibble > label > span.checkbox__visual-input")
    WebElement AKCNibbleBox;

    @FindBy(css = "#subscription__form-item-halved-0 > div.subscription__form-item.subscription__form-item-bottom.subscription__form-item-halved-bottom > div.subscription__form-item-halved-bottom-inputs.subscription__form-akc-nibble-children > div:nth-child(1) > div > label > span.checkbox__visual-input")
    WebElement AKCNibbleTrainingBox;

    @FindBy(css = "#subscription__form-item-halved-1 > div.subscription__form-item.subscription__form-item-bottom.subscription__form-item-halved-bottom > div.subscription__form-checkbox-akc-pupdate > label > span.checkbox__visual-input")
    WebElement AKCPupDateBox;

    @FindBy(css = "#subscription__form-item-halved-1 > div.subscription__form-item.subscription__form-item-bottom.subscription__form-item-halved-bottom > div.subscription__form-item-halved-bottom-inputs.subscription__form-akc-pupdate-children > div.subscription__form-info-input-full.subscription__form-Pupdate_Subscription_Center_Signup_List-breed.mt4 > select")
    WebElement AKCPupDateDogBreedBox;

    @FindBy(css = "#subscription__form-item-halved-1 > div.subscription__form-item.subscription__form-item-bottom.subscription__form-item-halved-bottom > div.subscription__form-item-halved-bottom-inputs.subscription__form-akc-pupdate-children > div:nth-child(2) > div > input")
    WebElement AKCPupDateDogsDateBirthBox;

    @FindBy(css = "#subscription__form-item-small-3 > div.subscription__form-item.subscription__form-item-top.subscription__form-item-small-top > div:nth-child(1) > label > span.checkbox__visual-input")
    WebElement SubsFormFamilyDogBox;

    @FindBy(css = "body > main > div > div.bgc-white.cmw > div > div > form > div > div.subscription__form-submit-container.mt5.mx9 > button")
    WebElement SubsFormSubmitButton;

    @FindBy(css = "#subscription__modal-msg-1")
    WebElement SubsFormConfirmation;

    @FindBy(css = "body > div.bcpNotificationBar.bcpNotificationBarStickyBottom")
    WebElement BottomBanner;


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public ExpertAdvice(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void VerifyExpAdv(){

        this.menuexpadv.click();
        this.artexpadv.isDisplayed();
        this.allcateg.isDisplayed();
        this.dogbreeding.isDisplayed();
        this.grooming.isDisplayed();
        this.health.isDisplayed();
        this.homeliving.isDisplayed();
        this.lifestyle.isDisplayed();
        this.news.isDisplayed();
        this.nutrition.isDisplayed();
        this.puppyinfo.isDisplayed();
        this.sports.isDisplayed();
        this.training.isDisplayed();
        this.vetcorner.isDisplayed();
        this.findmatch.isDisplayed();
        this.dognamefind.isDisplayed();
        this.candogeat.isDisplayed();
        this.akctv.isDisplayed();
        this.akcmag.isDisplayed();
        this.newsletter.isDisplayed();
        this.presscenter.isDisplayed();
        this.akcdetection.isDisplayed();
        this.akccanine.isDisplayed();
        this.government.isDisplayed();
        this.akceducation.isDisplayed();
        this.akclibrary.isDisplayed();
    }


    //Click methods for ExpertAdvice Menu tabs


    public void Clickartexpadv() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(artexpadv));
        this.artexpadv.isDisplayed();
        this.artexpadv.click();
        wait.until(ExpectedConditions.visibilityOf(artexpadvElement));

    }

    public void Clickallcateg() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(allcateg));
        this.allcateg.click();
        wait.until(ExpectedConditions.visibilityOf(allcategElement));

    }

    public void Clickdogbreeding() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dogbreeding));
        this.dogbreeding.click();
        wait.until(ExpectedConditions.visibilityOf(dogbreedingElement));

    }

    public void Clickgrooming() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(grooming));
        this.grooming.click();
        wait.until(ExpectedConditions.visibilityOf(groomingElement));

    }

    public void Clickhealth() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(health));
        this.health.click();
        wait.until(ExpectedConditions.visibilityOf(healthElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickhomeliving() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(homeliving));
        this.homeliving.click();
        wait.until(ExpectedConditions.visibilityOf(homelivingElement));

    }

    public void Clicklifestyle() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(lifestyle));
        this.lifestyle.click();
        wait.until(ExpectedConditions.visibilityOf(lifestyleElement));

    }

    public void Clicknews() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(news));
        this.news.click();
        wait.until(ExpectedConditions.visibilityOf(newsElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clicknutrition() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(nutrition));
        wait.until(ExpectedConditions.elementToBeClickable(nutrition));
        this.nutrition.click();
        wait.until(ExpectedConditions.visibilityOf(nutritionElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickpuppyinfo() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(puppyinfo));
        wait.until(ExpectedConditions.elementToBeClickable(puppyinfo));
        this.puppyinfo.click();
        wait.until(ExpectedConditions.visibilityOf(puppyinfoElement));

    }

    public void Clicksports() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(sports));
        this.sports.click();
        wait.until(ExpectedConditions.visibilityOf(sportsElement));

    }

    public void Clicktraining() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(training));
        this.training.click();
        wait.until(ExpectedConditions.visibilityOf(trainingElement));

    }

    public void Clickvetcorner() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(vetcorner));
        this.vetcorner.click();
        wait.until(ExpectedConditions.visibilityOf(vetcornerElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void ClickfindmatchOnExpAdvMenu() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(findmatch));
        this.findmatch.click();
        wait.until(ExpectedConditions.visibilityOf(findmatchElement));

    }

    public void Clickdognamefind() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dognamefind));
        this.dognamefind.click();
        wait.until(ExpectedConditions.visibilityOf(dognamefindElement));

    }

    public void Clickcandogeat()  {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(candogeat));
        this.candogeat.click();
        wait.until(ExpectedConditions.visibilityOf(candogeatElement));

    }

    public void Clickakctv() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akctv));
        this.akctv.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlToBe("https://akc.tv/"));

    }

    public void Clickakcmag() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akcmag));
        wait.until(ExpectedConditions.elementToBeClickable(akcmag));
        this.akcmag.click();
        wait.until(ExpectedConditions.visibilityOf(akcmagElement));

    }

    public void Clicknewsletter() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        this.newsletter.click();
        wait.until(ExpectedConditions.visibilityOf(newsletterElement));

    }

    public void Clickpresscenter() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(presscenter));
        this.presscenter.click();
        wait.until(ExpectedConditions.visibilityOf(presscenterElement));

    }

    public void Clickakcdetection() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akcdetection));
        this.akcdetection.click();
        wait.until(ExpectedConditions.visibilityOf(akcdetectionElement));

    }

    public void Clickakccanine() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akccanine));
        this.akccanine.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickgovernment() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(government));
        this.government.click();
        wait.until(ExpectedConditions.visibilityOf(governmentElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickakceducation() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akceducation));
        this.akceducation.click();
        wait.until(ExpectedConditions.visibilityOf(akceducationElement));

    }

    public void Clickakclibrary() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akclibrary));
        this.akclibrary.click();
        wait.until(ExpectedConditions.visibilityOf(akclibraryElement));

    }

    public void SubscriptionForm () {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        this.newsletter.click();
        wait.until(ExpectedConditions.visibilityOf(newsletterElement));
        //HiddeBanner();
        this.SubsFormFirstName.sendKeys("Sebas");
        this.SubsFormLastName.sendKeys("Viquez");
        this.SubsFormEmail.sendKeys("sebas.viquez@gmail.com");
        this.SubsFormBreedName.click();
        this.SubsFormBreedAkita.click();
        this.AKCNibbleBox.click();
        this.AKCNibbleTrainingBox.click();
        this.AKCPupDateBox.click();
        this.AKCPupDateDogBreedBox.click();
        this.SubsFormBreedAkita.click();
        this.AKCPupDateDogsDateBirthBox.sendKeys("01/01/2020");
        this.SubsFormFamilyDogBox.click();
        this.SubsFormSubmitButton.click();
        this.SubsFormConfirmation.isDisplayed();

    }


    //Articles methods >


    public void allcategArticle() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(allcateg));
        this.allcateg.click();
        wait.until(ExpectedConditions.visibilityOf(allcateg));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(6) > div.page-container > div.page-layout > main > div.my4 > form")));

    }

    public void dogbreedArticle() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(dogbreeding));
        this.dogbreeding.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void healthArticle() {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(health));
        this.health.click();
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.elementToBeClickable(alternativeMed));
        this.alternativeMed.click();
        wait.until(ExpectedConditions.urlContains("expert-advice/health/alternative-medicine/"));

    }

    public void newsArticle() throws InterruptedException {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(news));
        this.news.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(editorPick));
        this.editorPick.click();
        wait.until(ExpectedConditions.urlContains("/expert-advice/news/?editor_pick%5B%5D=editor-pick"));

    }

    public void HomelivingArticle() throws InterruptedException {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(homeliving));
        this.homeliving.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        //All elements are check with Eyes Applitools

    }

    public void lifestyleArticle() throws InterruptedException {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(lifestyle));
        this.lifestyle.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        //All elements are check with Eyes method
    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }


}
