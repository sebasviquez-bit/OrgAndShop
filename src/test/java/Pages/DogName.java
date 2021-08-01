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

public class DogName {


    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[1]")
    WebElement breedsmenu;

    @FindBy(css = "body > div.page-home.bgc-white.cmw > div.breed-feature > div > div.breed-feature__col.breed-feature__content-col > div > div > div > div.tool-grid__wrap > div:nth-child(4) > a")
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

    @FindBy(css = "body > div.bcpNotificationBar.bcpNotificationBarStickyBottom")
    WebElement BottomBanner;


    //Driver
    WebDriver driver;

    // Constructor
    public DogName(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    //Methods

    public void DogNameVerify() {

        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(dognametool));
        this.dognametool.click();
        wait.until(ExpectedConditions.visibilityOf(dognameheader));
        this.driver.get(this.driver.getCurrentUrl()+"?test=true");
        this.dognameheader.isDisplayed();
        this.male.isDisplayed();
        this.female.isDisplayed();
        this.all.isDisplayed();
        this.a.isDisplayed();
        this.b.isDisplayed();
        this.c.isDisplayed();
        this.d.isDisplayed();
        this.e.isDisplayed();
        this.f.isDisplayed();
        this.g.isDisplayed();
        this.h.isDisplayed();
        this.i.isDisplayed();
        this.j.isDisplayed();
        this.k.isDisplayed();
        this.l.isDisplayed();
        this.m.isDisplayed();
        this.n.isDisplayed();
        this.o.isDisplayed();
        this.p.isDisplayed();
        this.q.isDisplayed();
        this.r.isDisplayed();
        this.s.isDisplayed();
        this.t.isDisplayed();
        this.u.isDisplayed();
        this.v.isDisplayed();
        this.w.isDisplayed();
        this.x.isDisplayed();
        this.y.isDisplayed();
        this.z.isDisplayed();
        this.clear.isDisplayed();
        this.listnamesheader.isDisplayed();
        this.listnames.isDisplayed();
        this.pict.isDisplayed();
        this.box.isDisplayed();
        this.allcat.isDisplayed();
        this.baby.isDisplayed();
        this.celebrity.isDisplayed();
        this.cute.isDisplayed();
        this.disney.isDisplayed();
        this.fancy.isDisplayed();
        this.mostpop.isDisplayed();
        this.presi.isDisplayed();
        this.techy.isDisplayed();
        this.television.isDisplayed();
        this.trendy.isDisplayed();
        this.unisex.isDisplayed();
        this.videogame.isDisplayed();
        this.but1.isDisplayed();
        this.but2.isDisplayed();
        this.but3.isDisplayed();
        this.but4.isDisplayed();
        this.but5.isDisplayed();
        this.but6.isDisplayed();
        this.a.click();
        this.but3.isDisplayed();
        this.b.click();
        this.but3.isDisplayed();
        this.c.click();
        this.but3.isDisplayed();
        this.d.click();
        this.but2.isDisplayed();
        this.e.click();
        this.f.click();
        this.g.click();
        this.but2.isDisplayed();
        this.h.click();
        this.but2.isDisplayed();
        this.i.click();
        this.j.click();
        this.but2.isDisplayed();
        this.k.click();
        this.but2.isDisplayed();
        this.l.click();
        this.but2.isDisplayed();
        this.m.click();
        this.but3.isDisplayed();
        this.n.click();
        this.o.click();
        this.p.click();
        this.q.click();
        this.r.click();
        this.but2.isDisplayed();
        this.s.click();
        this.but3.isDisplayed();
        this.t.click();
        this.but2.isDisplayed();
        this.u.click();
        this.v.click();
        this.w.click();
        this.x.click();
        this.y.click();
        this.z.click();
        this.clear.click();
        this.male.click();
        this.but6.isDisplayed();
        this.female.click();
        this.but6.isDisplayed();
        this.all.click();
        this.baby.click();
        this.but3.isDisplayed();
        this.allcat.click();
        this.but6.isDisplayed();
        this.celebrity.click();
        this.but2.isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#sidebar-left-contents > div.mid-blackboard > ul > li:nth-child(4) > a")));
        this.cute.isDisplayed();
        this.cute.click();
        this.but3.isDisplayed();
        this.disney.click();
        this.but4.isDisplayed();
        this.fancy.click();
        this.but4.isDisplayed();
        this.mostpop.click();
        this.but3.isDisplayed();
        this.presi.click();
        this.but3.isDisplayed();
        this.techy.click();
        this.but2.isDisplayed();
        this.television.click();
        this.but4.isDisplayed();
        this.trendy.click();
        this.but3.isDisplayed();
        this.unisex.click();
        this.but6.isDisplayed();
        this.videogame.click();
        this.but4.isDisplayed();

    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }
}
