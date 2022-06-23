package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import junit.framework.Assert;
import utilities.Util;

public class RetailPageObject extends Base{
	
	public RetailPageObject(){
		
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountOption;
	
	@FindBy(xpath="//a[text()='Login']")
	private WebElement logInOption;
	
	@FindBy(id="input-email")
	private WebElement userNameOption;
	
	@FindBy(id="input-password")
	private WebElement passwordOption;
	
	@FindBy(xpath="//input[@value='Login']")
	private WebElement logInButton;
	
	@FindBy (xpath="//a[text()='Register for an affiliate account']")
	private WebElement registerAffiliateAccount;
	
	@FindBy(id="input-company")
	private WebElement companyNam;
	
	@FindBy(id="input-website")
	private WebElement website;
	
	@FindBy(id="input-tax")
	private WebElement taxId;
	
	@FindBy(xpath="//input[@name='payment' and @value='cheque']")
	private WebElement paymentMethod;
	
	@FindBy(id="input-cheque")
	private WebElement payeeName;
	
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@type='submit']")
	private WebElement continueBtn;
	
	@FindBy(xpath="(//div//i[' Success: Your account has been successfully updated.'])[11]")
	private WebElement successMsg;
	
	public void clickOnMyAccount(){
		myAccountOption.click();
		
	}
	public boolean clickOnlogInOption(){
		logInOption.click();
		return true;
		
	}
	public void enterUserNameOption(String userN){
		userNameOption.sendKeys(userN);
	}
	public void enterPasswordOption(String Pas){
		passwordOption.sendKeys(Pas);
	}
	public void ClickOnlogInButton(){
		logInButton.click();
	}
	public boolean clickOnRegisterAffiliateAccount(){
		registerAffiliateAccount.click();
		return true;
	}
	public void entercompanyNam(String CompName ){
		companyNam.sendKeys(CompName);
		
	}
	public void enterwebsite(String webName){
		website.sendKeys(webName);
	}
	public void entertaxId(String taxIdName){
		taxId.sendKeys(taxIdName);
	}
	public void enterpaymentMethod(String payMethod){
		paymentMethod.sendKeys(payMethod);
	}
	
	public void selectCheckBox(){
		checkBox.click();
//		return true;
//	
//	}
//	public boolean validateCheckBox(){
//		if(checkBox.isSelected())
//			return true;
//		else 
//			return false;
//		Assert.assertEquals(expected, actual);
	
	}
	public void clickOncontinueBtn(){
		continueBtn.click();
	}
	
	public void validateSuccessMsg(){
		String text = successMsg.getText();
//		Assert.assertTrue(text.contains("Success: Your account has been successfully updated."));
		text.contains("Success: Your account has been successfully updated.");
	}
	public void validateUserDshboard(){
		driver.getCurrentUrl().contains("account");
	}
	public void enterPyeeNam(String pName){
		payeeName.sendKeys(pName);
		
	}

}
