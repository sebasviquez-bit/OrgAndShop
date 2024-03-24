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

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();;
        wait.until(ExpectedConditions.visibilityOf(findclub)); //fix this
        wait.until(ExpectedConditions.visibilityOf(searchallclub));
        wait.until(ExpectedConditions.visibilityOf(findanevent));
        wait.until(ExpectedConditions.visibilityOf(clubsoffer));
        wait.until(ExpectedConditions.visibilityOf(trainclass));
        wait.until(ExpectedConditions.visibilityOf(clubs));
        wait.until(ExpectedConditions.visibilityOf(aboutclub));
        wait.until(ExpectedConditions.visibilityOf(formclub));
        wait.until(ExpectedConditions.visibilityOf(clubdevelop));
        wait.until(ExpectedConditions.visibilityOf(promoteclub));
        wait.until(ExpectedConditions.visibilityOf(clubresources));
        wait.until(ExpectedConditions.visibilityOf(fordelegates));
        wait.until(ExpectedConditions.visibilityOf(delegatespor));
        wait.until(ExpectedConditions.visibilityOf(delegatesdir));
        wait.until(ExpectedConditions.visibilityOf(delegatesmeet));
        wait.until(ExpectedConditions.visibilityOf(boardmin));
        wait.until(ExpectedConditions.visibilityOf(delegatestan));
        wait.until(ExpectedConditions.visibilityOf(perspective));
        wait.until(ExpectedConditions.visibilityOf(akcgazette));
        wait.until(ExpectedConditions.visibilityOf(rolakcdel));
        wait.until(ExpectedConditions.visibilityOf(importance));
        wait.until(ExpectedConditions.visibilityOf(governrelat));
        wait.until(ExpectedConditions.visibilityOf(legisla));
        wait.until(ExpectedConditions.visibilityOf(legislaalarm));
        wait.until(ExpectedConditions.visibilityOf(akcpac));
        wait.until(ExpectedConditions.visibilityOf(governrelat));
        wait.until(ExpectedConditions.visibilityOf(akclibrary));
        wait.until(ExpectedConditions.visibilityOf(overcollec));
        wait.until(ExpectedConditions.visibilityOf(clubarchives));
        wait.until(ExpectedConditions.visibilityOf(searchlib));
        wait.until(ExpectedConditions.visibilityOf(howtovisit));

    }

    public void Clicksearchallclub() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchallclub));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(253, 12);");
        wait.until(ExpectedConditions.elementToBeClickable(searchallclub)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/club-search/"));

    }

    public void Clickfindanevent() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(findanevent)); //fix this selector
        wait.until(ExpectedConditions.elementToBeClickable(findanevent)).click();
        wait.until(ExpectedConditions.visibilityOf(findaneventElement));
        //driver.get(driver.getCurrentUrl()+"?test=true");

    }

    public void Clicktrainclass() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(trainclass));
        wait.until(ExpectedConditions.elementToBeClickable(trainclass)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/obedience-training-club/"));

    }

    public void Clickaboutclub() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(aboutclub));
        wait.until(ExpectedConditions.elementToBeClickable(aboutclub)).click();
        wait.until(ExpectedConditions.visibilityOf(aboutclubElement));

    }

    public void Clickformclub() { //This option was removed from the menu

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(formclub));
        wait.until(ExpectedConditions.elementToBeClickable(formclub)).click();
        wait.until(ExpectedConditions.visibilityOf(formclubElement));

    }

    public void Clickclubdevelop() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(clubdevelop));
        wait.until(ExpectedConditions.elementToBeClickable(clubdevelop)).click();
        wait.until(ExpectedConditions.visibilityOf(clubdevelopElement));

    }

    public void Clickpromoteclub() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(promoteclub));
        wait.until(ExpectedConditions.elementToBeClickable(promoteclub)).click();
        wait.until(ExpectedConditions.urlContains("/promote/"));

    }

    public void Clickclubresources() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(clubresources));
        wait.until(ExpectedConditions.elementToBeClickable(clubresources)).click();
        wait.until(ExpectedConditions.visibilityOf(clubresourcesElement));

    }

    public void ClickCentennialsClub() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(CentennialClubs));  //ONLY available on prod
        wait.until(ExpectedConditions.elementToBeClickable(CentennialClubs)).click();
        wait.until(ExpectedConditions.urlContains("/centennial-clubs/"));

    }

    public void Clickdelegatespor() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(delegatespor));
        wait.until(ExpectedConditions.elementToBeClickable(delegatespor)).click();
        wait.until(ExpectedConditions.visibilityOf(delegatesporElement));

    }

    public void Clickdelegatesdir() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(delegatesdir));
        wait.until(ExpectedConditions.elementToBeClickable(delegatesdir)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickdelegatesmeet() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(delegatesmeet));
        wait.until(ExpectedConditions.elementToBeClickable(delegatesmeet)).click();
        wait.until(ExpectedConditions.visibilityOf(delegatesmeetElement));

    }

    public void Clickboardmin() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(boardmin));
        wait.until(ExpectedConditions.elementToBeClickable(boardmin)).click();
        wait.until(ExpectedConditions.visibilityOf(boardminElement));

    }

    public void Clickdelegatestan() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(delegatestan));
        wait.until(ExpectedConditions.elementToBeClickable(delegatestan)).click();
        wait.until(ExpectedConditions.visibilityOf(delegatestanElement));

    }

    public void Clickperspective() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(perspective));
        wait.until(ExpectedConditions.elementToBeClickable(perspective)).click();
        wait.until(ExpectedConditions.visibilityOf(perspectiveElement));

    }

    public void Clickakcgazette() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcgazette));
        wait.until(ExpectedConditions.elementToBeClickable(akcgazette)).click();
        wait.until(ExpectedConditions.visibilityOf(akcgazetteElement));

    }

    public void Clickrolakcdel() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(rolakcdel));
        wait.until(ExpectedConditions.elementToBeClickable(rolakcdel)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/"));

    }

    public void Clickimportance() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(importance));
        wait.until(ExpectedConditions.elementToBeClickable(importance)).click();
        wait.until(ExpectedConditions.urlMatches("https://images.akc.org/pdf/The_Importance_of_Your_AKC_Delegate_2018.pdf"));

    }

    public void Clicklegisla() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(legisla));
        wait.until(ExpectedConditions.elementToBeClickable(legisla)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.votervoice.net/"));

    }

    public void Clicklegislaalarm() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(legislaalarm));
        wait.until(ExpectedConditions.elementToBeClickable(legislaalarm)).click();
        wait.until(ExpectedConditions.visibilityOf(legislaalarmElement));

    }

    public void Clickakcpac() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(akcpac));
        wait.until(ExpectedConditions.elementToBeClickable(akcpac)).click();
        wait.until(ExpectedConditions.visibilityOf(akcpacElement));

    }

    public void Clickgovernrelat() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(governrelat));
        wait.until(ExpectedConditions.elementToBeClickable(governrelat)).click();
        wait.until(ExpectedConditions.visibilityOf(governrelatElement));

    }

    public void Clickovercollec() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(overcollec));
        wait.until(ExpectedConditions.elementToBeClickable(overcollec)).click();
        wait.until(ExpectedConditions.visibilityOf(overcollecElement));

    }

    public void Clickclubarchives() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(clubarchives));
        wait.until(ExpectedConditions.elementToBeClickable(clubarchives)).click();
        wait.until(ExpectedConditions.visibilityOf(clubarchivesElement));

    }

    public void Clicksearchlib() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(searchlib));
        wait.until(ExpectedConditions.elementToBeClickable(searchlib)).click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("/a40015.eos-intl.net/"));

    }

    public void Clickhowtovisit() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(clubdelegat)).click();
        wait.until(ExpectedConditions.elementToBeClickable(howtovisit));
        wait.until(ExpectedConditions.elementToBeClickable(howtovisit)).click();
        wait.until(ExpectedConditions.visibilityOf(howtovisitElement));

    }

}

