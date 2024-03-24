package Pages;
import Helpers.DriverHelper;
import Model.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DogName {


    @FindBy(css = "#site-header > div > div.desktop-header > div > div.primary-nav > nav > a:nth-child(2)")
    WebElement ExpertAdvicemenu;

    @FindBy(css = "#expert-advice > div:nth-child(3) > div > div > div > ul > li:nth-child(2) > a")
    WebElement EAmenuDNF;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div.breed-feature__wrapper > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__wrap > div:nth-child(4) > a")
    WebElement dognametool;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/h2[2]")
    WebElement dognameheader;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[1]")
    WebElement male;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[2]")
    WebElement female;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[1]/label[3]")
    WebElement all;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[1]/label")
    WebElement a;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[2]/label")
    WebElement b;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[3]/label")
    WebElement c;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[4]/label")
    WebElement d;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[5]/label")
    WebElement e;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[6]/label")
    WebElement f;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[7]/label")
    WebElement g;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[8]/label")
    WebElement h;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[9]/label")
    WebElement i;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[10]/label")
    WebElement j;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[11]/label")
    WebElement k;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[12]/label")
    WebElement l;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[13]/label")
    WebElement m;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[14]/label")
    WebElement n;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[15]/label")
    WebElement o;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[16]/label")
    WebElement p;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[17]/label")
    WebElement q;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[18]/label")
    WebElement r;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[19]/label")
    WebElement s;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[20]/label")
    WebElement t;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[21]/label")
    WebElement u;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[22]/label")
    WebElement v;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[23]/label")
    WebElement w;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[24]/label")
    WebElement x;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[25]/label")
    WebElement y;

    @FindBy(xpath = "//html/body/main/div/section/div[1]/form/div[2]/div[26]/label")
    WebElement z;

    @FindBy(xpath = "//*[@id=\"reset\"]")
    WebElement clear;

    @FindBy(xpath = "//html/body/main/div/section/div[3]/h1")
    WebElement listnamesheader;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div/ul")
    WebElement listnames;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[1]")
    WebElement pict;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]")
    WebElement box;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[1]/a")
    WebElement allcat;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[2]/a")
    WebElement baby;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[3]/a")
    WebElement celebrity;

    @FindBy(css = "#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")
    WebElement cute;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[5]/a")
    WebElement disney;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[6]/a")
    WebElement fancy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[7]/a")
    WebElement mostpop;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[8]/a")
    WebElement presi;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[9]/a")
    WebElement techy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[10]/a")
    WebElement television;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[11]/a")
    WebElement trendy;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[12]/a")
    WebElement unisex;

    @FindBy(xpath = "//html/body/main/div/aside[1]/div/div[4]/ul/li[13]/a")
    WebElement videogame;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[1]/button")
    WebElement but1;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[2]/button")
    WebElement but2;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[3]/button")
    WebElement but3;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[4]/button")
    WebElement but4;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[5]/button")
    WebElement but5;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/ul/li[6]/button")
    WebElement but6;


    //New locators


    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > h1")
    WebElement pageTitle;

    @FindBy(css = "#react-select-2-input")
    WebElement inputBar;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > button.dog-name-archive__search__box__filter-button")
    WebElement FilterButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > div.dog-name-archive__search__box__filters.dog-name-archive__search__box__filters--show > div:nth-child(1) > div:nth-child(2) > label > span.checkbox__visual-input")
    WebElement OneWordFilter;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > div.dog-name-archive__search__box__filters.dog-name-archive__search__box__filters--show > div.dog-name-archive__search__box__filter.dog-name-archive__search__box__filter--length > input[type=range]")
    WebElement LenghtBarFilter;

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > form > button.button.dog-name-archive__search__box__submit")
    WebElement FindNamesButton;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li:nth-child(1) > a")
    WebElement AaronName;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li > a > p")
    WebElement YodaName;


    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__items > div > ul > li:nth-child(1) > a > p")
    WebElement AlexanderName;
    //

    @FindBy(css = "body > main > div > div.dog-name-archive__hero > div > div.dog-name-archive__search > a")
    WebElement SurpriceMeButton;

    @FindBy(css = "body > main > div > form > h2")
    WebElement SurpriceMeNames;


    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__categories-wrap > form > div > div:nth-child(2)")
    WebElement PupolarOption;

    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__categories-wrap > form > button")
    WebElement GenerateNamesButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__section.dog-name-archive__search-by-category > div.dog-name-archive__search-by-category__pupdate > div > form > div > input")
    WebElement PupDateEmailInput;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__bottom-menus > a")
    WebElement MySavedNamesButton;

    @FindBy(css = "body > main > div > form > div.dog-name-archive__results__bottom-menus > a")
    WebElement AaronNameFavoriteIcon;

    @FindBy(css = "body > main > div > div.dog-name-archive__details-overlay > div > div.dog-name-archive__details__buttons > div > a")
    WebElement SaveToListButton;

    @FindBy(css = "body > main > div > div.dog-name-archive__details-overlay > div > div.dog-name-archive__details__buttons > div > a.button.button--small.dog-name-archive__details__button.dog-name-archive__details__button--saved > svg")
    WebElement SavedToYourList;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[3]/input")
    WebElement userName;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[1]/div[4]/input")
    WebElement password;

    @FindBy(xpath = "//*[@id=\"gigya-login-form\"]/div[3]/div/input")
    WebElement login;



    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public DogName(WebDriver _driver){
        driver = _driver;
        PageFactory.initElements(driver,this);
    }


    public void DogNameVerify() {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(dognametool));
        dognametool.click();
        wait.until(ExpectedConditions.visibilityOf(dognameheader));
        male.isDisplayed();
        female.isDisplayed();
        all.isDisplayed();
        a.isDisplayed();
        b.isDisplayed();
        c.isDisplayed();
        d.isDisplayed();
        e.isDisplayed();
        f.isDisplayed();
        g.isDisplayed();
        h.isDisplayed();
        i.isDisplayed();
        j.isDisplayed();
        k.isDisplayed();
        l.isDisplayed();
        m.isDisplayed();
        n.isDisplayed();
        o.isDisplayed();
        p.isDisplayed();
        q.isDisplayed();
        r.isDisplayed();
        s.isDisplayed();
        t.isDisplayed();
        u.isDisplayed();
        v.isDisplayed();
        w.isDisplayed();
        x.isDisplayed();
        y.isDisplayed();
        z.isDisplayed();
        clear.isDisplayed();
        listnamesheader.isDisplayed();
        listnames.isDisplayed();
        pict.isDisplayed();
        box.isDisplayed();
        allcat.isDisplayed();
        baby.isDisplayed();
        celebrity.isDisplayed();
        cute.isDisplayed();
        disney.isDisplayed();
        fancy.isDisplayed();
        mostpop.isDisplayed();
        presi.isDisplayed();
        techy.isDisplayed();
        television.isDisplayed();
        trendy.isDisplayed();
        unisex.isDisplayed();
        videogame.isDisplayed();
        but1.isDisplayed();
        but2.isDisplayed();
        but3.isDisplayed();
        but4.isDisplayed();
        but5.isDisplayed();
        but6.isDisplayed();
        a.click();
        but3.isDisplayed();
        b.click();
        but3.isDisplayed();
        c.click();
        but3.isDisplayed();
        d.click();
        but2.isDisplayed();
        e.click();
        f.click();
        g.click();
        but2.isDisplayed();
        h.click();
        but2.isDisplayed();
        i.click();
        j.click();
        but2.isDisplayed();
        k.click();
        but2.isDisplayed();
        l.click();
        but2.isDisplayed();
        m.click();
        but3.isDisplayed();
        n.click();
        o.click();
        p.click();
        q.click();
        r.click();
        but2.isDisplayed();
        s.click();
        but3.isDisplayed();
        t.click();
        but2.isDisplayed();
        u.click();
        v.click();
        w.click();
        x.click();
        y.click();
        z.click();
        clear.click();
        male.click();
        but6.isDisplayed();
        female.click();
        but6.isDisplayed();
        all.click();
        baby.click();
        but3.isDisplayed();
        allcat.click();
        but6.isDisplayed();
        celebrity.click();
        but2.isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")));
        cute.isDisplayed();
        cute.click();
        but3.isDisplayed();
        disney.click();
        but4.isDisplayed();
        fancy.click();
        but4.isDisplayed();
        mostpop.click();
        but3.isDisplayed();
        presi.click();
        but3.isDisplayed();
        techy.click();
        but2.isDisplayed();
        television.click();
        but4.isDisplayed();
        trendy.click();
        but3.isDisplayed();
        unisex.click();
        but6.isDisplayed();
        videogame.click();
        but4.isDisplayed();

    }

    //New page tests:

    public void DNFTFindNamesResult() {

        ExpertAdvicemenu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        Actions action = new Actions(driver);
        action.moveToElement(EAmenuDNF).perform();
        action.moveToElement(EAmenuDNF).click();
        EAmenuDNF.click();
        FindNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void DNFTSearchNames() {

        ExpertAdvicemenu.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(EAmenuDNF));
        EAmenuDNF.click();
        inputBar.sendKeys("Yoda");
        FindNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(YodaName));

    }

    public void DNFTSurpriceMe() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        SurpriceMeButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(SurpriceMeNames));

    }

    public void DNFTFilters() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        FilterButton.click();
        LenghtBarFilter.click();
        OneWordFilter.click();
        FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AlexanderName));

    }

    public void MySavedNames() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        MySavedNamesButton.click();
        userName.sendKeys("sxv@akc.org");
        password.sendKeys("CypresHill2*");
        login.click();
        wait.until(ExpectedConditions.elementToBeClickable(MySavedNamesButton));
        MySavedNamesButton.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronName));

    }

    public void FavoriteName() {

        driver.navigate().to("https://test-web.akc.org/dog-name-finder/");
        FindNamesButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        AaronNameFavoriteIcon.click();
        userName.sendKeys("sxv@akc.org");
        password.sendKeys("CypresHill2*");
        login.click();
        wait.until(ExpectedConditions.elementToBeClickable(AaronNameFavoriteIcon));
        AaronNameFavoriteIcon.click();
        AaronName.click();

    }


}
