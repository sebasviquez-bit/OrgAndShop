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

import java.time.Duration;

import static java.lang.Thread.sleep;


public class ExpertAdvice {

    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(2)")
    WebElement menuexpadv;

    @FindBy(css = "#expert-advice > div:nth-child(1) > div > div > div.content-card__body > a")
    WebElement artexpadv;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement allcateg;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement dogbreeding;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement grooming;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement health;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(5) > a")
    WebElement homeliving;

    @FindBy(css = "#expert-advice > div:nth-child(1) > div > div > div.content-card__body > div > a")
    WebElement lifestyle;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(5) > a")
    WebElement news;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(4) > a")
    WebElement nutrition;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement puppyinfo;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement sports;

    @FindBy(css = "#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(5) > a")
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

    @FindBy(xpath = "//*[@id=\"expert-advice\"]/div[4]/div/div/div/ul/li[9]/a")
    WebElement akclibrary;

    @FindBy(css = "#page-title > h1")
    WebElement artexpadvElement;

    @FindBy(css = "#page-title > h1")
    WebElement allcategElement;

    @FindBy(css = "#i-am-a-breeder > div > span")
    WebElement dogbreedingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement groomingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement healthElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement homelivingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement lifestyleElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement newsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement nutritionElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement puppyinfoElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement sportsElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement trainingElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement vetcornerElement;

    @FindBy(css = "#breed-select-template > div > div > div.page-layout > main > div.breed-select-intro-title.mb2.bps-mb8 > div.breed-select-intro-title__title > h1")
    WebElement findmatchElement;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > h1")
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

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public ExpertAdvice(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void VerifyExpAdv(){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.visibilityOf(artexpadv));
        wait.until(ExpectedConditions.visibilityOf(allcateg));
        wait.until(ExpectedConditions.visibilityOf(dogbreeding));
        wait.until(ExpectedConditions.visibilityOf(grooming));
        wait.until(ExpectedConditions.visibilityOf(health));
        wait.until(ExpectedConditions.visibilityOf(homeliving));
        //wait.until(ExpectedConditions.visibilityOf(lifestyle)); this was removed on test and prod
        wait.until(ExpectedConditions.visibilityOf(news));
        wait.until(ExpectedConditions.visibilityOf(nutrition));
        wait.until(ExpectedConditions.visibilityOf(puppyinfo));
        wait.until(ExpectedConditions.visibilityOf(sports));
        wait.until(ExpectedConditions.visibilityOf(training));
        wait.until(ExpectedConditions.visibilityOf(vetcorner));
        wait.until(ExpectedConditions.visibilityOf(findmatch));
        wait.until(ExpectedConditions.visibilityOf(dognamefind));
        wait.until(ExpectedConditions.visibilityOf(candogeat));
        wait.until(ExpectedConditions.visibilityOf(akctv));
        wait.until(ExpectedConditions.visibilityOf(akcmag));
        wait.until(ExpectedConditions.visibilityOf(newsletter));
        wait.until(ExpectedConditions.visibilityOf(presscenter));
        wait.until(ExpectedConditions.visibilityOf(akcdetection));
        wait.until(ExpectedConditions.visibilityOf(akccanine));
        wait.until(ExpectedConditions.visibilityOf(government));
        wait.until(ExpectedConditions.visibilityOf(akceducation));
        wait.until(ExpectedConditions.visibilityOf(akclibrary));
    }


    //Click methods for ExpertAdvice Menu tabs


