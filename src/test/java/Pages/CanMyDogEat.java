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

public class CanMyDogEat {

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[2]/nav/a[1]")
    WebElement breedsmenu;

    @FindBy(xpath = "//*[@id=\"dog-breeds\"]/div[2]/div/div/div/ul/li[1]/a/div")
    WebElement findmatch;

    @FindBy(css = "#can-my-dog-eat-___\\? > a > strong")
    WebElement canmydog;

    @FindBy(xpath = "//html/body/main/div/section/h1")
    WebElement tittle;

    @FindBy(xpath = "//html/body/main/div/section/div[2]/img")
    WebElement img;

    @FindBy(xpath = "//html/body/main/div/section/p")
    WebElement msg;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[1]")
    WebElement apples;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/img")
    WebElement applesimg;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[1]")
    WebElement cheese;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/img")
    WebElement cheeseimg;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[1]")
    WebElement almonds;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/img")
    WebElement almpondsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[1]")
    WebElement carrots;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/img")
    WebElement carrotsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[1]")
    WebElement avoca;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/img")
    WebElement avocaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[1]")
    WebElement grapes;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/img")
    WebElement grapesimg;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[1]")
    WebElement peanut;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/img")
    WebElement peanutimg;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[1]")
    WebElement bananana;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/img")
    WebElement bananasimg;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[1]")
    WebElement tomato;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/img")
    WebElement tomatoimg;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[1]")
    WebElement onions;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/img")
    WebElement onionsaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[1]")
    WebElement pinea;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/img")
    WebElement pineaimg;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[1]")
    WebElement eggs;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/img")
    WebElement eggsimg;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/a[1]")
    WebElement yes1;

    @FindBy(css = "#content > div:nth-child(9) > a.no-answer.incorrect")
    WebElement no1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/a[1]")
    WebElement yes2;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/a[2]")
    WebElement no2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/a[1]")
    WebElement yes3;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/a[2]")
    WebElement no3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/a[1]")
    WebElement yes4;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/a[2]")
    WebElement no4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/a[1]")
    WebElement yes5;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/a[2]")
    WebElement no5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/a[1]")
    WebElement yes6;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/a[2]")
    WebElement no6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/a[1]")
    WebElement yes7;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/a[2]")
    WebElement no7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/a[1]")
    WebElement yes8;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/a[2]")
    WebElement no8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/a[1]")
    WebElement yes9;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/a[2]")
    WebElement no9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/a[1]")
    WebElement yes10;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/a[2]")
    WebElement no10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/a[1]")
    WebElement yes11;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/a[2]")
    WebElement no11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/a[1]")
    WebElement yes12;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/a[2]")
    WebElement no12;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[2]")
    WebElement answer1;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[2]/span")
    WebElement expla1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[2]")
    WebElement answer2;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[2]/span")
    WebElement expla2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[3]")
    WebElement answer3;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[2]/span")
    WebElement expla3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[2]")
    WebElement answer4;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[2]/span")
    WebElement expla4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[3]")
    WebElement answer5;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[2]/span")
    WebElement expla5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[3]")
    WebElement answer6;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[2]/span")
    WebElement expla6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[2]")
    WebElement answer7;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[2]/span")
    WebElement expla7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[2]")
    WebElement answer8;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[2]/span")
    WebElement expla8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[2]")
    WebElement answer9;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[2]/span")
    WebElement expla9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[3]")
    WebElement answer10;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[2]/span")
    WebElement expla10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[2]")
    WebElement answer11;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[2]/span")
    WebElement expla11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[2]")
    WebElement answer12;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[2]/span")
    WebElement expla12;

    @FindBy(xpath = "//html/body/main/div/section/div[4]/div[1]/span[3]")
    WebElement otheranswer1;

    @FindBy(xpath = "//html/body/main/div/section/div[5]/div[1]/span[3]")
    WebElement otheranswer2;

    @FindBy(xpath = "//html/body/main/div/section/div[6]/div[1]/span[2]")
    WebElement otheranswer3;

    @FindBy(xpath = "//html/body/main/div/section/div[7]/div[1]/span[3]")
    WebElement otheranswer4;

    @FindBy(xpath = "//html/body/main/div/section/div[8]/div[1]/span[2]")
    WebElement otheranswer5;

    @FindBy(xpath = "//html/body/main/div/section/div[9]/div[1]/span[2]")
    WebElement otheranswer6;

    @FindBy(xpath = "//html/body/main/div/section/div[10]/div[1]/span[3]")
    WebElement otheranswer7;

    @FindBy(xpath = "//html/body/main/div/section/div[11]/div[1]/span[3]")
    WebElement otheranswer8;

    @FindBy(xpath = "//html/body/main/div/section/div[12]/div[1]/span[3]")
    WebElement otheranswer9;

    @FindBy(xpath = "//html/body/main/div/section/div[13]/div[1]/span[2]")
    WebElement otheranswer10;

    @FindBy(xpath = "//html/body/main/div/section/div[14]/div[1]/span[3]")
    WebElement otheranswer11;

