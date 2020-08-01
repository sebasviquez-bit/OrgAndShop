package Pages;
import Helpers.DriverHelper;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;

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

    @FindBy(xpath = "//html/body/div[2]/div/div[2]/div[5]/div[3]/div/div/div/ul/li[1]/a")
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

    @FindBy(xpath = "//*[@id=\"clubs-delegates\"]/div[3]/div/div/div/ul/li[7]/a")
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


    public void VerifyClubsDelegates(){

        this.clubdelegat.click();
        this.findclub.isDisplayed();
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

    public void Clicksearchallclub() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.searchallclub.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(253, 12);");
        this.searchallclub.click();
        //this.driver.get(this.driver.getCurrentUrl()+"?test=true"); //to add the string *
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickfindanevent() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.findanevent.isDisplayed();
        this.findanevent.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.findaneventElement.isDisplayed();

    }

    public void Clicktrainclass() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.trainclass.isDisplayed();
        this.trainclass.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://webapps.akc.org/"));

    }

    public void Clickaboutclub() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.aboutclub.isDisplayed();
        this.aboutclub.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.aboutclubElement.isDisplayed();

    }

    public void Clickformclub() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.formclub.isDisplayed();
        this.formclub.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.formclubElement.isDisplayed();

    }

    public void Clickclubdevelop() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.clubdevelop.isDisplayed();
        this.clubdevelop.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.clubdevelopElement.isDisplayed();

    }

    public void Clickpromoteclub() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.promoteclub.isDisplayed();
        this.promoteclub.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.promoteclubElement.isDisplayed();

    }

    public void Clickclubresources() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.clubresources.isDisplayed();
        this.clubresources.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.clubresourcesElement.isDisplayed();

    }

    public void Clickdelegatespor() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.delegatespor.isDisplayed();
        this.delegatespor.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.delegatesporElement.isDisplayed();

    }

    public void Clickdelegatesdir() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.delegatesdir.isDisplayed();
        this.delegatesdir.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.apps.akc.org/"));

    }

    public void Clickdelegatesmeet() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.delegatesmeet.isDisplayed();
        this.delegatesmeet.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.delegatesmeetElement.isDisplayed();

    }

    public void Clickboardmin() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.boardmin.isDisplayed();
        this.boardmin.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.boardminElement.isDisplayed();

    }

    public void Clickdelegatestan() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.delegatestan.isDisplayed();
        this.delegatestan.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.delegatestanElement.isDisplayed();

    }

    public void Clickperspective() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.perspective.isDisplayed();
        this.perspective.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.perspectiveElement.isDisplayed();

    }

    public void Clickakcgazette() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.akcgazette.isDisplayed();
        this.akcgazette.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.akcgazetteElement.isDisplayed();

    }

    public void Clickrolakcdel() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.rolakcdel.isDisplayed();
        this.rolakcdel.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("https://www.youtube.com/"));

    }

    public void Clickimportance() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.importance.isDisplayed();
        this.importance.click();
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlMatches("http://images.akc.org/pdf/The_Importance_of_Your_AKC_Delegate_2018.pdf"));

    }

    public void Clicklegisla() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.legisla.isDisplayed();
        this.legisla.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("akcgr.org/akc/lac?0"));

    }

    public void Clicklegislaalarm() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.legislaalarm.isDisplayed();
        this.legislaalarm.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.legislaalarmElement.isDisplayed();

    }

    public void Clickakcpac() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.akcpac.isDisplayed();
        this.akcpac.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.akcpacElement.isDisplayed();

    }

    public void Clickgovernrelat() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.governrelat.isDisplayed();
        this.governrelat.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.governrelatElement.isDisplayed();

    }

    public void Clickovercollec() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.overcollec.isDisplayed();
        this.overcollec.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.overcollecElement.isDisplayed();

    }

    public void Clickclubarchives() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.clubarchives.isDisplayed();
        this.clubarchives.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.clubarchivesElement.isDisplayed();

    }

    public void Clicksearchlib() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.searchlib.isDisplayed();
        this.searchlib.click();
        for (String winHandle : driver.getWindowHandles()) driver.switchTo().window(winHandle);
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.urlContains("http://a40015.eos-intl.net/"));

    }

    public void Clickhowtovisit() throws InterruptedException {

        this.clubdelegat.click();
        sleep(1000);
        this.howtovisit.isDisplayed();
        this.howtovisit.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        sleep(1000);
        this.howtovisitElement.isDisplayed();

    }

}
