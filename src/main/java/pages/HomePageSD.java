package pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class HomePageSD {
    private Page page;
    private final Locator APP_LOGO;
    private final Locator BURGER_MENU;
    private final Locator LOGOUT;
    private final Locator ADDTOCARTBUTTON;
    private final Locator SHOPPING_CART_LINK;
    private final Locator CHEKOUT_BUTTON;

    public HomePageSD(Page page) {
        this.page = page;
        this.APP_LOGO = page.locator("//div[@class='app_logo']");
        this.BURGER_MENU = page.locator("//button[@id='react-burger-menu-btn']");
        this.LOGOUT=page.locator("//a[@id='logout_sidebar_link']");
        this.ADDTOCARTBUTTON=page.locator("//button[@id='add-to-cart-sauce-labs-backpack']");
        this.SHOPPING_CART_LINK=page.locator("//a[@class='shopping_cart_link']");
        this.CHEKOUT_BUTTON=page.locator("//button[@id='checkout']");
    }

    public void verifyAppLogoText(String LogoText) throws InterruptedException {
        String AcualLogoText =  this.APP_LOGO.textContent().toString();
        AcualLogoText.contains(LogoText);
        Assert.assertEquals(AcualLogoText,LogoText);}

    public void clickAddToCartAndShoppingCart() throws InterruptedException {
        ADDTOCARTBUTTON.click();
        Thread.sleep(3000);
        SHOPPING_CART_LINK.click();
        Thread.sleep(3000);
    }

    public void clickCheckoutButton() {
        CHEKOUT_BUTTON.click();
    }

    public void clickBurgerMenu() {
        BURGER_MENU.click();
    }

    public void clickLogout() {
        LOGOUT.click();
    }

    public String verifyTitle() {
        String title = page.title();
        return title;}
}
