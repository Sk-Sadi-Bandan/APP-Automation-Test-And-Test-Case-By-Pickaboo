package stepDefinitions;

import io.appium.java_client.AppiumDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import pages.AdditionPage.TestingApp;
import utils.ContextSetup;

public class TestSteps {

    AppiumDriver driver;
    TestingApp testingApp;
    ContextSetup setup;

    public TestSteps(ContextSetup setup){
        this.setup = setup;
        this.testingApp = setup.pageObjectManager.getAdditionPage();
    }
//Check Home button start
    @Given("Check home button is available")
    public void checkHomeButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_Home().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the home button")
    public void clickOnTheHomeButton() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.Get_Home().click();
        Thread.sleep(2000);
    }

    @Then("Check that home is display")
    public void checkThatHomeIsDisplayed() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_Home_page().isDisplayed());
        Thread.sleep(2000);

    }


//Check Home button end

//Check Categories Start
    @Given("Check categories button is available")
    public void checkCategoriesButtonIsAvailable() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Get_categories().isDisplayed());
        Thread.sleep(2000);
}

    @When("Click on the Categories button")
    public void clickOnTheCategoriesButton() throws InterruptedException {
        Thread.sleep(2000);
         testingApp.Click_categories().click();
         Thread.sleep(2000);
    }

    @Then("Check the Categories is Display")
    public void checkTheCategoriesIsDisplay() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Click_categories_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Categories End

//Check Support Start
    @Given("Check Support button is available")
    public void checkSupportButtonIsAvailable() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Get_support().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the Support button")
    public void clickOnTheSupportButton() throws InterruptedException {
        Thread.sleep(1000);
       testingApp.Click_support().click();
       Thread.sleep(2000);
    }

    @Then("Check the Support us Display")
    public void checkTheSupportUsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_support_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Support End

//Check Slider Start
    @Given("Check Slider button is available")
    public void checkSliderButtonIsAvailable() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Get_Slider().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the Slider Button")
    public void clickOnTheSliderButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Slider().click();
        Thread.sleep(2000);
    }

    @Then("Check the Slider is Display")
    public void checkTheSliderIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_Slider_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Slider End

//Check cart Start
    @Given("Check Cart button is available")
    public void checkCartButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_cart().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click the Cart button")
    public void clickTheCartButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_cart().click();
        Thread.sleep(2000);
    }

    @Then("Check the cart button")
    public void checkTheCartButton() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_cart_page().isDisplayed());
        Thread.sleep(2000);
    }
//Check Cart End

//Check Smartphones Categories Start
    @Given("Check Smartphones Categories is available")
    public void checkSmartphonesCategoriesIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_smartphone_categories().isDisplayed());        //isDis[lay
        Thread.sleep(2000);
    }

    @When("Click the Smartphones Categories button")
    public void clickTheSmartphonesCategoriesButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_smartphone_gategories().click();                               //Click
        Thread.sleep(2000);
    }

    @Then("Click the Smartphones Categories is Display")
    public void clickTheSmartphonesCategoriesIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_smartphone_display().isDisplayed());         //isDisplay
        Thread.sleep(2000);
    }

    @Then("Click the Camera phone")
    public void clickTheCameraPhone() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_thecameraphone().click();
        Thread.sleep(2000);
    }

    @Then("Click Redmi Note")
    public void clickRedmiNote() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_redmi_note().click();
        Thread.sleep(2000);
    }

    @Then("Click Buy Now Button")
    public void clickBuyNowButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_buy_now().click();
        Thread.sleep(2000);
    }

    @Then("Select Colour")
    public void selectColour() throws InterruptedException {
        //Thread.sleep(1000);
        testingApp.Click_colour().click();
        Thread.sleep(2000);
    }

    @Then("Click Continue Button")
    public void clickContinueButton() throws InterruptedException {
        //Thread.sleep(1000);
        testingApp.Click_continue_button().click();
        Thread.sleep(2000);
    }
//Check Smartphones Categories End

//Check Mobile accessories Start
    @Given("Check the Mobile Accessories is available")
    public void checkTheMobileAccessoriesIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_Mobile_accessories().isDisplayed());                //isDisplay
        Thread.sleep(2000);
    }

    @When("Click the Mobile Accessories button")
    public void clickTheMobileAccessoriesButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Mobile_accessories_button().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Click the Mobile Button is Display")
    public void clickTheMobileButtonIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.Click_Mobile_display().isDisplayed());                  //isDisplay
        Thread.sleep(2000);
    }

    @Then("Select kieslet Watch")
    public void selectKiesletWatch() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_kieslet_watch().click();                               //Click
        Thread.sleep(2000);
    }

    @Then("Click The Buy Button")
    public void clickTheBuyButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_buy_button().click();                               //Click
        Thread.sleep(2000);
    }

    @Then("select colour")
    public void select_colour() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Select_colour().click();                               //Click
        Thread.sleep(2000);
    }

    @Then("Chose Colour to process apply")
    public void Click_c_apply() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_c_apply().click();                               //Click
        Thread.sleep(2000);
    }

    @Then("Process To Buy Now")
    public void Process_to_buy() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.process_To_buy().click();                               //Click
        Thread.sleep(2000);
    }
//Check Mobile accessories End

