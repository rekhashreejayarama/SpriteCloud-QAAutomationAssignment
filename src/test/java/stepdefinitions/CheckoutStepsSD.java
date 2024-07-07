package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.CheckoutPageSD;
import pages.HomePageSD;

public class CheckoutStepsSD {
    CheckoutPageSD checkoutPageSD = new CheckoutPageSD(DriverFactory.getPage());


    @When("UserSD verify the CheckoutPage title {string}")//Checkout: Your Information
    public void verifyPageTitle(String arg0) throws InterruptedException {
        String title = checkoutPageSD.verifyCheckoutPageTitle(arg0);
        Assert.assertEquals(title, "Checkout: Your Information");
    }

    @When("UserSD enters the information firstname {string} lastname {string} zipcode {string}")
    public void userEntersTheInformationFirstnameLastnameZipcode(String arg0, String arg1, String arg2) throws InterruptedException {
        this.checkoutPageSD.fillingInformationClickContinue(arg0, arg1, arg2);
    }
}
