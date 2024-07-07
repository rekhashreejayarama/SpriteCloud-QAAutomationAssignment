package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckoutCompletePageSD;
import pages.CheckoutOverviewPageSD;

public class CheckoutCompleteStepsSD {
    CheckoutCompletePageSD checkoutCompletePageSD = new CheckoutCompletePageSD(DriverFactory.getPage());

    @Then("Click on backhome button")
    public void clickBackhome() throws InterruptedException {
        checkoutCompletePageSD.clickBackHomeButton();
    }

    @When("UserSD verify the CheckoutCompletePage title {string}")
    public void usersVerifyTheCheckoutCompletePageTitle(String arg0) throws InterruptedException {
        String title = checkoutCompletePageSD.verifyCheckoutCompletePageTitle(arg0);
        Assert.assertEquals(title, "Checkout: Complete!");
    }
}
