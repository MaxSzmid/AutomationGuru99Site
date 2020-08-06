package automateWebSiteGuru;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class NewCustomerPage {
	@FindBy(xpath = "//*[@name='name']")
	private WebElement nameCustomer;

	@FindBys(@FindBy(xpath = "//*[@name='rad1']"))
	private List<WebElement> Gender = null;

	@FindBy(xpath = "//*[@id='dob']")
	private WebElement DOB;

	@FindBy(xpath = "//*[@name='addr']")
	private WebElement adress;

	@FindBy(xpath = "//*[@name='city']")
	private WebElement city;

	@FindBy(xpath = "//*[@name='state']")
	private WebElement state;

	@FindBy(xpath = "//*[@name='pinno']")
	private WebElement pin;

	@FindBy(xpath = "//*[@name='telephoneno']")
	private WebElement phone;

	@FindBy(xpath = "//*[@name='emailid']")
	private WebElement email;

	@FindBy(xpath = "//*[@name='sub']")
	private WebElement submit;

	public NewCustomerPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setName(String nameCustomer) {
		this.nameCustomer.sendKeys(nameCustomer);
	}

	public void setGender(String gender) {

		if (gender.equalsIgnoreCase("male")) {
			this.Gender.get(0).click();
		} else {
			this.Gender.get(1).click();
		}
	}

	public void setDOB(String dob) {
		this.DOB.sendKeys(dob);
	}

	public void setAdress(String adress) {
		this.adress.sendKeys(adress);
	}

	public void setCity(String city) {
		this.city.sendKeys(city);
	}

	public void setState(String state) {
		this.state.sendKeys(state);
	}

	public void setPIN(String pin) {
		this.pin.sendKeys(pin);
	}

	public void setPhone(String phone) {
		this.phone.sendKeys(phone);

	}

	public void setEmail(String email) {
		this.email.sendKeys(email);
	}

	public void clickOnSubmitButton() {
		this.submit.click();
	}

}