    @FindBy(xpath = "//html/body/main/div/section/div[15]/div[1]/span[3]")
    WebElement otheranswer12;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[1]/h3")
    WebElement results;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[2]/p[2]")
    WebElement suggestion;

    @FindBy(xpath = "//html/body/main/div/section/div[16]/div[1]/img")
    WebElement resultsimg;

    @FindBy(css = "#a268951c-b028-44ad-99ed-5af71765e083")
    WebElement BottomBanner;


    DriverHelper driverHelper;

    WebDriver driver;

    // Constructor
    public CanMyDogEat(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);


    }


    public void VerifyCanMyDogEat1() {

        this.breedsmenu.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        this.findmatch.click();
        wait.until(ExpectedConditions.elementToBeClickable(canmydog));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 800);");
        this.canmydog.click();
        wait.until(ExpectedConditions.visibilityOf(tittle));
        this.img.isDisplayed();
        this.msg.isDisplayed();
        this.apples.isDisplayed();
        this.applesimg.isDisplayed();
        this.yes1.isDisplayed();
        this.no1.isDisplayed();
        this.cheese.isDisplayed();
        this.cheeseimg.isDisplayed();
        this.yes2.isDisplayed();
        this.no2.isDisplayed();
        this.almonds.isDisplayed();
        this.almpondsimg.isDisplayed();
        this.yes3.isDisplayed();
        this.no3.isDisplayed();
        this.carrots.isDisplayed();
        this.carrotsimg.isDisplayed();
        this.yes4.isDisplayed();
        this.no4.isDisplayed();
        this.avoca.isDisplayed();
        this.avocaimg.isDisplayed();
        this.yes5.isDisplayed();
        this.no5.isDisplayed();
        this.grapes.isDisplayed();
        this.grapesimg.isDisplayed();
        this.yes6.isDisplayed();
        this.no6.isDisplayed();
        this.peanut.isDisplayed();
        this.peanutimg.isDisplayed();
        this.yes7.isDisplayed();
        this.no7.isDisplayed();
        this.bananana.isDisplayed();
        this.bananasimg.isDisplayed();
        this.yes8.isDisplayed();
        this.no8.isDisplayed();
        this.tomato.isDisplayed();
        this.tomatoimg.isDisplayed();
        this.yes9.isDisplayed();
        this.no9.isDisplayed();
        this.onions.isDisplayed();
        this.onionsaimg.isDisplayed();
        this.yes10.isDisplayed();
        this.no10.isDisplayed();
        this.pinea.isDisplayed();
        this.pineaimg.isDisplayed();
        this.yes11.isDisplayed();
        this.no11.isDisplayed();
        this.eggs.isDisplayed();
        this.eggsimg.isDisplayed();
        this.yes12.isDisplayed();
        this.no12.isDisplayed();
        this.yes1.click();
        this.answer1.isDisplayed();
        this.expla1.isDisplayed();
        this.yes2.click();
        this.answer2.isDisplayed();
        this.expla2.isDisplayed();
        this.yes3.click();
        this.answer3.isDisplayed();
        this.expla3.isDisplayed();
        this.yes4.click();
        this.answer4.isDisplayed();
        this.expla4.isDisplayed();
        this.yes5.click();
        this.answer5.click();
        this.expla5.click();
        this.yes6.click();
        this.answer6.isDisplayed();
        this.expla6.isDisplayed();
        this.yes7.click();
        this.answer7.isDisplayed();
        this.expla7.isDisplayed();
        this.yes8.click();
        this.answer8.isDisplayed();
        this.expla8.isDisplayed();
        this.yes9.click();
        this.answer9.isDisplayed();
        this.expla9.isDisplayed();
        this.yes10.click();
        this.answer10.isDisplayed();
        this.expla10.isDisplayed();
        this.yes11.click();
        this.answer11.isDisplayed();
        this.expla11.isDisplayed();
        this.yes12.click();
        this.answer11.isDisplayed();
        this.expla12.isDisplayed();
        this.results.isDisplayed();
        this.resultsimg.isDisplayed();
        this.suggestion.isDisplayed();

    }

    public void VerifyCanMyDogEat2() {


        this.breedsmenu.click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(findmatch));
        this.findmatch.click();
        wait.until(ExpectedConditions.elementToBeClickable(canmydog));
        HiddeBanner();
        this.canmydog.click();
        //HiddeBanner();
        wait.until(ExpectedConditions.elementToBeClickable(no1));
        this.no1.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer1));
        this.no2.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer2));
        this.no3.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer3));
        this.no4.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer4));
        this.no5.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer5));
        this.no6.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer6));
        this.no7.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer7));
        this.no8.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer8));
        this.no9.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer9));
        this.no10.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer10));
        this.no11.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer11));
        this.no12.click();
        wait.until(ExpectedConditions.elementToBeClickable(otheranswer12));
        this.results.isDisplayed();
        this.resultsimg.isDisplayed();
        this.suggestion.isDisplayed();

    }

    public void HiddeBanner() {

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("arguments[0].style.visibility='hidden'", BottomBanner);
    }

}