    public void Clickartexpadv() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(artexpadv));
        wait.until(ExpectedConditions.elementToBeClickable(artexpadv)).click();
        wait.until(ExpectedConditions.visibilityOf(artexpadvElement));

    }

    public void Clickallcateg() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(allcateg));
        wait.until(ExpectedConditions.elementToBeClickable(allcateg)).click();
        wait.until(ExpectedConditions.visibilityOf(allcategElement));

    }

    public void Clickdogbreeding() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dogbreeding));
        wait.until(ExpectedConditions.elementToBeClickable(dogbreeding)).click();
        wait.until(ExpectedConditions.visibilityOf(dogbreedingElement));

    }

    public void Clickgrooming() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(grooming));
        wait.until(ExpectedConditions.elementToBeClickable(grooming)).click();
        wait.until(ExpectedConditions.visibilityOf(groomingElement));

    }

    public void Clickhealth() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(health));
        wait.until(ExpectedConditions.elementToBeClickable(health)).click();
        wait.until(ExpectedConditions.visibilityOf(healthElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clickhomeliving() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(homeliving));
        wait.until(ExpectedConditions.elementToBeClickable(homeliving)).click();
        wait.until(ExpectedConditions.visibilityOf(homelivingElement));

    }

    public void Clicklifestyle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lifestyle));
        wait.until(ExpectedConditions.elementToBeClickable(lifestyle)).click();
        wait.until(ExpectedConditions.visibilityOf(lifestyleElement));

    }

    public void Clicknews() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(news));
        wait.until(ExpectedConditions.elementToBeClickable(news)).click();
        wait.until(ExpectedConditions.visibilityOf(newsElement));
        //driver.get(driver.getCurrentUrl() + "?test=true");

    }

    public void Clicknutrition() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(nutrition));
        wait.until(ExpectedConditions.elementToBeClickable(nutrition)).click();
        wait.until(ExpectedConditions.visibilityOf(nutritionElement));

    }

    public void Clickpuppyinfo() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(puppyinfo));
        wait.until(ExpectedConditions.elementToBeClickable(puppyinfo)).click();
        wait.until(ExpectedConditions.visibilityOf(puppyinfoElement));

    }

    public void Clicksports() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(sports));
        wait.until(ExpectedConditions.elementToBeClickable(sports)).click();
        wait.until(ExpectedConditions.visibilityOf(sportsElement));

    }

    public void Clicktraining() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(training));
        wait.until(ExpectedConditions.elementToBeClickable(training)).click();
        wait.until(ExpectedConditions.visibilityOf(trainingElement));

    }

    public void Clickvetcorner() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(vetcorner));
        wait.until(ExpectedConditions.elementToBeClickable(vetcorner)).click();
        wait.until(ExpectedConditions.visibilityOf(vetcornerElement));

    }

    public void ClickfindmatchOnExpAdvMenu() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        wait.until(ExpectedConditions.elementToBeClickable(findmatch)).click();
        wait.until(ExpectedConditions.visibilityOf(findmatchElement));

    }

    public void Clickdognamefind() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dognamefind));
        wait.until(ExpectedConditions.elementToBeClickable(dognamefind)).click();
        wait.until(ExpectedConditions.visibilityOf(dognamefindElement));

    }

    public void Clickcandogeat()  {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(candogeat));
        wait.until(ExpectedConditions.elementToBeClickable(candogeat)).click(); //fix this
        wait.until(ExpectedConditions.visibilityOf(candogeatElement));

    }

    public void Clickakctv() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akctv));
        wait.until(ExpectedConditions.elementToBeClickable(akctv)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlToBe("https://akc.tv/"));

    }

    public void Clickakcmag() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcmag));
        wait.until(ExpectedConditions.elementToBeClickable(akcmag)).click();
        wait.until(ExpectedConditions.visibilityOf(akcmagElement));

    }

    public void Clicknewsletter() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(newsletter));
        wait.until(ExpectedConditions.elementToBeClickable(newsletter)).click();
        wait.until(ExpectedConditions.visibilityOf(newsletterElement));

    }

    public void Clickpresscenter() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(presscenter));
        wait.until(ExpectedConditions.elementToBeClickable(presscenter)).click();
        wait.until(ExpectedConditions.visibilityOf(presscenterElement));

    }

    public void Clickakcdetection() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcdetection));
        wait.until(ExpectedConditions.elementToBeClickable(akcdetection)).click();
        wait.until(ExpectedConditions.visibilityOf(akcdetectionElement));



    }

    public void Clickakccanine() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akccanine));
        wait.until(ExpectedConditions.elementToBeClickable(akccanine)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.caninecollege"));

    }

    public void Clickgovernment() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(government));
        wait.until(ExpectedConditions.elementToBeClickable(government)).click();
        wait.until(ExpectedConditions.visibilityOf(governmentElement));

    }

    public void Clickakceducation() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akceducation));
        wait.until(ExpectedConditions.elementToBeClickable(akceducation)).click();
        wait.until(ExpectedConditions.visibilityOf(akceducationElement));

    }

    public void Clickakclibrary() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akclibrary));
        wait.until(ExpectedConditions.elementToBeClickable(akclibrary)).click();
        wait.until(ExpectedConditions.visibilityOf(akclibraryElement));

    }

    public void SubscriptionForm () {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(newsletter));
        wait.until(ExpectedConditions.elementToBeClickable(newsletter)).click();
        wait.until(ExpectedConditions.visibilityOf(newsletterElement));
        SubsFormFirstName.sendKeys("Sebas");
        SubsFormLastName.sendKeys("Viquez");
        SubsFormEmail.sendKeys("sebas.viquez@gmail.com");
        wait.until(ExpectedConditions.elementToBeClickable(SubsFormBreedName)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SubsFormBreedAkita)).click();
        HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(AKCNibbleBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AKCNibbleTrainingBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AKCPupDateBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(AKCPupDateDogBreedBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SubsFormBreedAkita)).click();
        AKCPupDateDogsDateBirthBox.sendKeys("01/01/2020");
        wait.until(ExpectedConditions.elementToBeClickable(SubsFormFamilyDogBox)).click();
        wait.until(ExpectedConditions.elementToBeClickable(SubsFormSubmitButton)).click();
        wait.until(ExpectedConditions.visibilityOf(SubsFormConfirmation));

    }


    //Articles methods >


    public void allcategArticle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(allcateg));
        wait.until(ExpectedConditions.elementToBeClickable(allcateg)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(6) > div.page-container > div.page-layout > main > div.my4 > form")));

    }

    public void dogbreedArticle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(dogbreeding));
        wait.until(ExpectedConditions.elementToBeClickable(dogbreeding)).click();

    }

    public void healthArticle() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(health));
        wait.until(ExpectedConditions.elementToBeClickable(health)).click();
        wait.until(ExpectedConditions.elementToBeClickable(alternativeMed));
        wait.until(ExpectedConditions.elementToBeClickable(alternativeMed)).click();
        wait.until(ExpectedConditions.urlContains("expert-advice/health/alternative-medicine/"));

    }

    public void newsArticle() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(news));
        wait.until(ExpectedConditions.elementToBeClickable(news)).click();
        wait.until(ExpectedConditions.visibilityOf(editorPick));
        wait.until(ExpectedConditions.elementToBeClickable(editorPick)).click();
        wait.until(ExpectedConditions.urlContains("/expert-advice/news/?editor_pick%5B%5D=editor-pick"));

    }

    public void HomelivingArticle() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(homeliving));
        wait.until(ExpectedConditions.elementToBeClickable(homeliving)).click();
        //All elements are check with Eyes Applitools

    }

    public void lifestyleArticle() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(menuexpadv)).click();
        wait.until(ExpectedConditions.elementToBeClickable(lifestyle));
        wait.until(ExpectedConditions.elementToBeClickable(lifestyle)).click();
        //All elements are check with Eyes method
    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }

}
