package Pages;
import Helpers.DataHelper;
import Model.Word;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static java.lang.Thread.sleep;

public class Search {

    @FindBy(xpath = "//*[@id='desktop-search']")
    WebElement search;

    @FindBy(id = "homepage-hero-breed-search-selectized")
    WebElement HeroBreedSearch;

    @FindBy(id = "homepage-hero-aside__input")
    WebElement HeroAsideSearch;

    @FindBy(id = "ispbxii_0")
    WebElement ShopSearch;

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopSearchBreed;

    @FindBy(id = "the-chosen-input-hack-2")
    WebElement ShopDogLoversSearch;

    @FindBy(xpath = "//html/body/div[2]/div/div[1]/div/div[1]/div/div/div[1]/form/button/svg/g/ellipse")
    WebElement searchbutton2;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.org-search-results-title > h3")
    WebElement numresults;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.bpm-mb8 > div > div.iib-search-header__slogan-wrapper > div > img")
    WebElement SearchCampImg;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > aside > div > div.filter-form__wrap > form > div:nth-child(2) > div > div > div.filter-form__section-header > h3")
    WebElement sections;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > a > div > img")
    WebElement resultsimg;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > div > a")
    WebElement firstresult;

    @FindBy(css = "body > div.cmw.bgc-white > div.page-container.pb4.bpm-pb9 > div.page-layout > main > div.contents-grid-wrap.relative > div > div:nth-child(1) > div > div")
    WebElement frbody;

    @FindBy(xpath = "//html/body/div[4]/div[1]/div[4]/main")
    WebElement listresults;

    @FindBy(xpath = "//html/body/div[4]/div[1]/div[4]/main/div[4]/div")
    WebElement navigate;

    @FindBy(css = "#isp_results_search_text")
    WebElement ShopResultTitle;

    @FindBy(id = "isp_main_search_box")
    WebElement ShopResultSearchBar;

    @FindBy(css = "#single_facet_Breed > div.isp_facet_title")
    WebElement ShopResultSections;

    @FindBy(css = "#isp_search_results_container > li:nth-child(1) > div.isp_product_image_wrapper > a.isp_product_image_href > img")
    WebElement ShopResultImage;

    @FindBy(css = "#collection-main > div.department-blocks > section:nth-child(1) > h2")
    WebElement ShopSearchBreedTitle;

    @FindBy(css = "#collection-header > div.content > div > h4")
    WebElement ChooseBreedTitle;

    @FindBy(css = "#collection-header > div.image-box > img")
    WebElement ShopSearchBreedImage;

    @FindBy(css = "#homepage-pick-your-breed > div > div > a > i")
    WebElement dropdown;

    @FindBy(css = "#breed-collection-filter > div > div > a")
    WebElement dropdownDogLover;

    @FindBy(css = "#collection-main > ul > li:nth-child(1) > div > div > div.card-details > h2")
    WebElement productDetailDogLover;

    @FindBy(css = "#page-title > h1")
    WebElement resultsTitle;

    @FindBy(id = "anchor-panel-overview")
    WebElement overviewTab;

    @FindBy(id = "anchor-panel-puppies")
    WebElement puppiesTab;

    @FindBy(id = "anchor-panel-breed-standard")
    WebElement breedStandardTab;


    WebDriver driver;
    DataHelper dataHelper;


    public Search(WebDriver _driver) {
        this.driver = _driver;
        PageFactory.initElements(driver, this);

    }

    public void SearchPage(Word _searchword) throws InterruptedException {

        this.search.sendKeys(_searchword.WordSearch);
        this.search.sendKeys(Keys.RETURN);
        //this.searchbutton2.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.SearchCampImg.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.numresults.isDisplayed();
        this.sections.isDisplayed();
        this.resultsimg.isDisplayed();
        this.firstresult.isDisplayed();
        this.frbody.isDisplayed();
        //this.listresults.isDisplayed();
        //this.navigate.isDisplayed();

    }

    public void HeroBreedSearch(Word _searchword) throws InterruptedException {

        this.HeroBreedSearch.sendKeys(_searchword.WordSearch);
        this.HeroBreedSearch.sendKeys(Keys.RETURN);
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.resultsTitle.isDisplayed();
        this.overviewTab.isDisplayed();
        //this.puppiesTab.isDisplayed();
        //this.breedStandardTab.isDisplayed();

    }

    public void HeroAsideSearch(Word _searchword) throws InterruptedException {

        this.HeroAsideSearch.sendKeys(_searchword.WordSearch);
        this.HeroAsideSearch.sendKeys(Keys.RETURN);
        //this.searchbutton2.click();
        sleep(1000);
        this.driver.get(this.driver.getCurrentUrl() + "?test=true");
        sleep(1000);
        this.SearchCampImg.isDisplayed();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300);");
        this.numresults.isDisplayed();
        this.sections.isDisplayed();
        this.resultsimg.isDisplayed();
        this.firstresult.isDisplayed();
        this.frbody.isDisplayed();

    }

    public void ShopSearch(Word _searchword) throws InterruptedException {

        this.ShopSearch.sendKeys(_searchword.WordSearch);
        this.ShopSearch.sendKeys(Keys.RETURN);
        sleep(1000);
        this.ShopResultTitle.isDisplayed();
        this.ShopResultSearchBar.isDisplayed();
        this.ShopResultSections.isDisplayed();
        this.ShopResultImage.isDisplayed();

    }

    public void ShopSearchBreed(Word _searchword) throws InterruptedException {

        sleep(1000);
        this.dropdown.click();
        sleep(1000);
        this.ShopSearchBreed.sendKeys(_searchword.WordSearch);
        this.ShopSearchBreed.sendKeys(Keys.RETURN);
        sleep(1000);
        this.ShopSearchBreedTitle.isDisplayed();
        this.ChooseBreedTitle.isDisplayed();
        this.ShopSearchBreedImage.isDisplayed();

    }

    public void ShopDogLoversSearch(Word _searchword) throws InterruptedException {

        driver.navigate().to("https://shop.akc.org/collections/dog-lovers");
        sleep(1000);
        this.dropdownDogLover.click();
        sleep(1000);
        this.ShopDogLoversSearch.sendKeys(_searchword.WordSearch);
        this.ShopDogLoversSearch.sendKeys(Keys.RETURN);
        sleep(1000);
        this.productDetailDogLover.isDisplayed();

    }

}
