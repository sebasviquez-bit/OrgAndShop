package Pages;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ClubsDelegates {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(5)")
    WebElement clubdelegat;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(1) > h3")
    WebElement findclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")
    WebElement searchallclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(2) > a")
    WebElement findanevent;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(2) > h3")
    WebElement clubsoffer;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(2) > div > div > ul > li > a")
    WebElement trainclass;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > h3")
    WebElement clubs;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(1) > a")
    WebElement aboutclub;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[2]/div/div/div/ul/li[2]/a")
    WebElement formclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(4) > a")
    WebElement clubdevelop;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(5) > a")
    WebElement promoteclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(6) > a")
    WebElement clubresources;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(7) > a")
    WebElement CentennialClubs;
    //

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > h3")
    WebElement fordelegates;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(1) > a")
    WebElement delegatespor;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement delegatesdir;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(3) > a")
    WebElement delegatesmeet;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(4) > a")
    WebElement boardmin;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(5) > a")
    WebElement delegatestan;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[3]/div/div/div/ul/li[6]/a")
    WebElement perspective;

    @FindBy(css= "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(7) > a")
    WebElement akcgazette;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(8) > a")
    WebElement rolakcdel;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(9) > a")
    WebElement importance;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(1) > div > div > ul > li:nth-child(4) > a")
    WebElement governrelat;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")
    WebElement legisla;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[4]/div[1]/div/div/ul/li[2]/a")
    WebElement legislaalarm;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(1) > div > div > ul > li:nth-child(3) > a")
    WebElement akcpac;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[4]/div[1]/div/div/ul/li[4]/a")
    WebElement governrelatio;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > h3")
    WebElement akclibrary;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(1) > a")
    WebElement overcollec;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(2) > a")
    WebElement clubarchives;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(3) > a")
    WebElement searchlib;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(4) > a")
    WebElement howtovisit;

    @FindBy(id = "page-title")
    WebElement findaneventElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement aboutclubElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement formclubElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement clubdevelopElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement promoteclubElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement clubresourcesElement;

    @FindBy(css = "#page-title > h1")
    WebElement delegatesporElement;

    @FindBy(css = "#page-title > h1")
    WebElement delegatesmeetElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement boardminElement;

    @FindBy(css = "#page-title > h1")
    WebElement delegatestanElement;

    @FindBy(css = "#page-title > h1")
    WebElement perspectiveElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcgazetteElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement importanceElement;

    @FindBy(css = "#page-title > h1")
    WebElement legislaalarmElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement akcpacElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement governrelatElement;

    @FindBy(css = "#page-title > h1")
    WebElement overcollecElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement clubarchivesElement;

    @FindBy(css = "#page-title > div > h1")
    WebElement howtovisitElement;


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public ClubsDelegates(WebDriver _driver) {
        driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifyClubsDelegates() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(findclub)); //fix this
        searchallclub.isDisplayed();
        findanevent.isDisplayed();
        clubsoffer.isDisplayed();
        trainclass.isDisplayed();
        clubs.isDisplayed();
        aboutclub.isDisplayed();
        formclub.isDisplayed();
        clubdevelop.isDisplayed();
        promoteclub.isDisplayed();
        clubresources.isDisplayed();
        fordelegates.isDisplayed();
        delegatespor.isDisplayed();
        delegatesdir.isDisplayed();
        delegatesmeet.isDisplayed();
        boardmin.isDisplayed();
        delegatestan.isDisplayed();
        perspective.isDisplayed();
        akcgazette.isDisplayed();
        rolakcdel.isDisplayed();
        importance.isDisplayed();
        governrelat.isDisplayed();
        legisla.isDisplayed();
        legislaalarm.isDisplayed();
        akcpac.isDisplayed();
        governrelat.isDisplayed();
        akclibrary.isDisplayed();
        overcollec.isDisplayed();
        clubarchives.isDisplayed();
        searchlib.isDisplayed();
        howtovisit.isDisplayed();

    }

    public void Clicksearchallclub() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchallclub));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(253, 12);");
        searchallclub.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/club-search/"));

    }

    public void Clickfindanevent() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(findanevent)); //fix this
        findanevent.click();
        wait.until(ExpectedConditions.visibilityOf(findaneventElement));
        //driver.get(driver.getCurrentUrl()+"?test=true");

    }

    public void Clicktrainclass() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(trainclass));
        trainclass.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/obedience-training-club/"));

    }

    public void Clickaboutclub() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(aboutclub));
        aboutclub.click();
        wait.until(ExpectedConditions.visibilityOf(aboutclubElement));

    }

    public void Clickformclub() { //This option was removed from the menu

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(formclub));
        formclub.click();
        wait.until(ExpectedConditions.visibilityOf(formclubElement));

    }

    public void Clickclubdevelop() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdevelop));
        clubdevelop.click();
        wait.until(ExpectedConditions.visibilityOf(clubdevelopElement));

    }

    public void Clickpromoteclub() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(promoteclub));
        promoteclub.click();
        wait.until(ExpectedConditions.urlContains("/promote/"));

    }

    public void Clickclubresources() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubresources));
        clubresources.click();
        wait.until(ExpectedConditions.visibilityOf(clubresourcesElement));

    }

    public void ClickCentennialsClub() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(CentennialClubs));  //ONLY available on prod
        CentennialClubs.click();
        wait.until(ExpectedConditions.urlContains("/centennial-clubs/"));

    }

    public void Clickdelegatespor() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(delegatespor));
        delegatespor.click();
        wait.until(ExpectedConditions.visibilityOf(delegatesporElement));

    }

    public void Clickdelegatesdir() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(delegatesdir));
        delegatesdir.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickdelegatesmeet() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(delegatesmeet));
        delegatesmeet.click();
        wait.until(ExpectedConditions.visibilityOf(delegatesmeetElement));

    }

    public void Clickboardmin() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(boardmin));
        boardmin.click();
        wait.until(ExpectedConditions.visibilityOf(boardminElement));

    }

    public void Clickdelegatestan() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(delegatestan));
        delegatestan.click();
        wait.until(ExpectedConditions.visibilityOf(delegatestanElement));

    }

    public void Clickperspective() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(perspective));
        perspective.click();
        wait.until(ExpectedConditions.visibilityOf(perspectiveElement));

    }

    public void Clickakcgazette() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcgazette));
        akcgazette.click();
        wait.until(ExpectedConditions.visibilityOf(akcgazetteElement));

    }

    public void Clickrolakcdel() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(rolakcdel));
        rolakcdel.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/"));

    }

    public void Clickimportance() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(importance));
        importance.click();
        wait.until(ExpectedConditions.urlMatches("https://images.akc.org/pdf/The_Importance_of_Your_AKC_Delegate_2018.pdf"));

    }

    public void Clicklegisla() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(legisla));
        legisla.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.votervoice.net/"));

    }

    public void Clicklegislaalarm() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(legislaalarm));
        legislaalarm.click();
        wait.until(ExpectedConditions.visibilityOf(legislaalarmElement));

    }

    public void Clickakcpac() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(akcpac));
        akcpac.click();
        wait.until(ExpectedConditions.visibilityOf(akcpacElement));

    }

    public void Clickgovernrelat() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(governrelat));
        governrelat.click();
        wait.until(ExpectedConditions.visibilityOf(governrelatElement));

    }

    public void Clickovercollec() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(overcollec));
        overcollec.click();
        wait.until(ExpectedConditions.visibilityOf(overcollecElement));

    }

    public void Clickclubarchives() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubarchives));
        clubarchives.click();
        wait.until(ExpectedConditions.visibilityOf(clubarchivesElement));

    }

    public void Clicksearchlib() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(searchlib));
        searchlib.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/a40015.eos-intl.net/"));

    }

    public void Clickhowtovisit() {

        clubdelegat.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(howtovisit));
        howtovisit.click();
        wait.until(ExpectedConditions.visibilityOf(howtovisitElement));

    }

}

