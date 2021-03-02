package Pages;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClubsDelegates {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(5)")
    WebElement clubdelegat;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[1]/div[1]/h3")
    WebElement findclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")
    WebElement searchallclub;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[1]/div[1]/div/div/ul/li[2]/a")
    WebElement findanevent;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[1]/div[2]/h3")
    WebElement clubsoffer;

    @FindBy(css = "#clubs-delegates > div:nth-child(1) > div:nth-child(2) > div > div > ul > li > a")
    WebElement trainclass;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[2]/div/h3")
    WebElement clubs;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(1) > a")
    WebElement aboutclub;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[2]/div/div/div/ul/li[2]/a")
    WebElement formclub;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[2]/div/div/div/ul/li[3]/a")
    WebElement clubdevelop;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[2]/div/div/div/ul/li[4]/a")
    WebElement promoteclub;

    @FindBy(css = "#clubs-delegates > div:nth-child(2) > div > div > div > ul > li:nth-child(5) > a")
    WebElement clubresources;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[3]/div/h3")
    WebElement fordelegates;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(1) > a")
    WebElement delegatespor;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement delegatesdir;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[3]/div/div/div/ul/li[3]/a")
    WebElement delegatesmeet;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(4) > a")
    WebElement boardmin;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[3]/div/div/div/ul/li[5]/a")
    WebElement delegatestan;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[3]/div/div/div/ul/li[6]/a")
    WebElement perspective;

    @FindBy(css= "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(7) > a")
    WebElement akcgazette;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(8) > a")
    WebElement rolakcdel;

    @FindBy(css = "#clubs-delegates > div:nth-child(3) > div > div > div > ul > li:nth-child(9) > a")
    WebElement importance;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[4]/div[1]/div/div/ul/li[4]/a")
    WebElement governrelat;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(1) > div > div > ul > li:nth-child(1) > a")
    WebElement legisla;

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[4]/div[1]/div/div/ul/li[2]/a")
    WebElement legislaalarm;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(1) > div > div > ul > li:nth-child(3) > a")
    WebElement akcpac;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[4]/div[1]/div/div/ul/li[4]/a")
    WebElement governrelatio;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[4]/div[2]/h3")
    WebElement akclibrary;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(1) > a")
    WebElement overcollec;

    @FindBy(css = "#clubs-delegates > div:nth-child(4) > div:nth-child(2) > div > div > ul > li:nth-child(2) > a")
    WebElement clubarchives;

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[4]/div[2]/div/div/ul/li[3]/a")
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

    @FindBy(id = "page-title")
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
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void VerifyClubsDelegates() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(findclub));
        this.searchallclub.isDisplayed();
        this.findanevent.isDisplayed();
        this.clubsoffer.isDisplayed();
        this.trainclass.isDisplayed();
        this.clubs.isDisplayed();
        this.aboutclub.isDisplayed();
        this.formclub.isDisplayed();
        this.clubdevelop.isDisplayed();
        this.promoteclub.isDisplayed();
        this.clubresources.isDisplayed();
        this.fordelegates.isDisplayed();
        this.delegatespor.isDisplayed();
        this.delegatesdir.isDisplayed();
        this.delegatesmeet.isDisplayed();
        this.boardmin.isDisplayed();
        this.delegatestan.isDisplayed();
        this.perspective.isDisplayed();
        this.akcgazette.isDisplayed();
        this.rolakcdel.isDisplayed();
        this.importance.isDisplayed();
        this.governrelat.isDisplayed();
        this.legisla.isDisplayed();
        this.legislaalarm.isDisplayed();
        this.akcpac.isDisplayed();
        this.governrelat.isDisplayed();
        this.akclibrary.isDisplayed();
        this.overcollec.isDisplayed();
        this.clubarchives.isDisplayed();
        this.searchlib.isDisplayed();
        this.howtovisit.isDisplayed();

    }

    public void Clicksearchallclub() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(searchallclub));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(253, 12);");
        this.searchallclub.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickfindanevent() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(findanevent));
        this.findanevent.isDisplayed();
        this.findanevent.click();
        wait.until(ExpectedConditions.visibilityOf(findaneventElement));
        //this.driver.get(this.driver.getCurrentUrl()+"?test=true");

    }

    public void Clicktrainclass() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(trainclass));
        this.trainclass.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickaboutclub() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(aboutclub));
        this.aboutclub.click();
        wait.until(ExpectedConditions.visibilityOf(aboutclubElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clickformclub() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(formclub));
        this.formclub.click();
        wait.until(ExpectedConditions.visibilityOf(formclubElement));

    }

    public void Clickclubdevelop() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(clubdevelop));
        this.clubdevelop.click();
        wait.until(ExpectedConditions.visibilityOf(clubdevelopElement));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.clubdevelopElement.isDisplayed();

    }

    public void Clickpromoteclub() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(promoteclub));
        this.promoteclub.click();
        wait.until(ExpectedConditions.visibilityOf(promoteclubElement));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");


    }

    public void Clickclubresources() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(clubresources));
        this.clubresources.click();
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        wait.until(ExpectedConditions.visibilityOf(clubresourcesElement));

    }

    public void Clickdelegatespor() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(delegatespor));
        wait.until(ExpectedConditions.elementToBeClickable(delegatespor));
        this.delegatespor.click();
        wait.until(ExpectedConditions.visibilityOf(delegatesporElement));

    }

    public void Clickdelegatesdir() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(delegatesdir));
        wait.until(ExpectedConditions.elementToBeClickable(delegatesdir));
        this.delegatesdir.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickdelegatesmeet() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(delegatesmeet));
        this.delegatesmeet.click();
        wait.until(ExpectedConditions.visibilityOf(delegatesmeetElement));

    }

    public void Clickboardmin() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(boardmin));
        this.boardmin.click();
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        wait.until(ExpectedConditions.visibilityOf(boardminElement));

    }

    public void Clickdelegatestan() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(delegatestan));
        this.delegatestan.click();
        wait.until(ExpectedConditions.visibilityOf(delegatestanElement));

    }

    public void Clickperspective() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(perspective));
        this.perspective.click();
        wait.until(ExpectedConditions.visibilityOf(perspectiveElement));

    }

    public void Clickakcgazette() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(akcgazette));
        this.akcgazette.click();
        wait.until(ExpectedConditions.visibilityOf(akcgazetteElement));

    }

    public void Clickrolakcdel() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(rolakcdel));
        this.rolakcdel.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/"));

    }

    public void Clickimportance() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(importance));
        this.importance.click();
        wait.until(ExpectedConditions.urlMatches("http://images.akc.org/pdf/The_Importance_of_Your_AKC_Delegate_2018.pdf"));

    }

    public void Clicklegisla() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(legisla));
        this.legisla.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("https://cqrcengage.com/akc/lac"));

    }

    public void Clicklegislaalarm() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(legislaalarm));
        this.legislaalarm.click();
        wait.until(ExpectedConditions.visibilityOf(legislaalarmElement));

    }

    public void Clickakcpac() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(akcpac));
        this.akcpac.click();
        wait.until(ExpectedConditions.visibilityOf(akcpacElement));

    }

    public void Clickgovernrelat() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(governrelat));
        this.governrelat.click();
        wait.until(ExpectedConditions.visibilityOf(governrelatElement));

    }

    public void Clickovercollec() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(overcollec));
        this.overcollec.click();
        wait.until(ExpectedConditions.visibilityOf(overcollecElement));

    }

    public void Clickclubarchives() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(clubarchives));
        this.clubarchives.click();
        wait.until(ExpectedConditions.visibilityOf(clubarchivesElement));
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");

    }

    public void Clicksearchlib() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(searchlib));
        this.searchlib.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        wait.until(ExpectedConditions.urlContains("http://a40015.eos-intl.net/"));

    }

    public void Clickhowtovisit() {

        this.clubdelegat.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(howtovisit));
        this.howtovisit.click();
        wait.until(ExpectedConditions.visibilityOf(howtovisitElement));

    }

}
