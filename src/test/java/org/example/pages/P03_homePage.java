package org.example.pages;

import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class P03_homePage {
    // currencies feature
    By CurrenciesDropDown = By.id("customerCurrency");
    By ProductPrice = By.cssSelector("span[class=\"price actual-price\"]");
    // search feature
    By SearchField = By.id("small-searchterms");
    By SearchButton =  By.cssSelector("button[class=\"button-1 search-box-button\"]");
    By ProductsItem = By.className("product-item");
    By SKU = By.className("sku");
    // hover on feature
    By MainMenuItems = By.xpath("//ul[@class=\"top-menu notmobile\"]/li");
    By SubMenuItem = By.cssSelector("a[href=\"/desktops\"]");
    By PageTitle = By.className("page-title");
    // home slider feature
    By HomeSlider = By.className("nivo-imageLink");
    //follow us feature
    By FaceBookButton = By.className("facebook");
    By TwitterButton = By.className("twitter");
    By RssButton = By.className("rss");
    By YouTubeButton = By.className("youtube");
    //Wishlist feature
    By WishlistButton = By.cssSelector("button[class=\"button-2 add-to-wishlist-button\"]");
    By WishlistSuccessmsg = By.cssSelector("div[class=\"bar-notification success\"]");
    By WishlistTab = By.className("wishlist-label");
    By WishlistQytValue = By.cssSelector("input[class=\"qty-input\"]");
    By WishlistQytValueHeader = By.className("wishlist-qty");







    public WebElement currenciesDropDown(){return Hooks.driver.findElement(CurrenciesDropDown);}
    public List<WebElement> productPrice(){return Hooks.driver.findElements(ProductPrice);}
    public WebElement searchField(){return Hooks.driver.findElement(SearchField);}
    public WebElement searchButton(){return Hooks.driver.findElement(SearchButton);}
    public List<WebElement> productsItem(){return Hooks.driver.findElements(ProductsItem);}
    public WebElement sku(){return Hooks.driver.findElement(SKU);}
    public List<WebElement> mainMenuItems() { return Hooks.driver.findElements(MainMenuItems);}
    public List<WebElement> HomeSlider(){return Hooks.driver.findElements(HomeSlider);}
    public WebElement faceBookButton(){return Hooks.driver.findElement(FaceBookButton);}
    public WebElement twitterButton(){return Hooks.driver.findElement(TwitterButton);}
    public WebElement rssButton(){return Hooks.driver.findElement(RssButton);}
    public WebElement youTubeButton(){return Hooks.driver.findElement(YouTubeButton);}
    public List<WebElement> wishlistButton(){return Hooks.driver.findElements(WishlistButton);}
    public WebElement wishlistSuccessmsg (){return Hooks.driver.findElement(WishlistSuccessmsg);}
    public WebElement wishlistTab(){return Hooks.driver.findElement(WishlistTab);}
    public WebElement wishlistQytValue(){return Hooks.driver.findElement(WishlistQytValue);}
    public WebElement wishlistQytValueHeader(){return Hooks.driver.findElement(WishlistQytValueHeader);}
    public List<WebElement> subMenuItem(){return Hooks.driver.findElements(SubMenuItem);}
    public WebElement pageTitle(){return Hooks.driver.findElement(PageTitle);}








}
