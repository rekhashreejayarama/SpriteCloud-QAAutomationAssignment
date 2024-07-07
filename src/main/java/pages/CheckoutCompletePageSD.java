package pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class CheckoutCompletePageSD {
    private Page page;
    private BrowserContext context;

    private final Locator CHECKOUTCOMPLETEPAGE_TITLE;
    private final Locator BACKHOME_BUTTON;

    public CheckoutCompletePageSD(Page page) {
        this.page = page;
        this.CHECKOUTCOMPLETEPAGE_TITLE=page.locator("//span[@class='title']");
        this.BACKHOME_BUTTON=page.locator("//button[@id='back-to-products']");

    }

    public String verifyCheckoutCompletePageTitle(String ExpectedTitle) throws InterruptedException {
        String AcualTitle =  this.CHECKOUTCOMPLETEPAGE_TITLE.textContent().toString();
        AcualTitle.contains(ExpectedTitle);
        Assert.assertEquals(AcualTitle,ExpectedTitle);
        return AcualTitle;
    }

    public void clickBackHomeButton() throws InterruptedException {
        BACKHOME_BUTTON.click();
        Thread.sleep(3000);
    }


}
