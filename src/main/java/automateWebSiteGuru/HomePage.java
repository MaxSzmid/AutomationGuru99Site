package automateWebSiteGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[3]/div/ul/li[5]/a")
	private WebElement newAccountButton;
	
	@FindBy(linkText = "New Customer")
	private WebElement newCustomerButton;

	public void goToNewAccount() {
		this.newAccountButton.click();
	}

	public void clickOnNewCustomer() {
		this.newCustomerButton.click();
	}
}
