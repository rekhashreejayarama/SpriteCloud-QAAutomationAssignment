package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckoutOverviewPageSD;
import pages.CheckoutPageSD;

public class CheckoutOverviewStepsSD {
    CheckoutOverviewPageSD checkoutOverviewPageSD = new CheckoutOverviewPageSD(DriverFactory.getPage());


    @When("UserSD verify the CheckoutOverviewPage title {string}")//Checkout: Your Information
    public void verifyCheckoutOverviewPageTitle(String arg0) throws InterruptedException {
        String title = checkoutOverviewPageSD.verifyCheckoutOverviewPageTitle(arg0);
        Assert.assertEquals(title, "Checkout: Overview");
    }

    @When("Click on finish button")
    public void clickFinish() throws InterruptedException {
        checkoutOverviewPageSD.clickFinishButton();
    }
}
