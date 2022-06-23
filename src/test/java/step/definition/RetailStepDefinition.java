package step.definition;

import java.util.List;
import java.util.Map;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import page.objects.RetailPageObject;
import utilities.Util;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retail = new RetailPageObject();

	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		Base.launchBrowser();
	    
	}
	@Given("User click on MyAccount")
	public void user_click_on_my_account() {
	retail.clickOnMyAccount();
	Util.takeScreenShot();
	}
	@When("User click on Login")
	public void user_click_on_login() {
		retail.clickOnlogInOption();
	   
	}
	@When("User enter username {string} and password {string}")
	public void user_enter_username_and_password(String string, String string2) throws InterruptedException {
	   retail.enterUserNameOption("test321@gmail.com");
	   retail.enterPasswordOption("1234567");
	   
	}
	@When("User click on Login button")
	public void user_click_on_login_button() throws InterruptedException {
		retail.ClickOnlogInButton();
		Util.takeScreenShot();
		
	}
	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() {
	retail.validateUserDshboard();
	Util.takeScreenShot();
		
	}
	@When("User click on ‘Register for an Affiliate Account’ link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
	retail.clickOnRegisterAffiliateAccount();
	
	}
	@When("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> dataTbl = dataTable.asMaps(String.class, String.class);
		
		retail.entercompanyNam(dataTbl.get(0).get("company"));
		retail.enterwebsite(dataTbl.get(0).get("website"));
		retail.entertaxId(dataTbl.get(0).get("taxID "));
		retail.enterpaymentMethod(dataTbl.get(0).get("paymentMethod"));
		retail.enterPyeeNam(dataTbl.get(0).get("Payee name"));
		Util.takeScreenShot();
		Thread.sleep(1000);
		Util.takeScreenShot();
		
	}
	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() {
		retail.selectCheckBox();
		Util.takeScreenShot();
	    
	}
	@When("User click on Continue button")
	public void user_click_on_continue_button() {
		retail.clickOncontinueBtn();
	    
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() {
		retail.validateSuccessMsg();
		Util.takeScreenShot();
	    
	}


	@When("User click on ‘Edit your affiliate informationlink")
	public void user_click_on_edit_your_affiliate_informationlink() {
	    
	}
	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
	   
	}
	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
	   
	}
	
	@When("User click on ‘Edit your account information’ link")
	public void user_click_on_edit_your_account_information_link() {
	   
	}
	@When("User modify below information")
	public void user_modify_below_information(DataTable dataTable) {

	
	}
	
	@Then("User should see a message ‘Success: Your account has been successfully updated")
	public void user_should_see_a_message_success_your_account_has_been_successfully_updated() {
	    
	}


	



	










}
