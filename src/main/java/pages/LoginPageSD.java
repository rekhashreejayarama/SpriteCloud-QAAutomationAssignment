package pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;
import utils.WebActions;

public class LoginPageSD {
    private Page page;
    private final Locator USERNAME_EDITBOX;
    private final Locator PASSWORD_EDITBOX;
    private final Locator LOGIN_BUTTON;
    private final Locator ERROR_TEXT;


    public LoginPageSD(Page page) {
        this.page = page;
        this.USERNAME_EDITBOX = page.locator("#user-name");
        this.PASSWORD_EDITBOX = page.locator("//input[@id='password']");
        this.LOGIN_BUTTON = page.locator("//input[@id='login-button']");
        this.ERROR_TEXT = page.locator("//div[@class='error-message-container error']");

    }
    public void navigateToUrl(String url) {
        this.page.navigate(WebActions.getProperty(url));
    }

    public void enterUsername(String username) {
        USERNAME_EDITBOX.fill(WebActions.getProperty(username));
    }

    public void enterPassword(String password) {
        PASSWORD_EDITBOX.fill(WebActions.getProperty(password));
    }

    public void clickLogin() {
        LOGIN_BUTTON.click();
    }

    public void verifyErrorMessage(String ErrorMessage) throws InterruptedException {
        String actualError =  this.ERROR_TEXT.textContent().toString();
        System.out.println("ErrorMessage:"+ErrorMessage);
        System.out.println("actualError:"+actualError);
        actualError.contains(ErrorMessage);
        Assert.assertEquals(actualError,ErrorMessage);}

}
