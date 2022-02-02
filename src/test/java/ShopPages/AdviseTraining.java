package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdviseTraining {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(4)")
    WebElement AdviceTrainingMenu;

    @FindBy(css = "#main-content > div > h1")
    WebElement AKCExpertiseTitle;

    @FindBy(css = "#single_facet_Type")
    WebElement SideNav;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a")
    WebElement AdviseTrainingProduct;

    @FindBy(css = "#main-content > div > div.smart-collection__pagination > p > span")
    WebElement PageNumbCarousel;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(1) > a")
    WebElement Advise;

    @FindBy(css = "#main-content > div > h1")
    WebElement AdviseTitle;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(1) > ul > li:nth-child(1) > a")
    WebElement Vetline;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement VetlineProductPage;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(1) > ul > li:nth-child(2) > a")
    WebElement GoodDogHelpLine;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(1) > ul > li:nth-child(3) > a")
    WebElement NewPuppyCheckList;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(2) > a")
    WebElement TrainingCertification;

    @FindBy(css = "#ProductAdd > div > h1")
    WebElement TrainingCertificationTitle;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(2) > ul > li:nth-child(1) > a")
    WebElement STARPuppy;

    @FindBy(css = "#main-content > div > h1")
    WebElement STARPuppyTitle;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(2) > ul > li:nth-child(2) > a")
    WebElement CanineGoodCitizen;

    @FindBy(css = "#main-content > div > h1")
    WebElement CanineGoodCitizenTitle;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(2) > ul > li:nth-child(3) > a")
    WebElement VirtualHomeManners;

    @FindBy(css = "#main-content > div > h1")
    WebElement VirtualHomeMannersTitle;

    @FindBy(css = "#main-menu-advice-training > div:nth-child(2) > ul > li:nth-child(4) > a")
    WebElement TrainingSupplies;

    @FindBy(css = "#main-content > div > h1")
    WebElement TrainingSuppliesTitle;

    //




    //------------------------//

    WebDriver driver;

    // Constructor
    public AdviseTraining(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void clickAdviseTrainingMenu()  {

        this.AdviceTrainingMenu.isDisplayed();
        this.AdviceTrainingMenu.click();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(AKCExpertiseTitle));
        //this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        wait.until(ExpectedConditions.visibilityOf(SideNav));
        wait.until(ExpectedConditions.visibilityOf(AdviseTrainingProduct));
        wait.until(ExpectedConditions.visibilityOf(PageNumbCarousel));

    }

    public void clickAdvice() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Advise));
        this.Advise.click();
        wait.until(ExpectedConditions.visibilityOf(AdviseTitle));

    }

    public void clickVetLine() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(Vetline));
        this.Vetline.click();
        wait.until(ExpectedConditions.visibilityOf(VetlineProductPage));

    }

    public void clickGoodDogHelpLine2() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(GoodDogHelpLine));
        this.GoodDogHelpLine.click();
        wait.until(ExpectedConditions.urlContains("/products-services/akc-gooddog-helpline/"));

    }

    public void clickNewPuppyCheckList() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(NewPuppyCheckList));
        this.NewPuppyCheckList.click();
        wait.until(ExpectedConditions.urlContains("/bringing-home-a-new-puppy-essentials/"));

    }

    public void ClickTrainingCertification() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(TrainingCertification));
        this.TrainingCertification.click();
        wait.until(ExpectedConditions.visibilityOf(TrainingCertificationTitle));

    }

    public void ClickSTARPuppy() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(STARPuppy));
        this.STARPuppy.click();
        wait.until(ExpectedConditions.visibilityOf(STARPuppyTitle));

    }

    public void ClickCanineGoodCitizen() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(CanineGoodCitizen));
        this.CanineGoodCitizen.click();
        wait.until(ExpectedConditions.visibilityOf(CanineGoodCitizenTitle));

    }

    public void ClickVirtualHomeManners() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(VirtualHomeManners));
        this.VirtualHomeManners.click();
        wait.until(ExpectedConditions.visibilityOf(VirtualHomeMannersTitle));

    }

    public void ClickTrainingSupplies2() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(TrainingSupplies));
        this.TrainingSupplies.click();
        wait.until(ExpectedConditions.visibilityOf(TrainingSuppliesTitle));

    }

    //



}
