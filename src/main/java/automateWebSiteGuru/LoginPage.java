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

	public void setUser(String user) {
		this.user.sendKeys(user);
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);
	}

	public void clickOnButton() {
		this.buttonLogIn.click();
	}

}
