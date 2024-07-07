package pages;

import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class CheckoutPageSD {
    private Page page;
    private BrowserContext context;

    private final Locator CHECKOUTPAGE_TITLE;
    private final Locator FIRSTNAME;
    private final Locator LASTNAME;
    private final Locator ZIPCODE;
    private final Locator CONTINUE_BUTTON;



    public CheckoutPageSD(Page page) {
        this.page = page;

        this.CHECKOUTPAGE_TITLE=page.locator("//span[@class='title']");//Checkout: Your Information
        this.FIRSTNAME=page.locator("//input[@id='first-name']");
        this.LASTNAME=page.locator("//input[@id='last-name']");
        this.ZIPCODE=page.locator("//input[@id='postal-code']");
        this.CONTINUE_BUTTON=page.locator("//input[@id='continue']");
    }

    public String verifyCheckoutPageTitle(String ExpectedTitle) throws InterruptedException {
        String AcualTitle =  this.CHECKOUTPAGE_TITLE.textContent().toString();
        AcualTitle.contains(ExpectedTitle);
        return AcualTitle;
    }

    public void fillingInformationClickContinue(String fName,String lName, String zipCode) throws InterruptedException {
        this.FIRSTNAME.fill(fName);
        Thread.sleep(2000);
        this.LASTNAME.fill(lName);
        Thread.sleep(2000);
        this.ZIPCODE.fill(zipCode);
        Thread.sleep(2000);
        this.CONTINUE_BUTTON.click();

    }


}
