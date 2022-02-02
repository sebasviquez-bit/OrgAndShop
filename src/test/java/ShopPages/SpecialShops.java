package ShopPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecialShops {

    @FindBy(css = "#main-menu-nav > nav > a:nth-child(6)")
    WebElement SpecialShopMenu;

    @FindBy(css = "#main-menu-special-shops")
    WebElement SpecialShopDropdown;

    @FindBy(css = "#main-menu-special-shops > div:nth-child(1) > a")
    WebElement ValentinesHer;

    @FindBy(css = "#s-739d3249-b5ef-4406-88f2-eda7d1ab81eb > a")
    WebElement ValentinesHerCandelProduct;
    //#s-54bc5402-7a4d-46bf-8ae3-e6761b156f21 > img

    //------------------------//

    WebDriver driver;

    // Constructor
    public SpecialShops(WebDriver _driver){
        this.driver = _driver;
        PageFactory.initElements(driver,this);
    }

    // Methods

    public void SpecialShopDropDown() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(6)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait (driver, 10);
        wait.until(ExpectedConditions.visibilityOf(SpecialShopDropdown));

    }

    public void ClickValentinesHer() {

        Actions builder = new Actions(driver);
        WebElement element = driver.findElement(By.cssSelector("#main-menu-nav > nav > a:nth-child(4)"));
        builder.moveToElement(element).build().perform();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.elementToBeClickable(ValentinesHer));
        this.ValentinesHer.click();
        wait.until(ExpectedConditions.visibilityOf(ValentinesHerCandelProduct));

    }

}
