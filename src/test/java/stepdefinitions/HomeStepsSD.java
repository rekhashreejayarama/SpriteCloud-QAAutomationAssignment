package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.HomePageSD;
import pages.LoginPageSD;

public class HomeStepsSD {
    HomePageSD homePageSD = new HomePageSD(DriverFactory.getPage());


    @When("UserSD verify the Page title")
    public void verifyPageTitle() {
        String title = homePageSD.verifyTitle();
        Assert.assertEquals(title, "Swag Labs");

    }

    @When("UserSD verify the logo {string}")
    public void verifyLogo(String arg0) throws InterruptedException {
        homePageSD.verifyAppLogoText(arg0);
        Thread.sleep(5000);
    }

    @When("UserSD clicks the Burger Menu")
    public void clickBurgerMenu() throws InterruptedException {
        homePageSD.clickBurgerMenu();
        Thread.sleep(5000);
    }

    @When("UserSD clicks the logout button")
    public void clickLogin() throws InterruptedException {
        homePageSD.clickLogout();
    }

    @When("UserSD Add the item to cart")
    public void addItemToCart() throws InterruptedException {
        homePageSD.clickAddToCartAndShoppingCart();
    }

    @When("UserSD clicks the checkout button")
    public void clickCheckoutButton() throws InterruptedException {
        homePageSD.clickCheckoutButton();
    }

}
