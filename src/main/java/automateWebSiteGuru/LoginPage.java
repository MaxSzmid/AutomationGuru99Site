package automateWebSiteGuru;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(name = "uid")
	private WebElement user;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(name = "btnLogin")
	private WebElement buttonLogIn;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	/**
	 * set up the username
	 * 
	 * @param String user
	 */
	public void setUser(String user) {
		this.user.sendKeys(user);
	}

	/**
	 * set up the password
	 * 
	 * @param String password
	 */
	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	/**
	 * make click on login button
	 */
	public void clickOnButtonLogin() {
		this.buttonLogIn.click();
	}

}
