package pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class CheckoutOverviewPageSD {
    private Page page;

    private final Locator CHECKOUTOVERVIEWPAGE_TITLE;
    private final Locator FINISH_BUTTON;


    public CheckoutOverviewPageSD(Page page) {
        this.page = page;
        this.CHECKOUTOVERVIEWPAGE_TITLE=page.locator("//span[@class='title']");//Checkout: Overview
        this.FINISH_BUTTON=page.locator("//button[@id='finish']");


    }
    public String verifyCheckoutOverviewPageTitle(String ExpectedTitle) throws InterruptedException {
        String AcualTitle =  this.CHECKOUTOVERVIEWPAGE_TITLE.textContent().toString();
        AcualTitle.contains(ExpectedTitle);
        Assert.assertEquals(AcualTitle,ExpectedTitle);
        return AcualTitle;
    }

    public void clickFinishButton() throws InterruptedException {
        FINISH_BUTTON.click();
        Thread.sleep(3000);
    }


}
