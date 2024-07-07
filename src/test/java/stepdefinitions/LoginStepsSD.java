package stepdefinitions;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.LoginPageSD;

public class LoginStepsSD {
    LoginPageSD loginPageSD = new LoginPageSD(DriverFactory.getPage());

    @Given("^userSD navigates to \"([^\"]*)\"$")
    public void navigateToUrl(String url) {
        loginPageSD.navigateToUrl(url);
    }

    @When("^userSD enters \"([^\"]*)\" username$")
    public void enterUsername(String username) {
        loginPageSD.enterUsername(username);
    }

    @When("^userSD enters \"([^\"]*)\" password$")
    public void enterPassword(String password) {
        loginPageSD.enterPassword(password);
    }

    @When("^userSD clicks Login button$")
    public void clickLogin() {
        loginPageSD.clickLogin();

    }

    @When("UserSD verify the Error {string} Message")
    public void verifyErrorMessage(String arg0) throws InterruptedException {
        loginPageSD.verifyErrorMessage(arg0);
    }

}