//Check Life Style Start
    @Given("Check the Life Style Categories")
    public void checkTheLifeStyleCategories() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.check_life_style().isDisplayed()); //isDisplay
        Thread.sleep(2000);
    }

    @When("Click the Life Style is available")
    public void clickTheLifeStyleIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.click_life_style_ava().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Check the Life Style is Display")
    public void checkTheLifeStyleIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.check_life_display().isDisplayed());                  //isDisplay
        Thread.sleep(2000);
    }

    @Then("Select item Philips Trimmer")
    public void selectItemPhilipsTrimmer() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.Click_philips().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select to buy now button")
    public void selectToBuyNowButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.buy_now_philips().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Then Process to check out")
    public void thenProcessToCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.philips_checkout().click();                                   //Click
        Thread.sleep(2000);
    }
//Check Life Style End

//Explore Silder Manue start
    @Then("Click the Performance Phone")
    public void clickThePerformancePhone() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_performance_phone().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Click Benco Mobile")
    public void clickBencoMobile() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_benco_mobile().click();                                            //Click
        Thread.sleep(2000);
    }
//Explore Silder Manue End

//Explore The Electronics and appliance categories start
    @Given("Check The Electronics and appliance is available")
    public void checkTheElectronicsAndApplianceIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.check_Electronics().isDisplayed());                        //isDisplay
        Thread.sleep(2000);
    }

    @When("Click The Electronics and appliance button")
    public void clickTheElectronicsAndApplianceButton() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.Click_Electronics().click();                                                 //Click
        Thread.sleep(2000);
    }

    @Then("Click The Electronics and appliance is Display")
    public void clickTheElectronicsAndApplianceIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.check_Electronics_dis().isDisplayed());                  //isDisplay
        Thread.sleep(2000);
    }

    @Then("Select Television")
    public void selectTelevision() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.click_tele().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select Wanton_tv")
    public void selectWanton_tv() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.click_wanton().click();                                   //Click
        Thread.sleep(2000);
    }
//Explore The Electronics and appliance categories End

//Explore Refrigerator items checkout start
    @Then("Select Refrigerator categories")
    public void selectRefrigeratorCategories() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.click_Refrigerator().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select sharp")
    public void selectSharp() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.click_sharp().click();                                   //Click
        Thread.sleep(2000);
    }
//Explore Refrigerator items checkout End

//Explore gaming category start
    @Then("Click the Gaming Phone")
    public void clickTheGamingPhone() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_gaming_phone().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Click Realme Mobile")
    public void clickRealmeMobile() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.Click_realme_phone().click();                                   //Click
        Thread.sleep(2000);
    }
//Explore gaming category end


//Buy a Data cable Start
    @Then("Select data cable")
    public void selectDataCable() throws InterruptedException {
        Thread.sleep(2000);
        testingApp.Click_data_cable().click();                                   //Click
        Thread.sleep(2000);
    }

//Buy a washing Machine
    @Then("Select Washing Machine categories")
    public void selectWashingMachineCategories() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_WashingMachine().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select Whirlpool")
    public void selectWhirlpool() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Whirlpool().click();                                   //Click
        Thread.sleep(2000);
    }
//Buy Haier Washing Machine
    @Then("Select Haier")
    public void selectHaier() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Haier().click();                                   //Click
        Thread.sleep(2000);
    }

//Buy HWM Washing Machine
    @Then("Select HWM")
    public void selectHWM() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_HWM().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Press the Buy Now Button")
    public void pressTheBuyNowButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_buynow().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Then Press to check out")
    public void thenPressToCheckOut() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_check_out().click();                                   //Click
        Thread.sleep(2000);
    }



//Select Slider on Computer  Categories  to buy Honor Pad start
    @Then("Open Computer Categories")
    public void openComputerCategories() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Computer().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select to buy Honor Pad")
    public void selectToBuyHonorPad() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Honor().click();                                   //Click
        Thread.sleep(2000);
    }
//Select Slider on Computer  Categories  to buy Honor Pad end

//Select Slider on Computer  Categories  to buy Pen Drive Start
    @Then("Open Computer Accessories")
    public void openComputerAccessories() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_Comp_acc().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Select to buy Pen drive")
    public void selectToBuyPenDrive() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_pendrive().click();                                   //Click
        Thread.sleep(2000);
    }
//Select Slider on Computer  Categories  to buy Pen Drive End

//Working with Dashboard section start
    @Given("Check Dashboard button is available")
    public void checkDashboardButtonIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_Dash().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the DashBoard button")
    public void clickOnTheDashBoardButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_dashboard().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Check that Dashboard is display")
    public void checkThatDashboardIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.check_Dashboard_dis().isDisplayed());                  //isDisplay
        Thread.sleep(2000);
    }
//Working with Dashboard section End

//Open setting button start
    @Given("Check Dashboard setting is available")
    public void checkDashboardSettingIsAvailable() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertTrue(testingApp.Get_setting().isDisplayed());
        Thread.sleep(2000);
    }

    @When("Click on the setting button")
    public void clickOnTheSettingButton() throws InterruptedException {
        Thread.sleep(1000);
        testingApp.Click_setting().click();                                   //Click
        Thread.sleep(2000);
    }

    @Then("Check that setting is display")
    public void checkThatSettingIsDisplay() throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertTrue(testingApp.check_setting_dis().isDisplayed());                  //isDisplay
        Thread.sleep(2000);
    }


}
