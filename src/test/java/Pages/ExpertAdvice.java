package Pages;

import Helpers.DriverHelper;
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

    @FindBy(css = "body > div:nth-child(7) > div.page-container > div.page-layout > main > div.my4 > form > div > div:nth-child(2) > div > label")
    WebElement editorPick;

    @FindBy(css = "body > div:nth-child(6) > div.page-container > div.page-layout > aside > div > nav > ul > li:nth-child(1) > a")
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


    //Click methods for expertAdvice Menu tabs


    public void Clickartexpadv() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.artexpadv.isDisplayed();
        this.artexpadv.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.artexpadvElement.isDisplayed();

    }

    public void Clickallcateg() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.allcateg.isDisplayed();
        this.allcateg.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.allcategElement.isDisplayed();

    }

    public void Clickdogbreeding() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.dogbreeding.isDisplayed();
        this.dogbreeding.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.dogbreedingElement.isDisplayed();

    }

    public void Clickgrooming() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.grooming.isDisplayed();
        this.grooming.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(2000);
        this.groomingElement.isDisplayed();

    }

    public void Clickhealth() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"expert-advice\"]/div[2]/div/div/div[1]/ul/li[4]/a")));
        this.health.isDisplayed();
        this.health.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        this.healthElement.isDisplayed();

    }

    public void Clickhomeliving() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.homeliving.isDisplayed();
        this.homeliving.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.homelivingElement.isDisplayed();

    }

    public void Clicklifestyle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.lifestyle.isDisplayed();
        this.lifestyle.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.lifestyleElement.isDisplayed();

    }

    public void Clicknews() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.news.isDisplayed();
        this.news.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.newsElement.isDisplayed();

    }

    public void Clicknutrition() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.nutrition.isDisplayed();
        this.nutrition.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.nutritionElement.isDisplayed();

    }

    public void Clickpuppyinfo() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.puppyinfo.isDisplayed();
        this.puppyinfo.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.puppyinfoElement.isDisplayed();

    }

    public void Clicksports() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.sports.isDisplayed();
        this.sports.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.sportsElement.isDisplayed();

    }

    public void Clicktraining() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.training.isDisplayed();
        this.training.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.trainingElement.isDisplayed();

    }

    public void Clickvetcorner() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.vetcorner.isDisplayed();
        this.vetcorner.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.vetcornerElement.isDisplayed();

    }

    public void ClickfindmatchOnExpAdvMenu() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.findmatch.isDisplayed();
        this.findmatch.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.findmatchElement.isDisplayed();

    }

    public void Clickdognamefind() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.dognamefind.isDisplayed();
        this.dognamefind.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.dognamefindElement.isDisplayed();

    }

    public void Clickcandogeat() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.candogeat.isDisplayed();
        this.candogeat.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.candogeatElement.isDisplayed();

    }

    public void Clickakctv() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"expert-advice\"]/div[4]/div/div/div/ul/li[1]/a")));
        this.akctv.isDisplayed();
        this.akctv.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlToBe("https://akc.tv/"));

    }

    public void Clickakcmag() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.akcmag.isDisplayed();
        this.akcmag.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akcmagElement.isDisplayed();

    }

    public void Clicknewsletter() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.newsletter.isDisplayed();
        this.newsletter.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.newsletterElement.isDisplayed();

    }

    public void Clickpresscenter() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.presscenter.isDisplayed();
        this.presscenter.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.presscenterElement.isDisplayed();

    }

    public void Clickakcdetection() throws InterruptedException {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(5) > a")));
        Actions actions = new Actions(driver);
        actions.moveToElement(akceducation).perform();
        assert(akcdetection.isEnabled());
        this.akcdetection.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#page-title > div > h1")));
        //this.akcdetectionElement.isDisplayed();

    }

    public void Clickakccanine() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(6) > a")));
        this.akccanine.isDisplayed();
        this.akccanine.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        final Boolean until = wait.until(ExpectedConditions.urlContains("https://www.caninecollege.akc.org/"));

    }

    public void Clickgovernment() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.government.isDisplayed();
        this.government.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.governmentElement.isDisplayed();

    }

    public void Clickakceducation() throws InterruptedException {

        this.menuexpadv.click();
        Actions actions = new Actions(driver);
        actions.moveToElement(akceducation).perform();
        assert(akceducation.isEnabled());
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(8) > a")));
        this.akceducation.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akceducationElement.isDisplayed();

    }

    public void Clickakclibrary() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.akclibrary.isDisplayed();
        this.akclibrary.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.akclibraryElement.isDisplayed();

    }

    public void SubscriptionForm () {

        this.menuexpadv.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#expert-advice > div:nth-child(4) > div > div > div > ul > li:nth-child(3) > a")));
        Actions actions = new Actions(driver);
        actions.moveToElement(newsletter).perform();
        this.newsletter.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > main > div > div.bgc-white.cmw > div > div > div.subscription__page-header-container > h1")));
        this.newsletterElement.isDisplayed();
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


    public void allcategArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.allcateg.isDisplayed();
        this.allcateg.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(6) > div.page-container > div.page-layout > main > div.my4 > form")));

    }

    public void dogbreedArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.dogbreeding.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(512, 136);");
        this.dogbreeding.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

    public void healthArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.health.isDisplayed();
        this.health.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div:nth-child(6) > div.page-container > div.page-layout > aside > div > nav > ul > li:nth-child(1) > a")));
        this.alternativeMed.click();
        wait.until(ExpectedConditions.urlContains("akc.org/expert-advice/health/alternative-medicine/"));

    }

    public void newsArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.news.isDisplayed();
        this.news.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        Actions actions = new Actions(driver);
        actions.moveToElement(editorPick).perform();
        assert(editorPick.isEnabled());
        this.editorPick.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.urlContains("akc.org/expert-advice/news/?editor_pick%5B%5D=editor-pick"));

    }

    public void HomelivingArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.homeliving.isDisplayed();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#expert-advice > div:nth-child(2) > div > div > div:nth-child(1) > ul > li:nth-child(5) > a")));
        this.homeliving.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

    public void lifestyleArticle() throws InterruptedException {

        this.menuexpadv.click();
        sleep(1000);
        this.lifestyle.isDisplayed();
        this.lifestyle.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);

    }

}
