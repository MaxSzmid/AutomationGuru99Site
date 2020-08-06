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
	/**
	 * 
	 * @param String nameCustomer
	 */
	public void setName(String nameCustomer) {
		this.nameCustomer.sendKeys(nameCustomer);
	}
	/**
	 * set the gender using the radiobuttons
	 * @param gender
	 */
	public void setGender(String gender) {

		if (gender.equalsIgnoreCase("male")) {
			this.Gender.get(0).click();
		} else {
			this.Gender.get(1).click();
		}
	}
	/**
	 * 	set the Date of birth(dob)
	 * @param String dob
	 */
	public void setDOB(String dob) {
		this.DOB.sendKeys(dob);
	}
	/**
	 * 
	 * @param String adress
	 */
	public void setAdress(String adress) {
		this.adress.sendKeys(adress);
	}
	/**
	 * 
	 * @param String city
	 */
	public void setCity(String city) {
		this.city.sendKeys(city);
	}
	/**
	 * 
	 * @param String state
	 */
	public void setState(String state) {
		this.state.sendKeys(state);
	}
	/**
	 * Set your secret pin min 6 digits
	 * @param String pin
	 */
	public void setPIN(String pin) {
		this.pin.sendKeys(pin);
	}
	/**
	 * 
	 * @param String phone
	 */
	public void setPhone(String phone) {
		this.phone.sendKeys(phone);

	}
	/**
	 * 
	 * @param String email
	 */
	public void setEmail(String email) {
		this.email.sendKeys(email);
	}
	/**
	 * make click on submit button
	 */
	public void clickOnSubmitButton() {
		this.submit.click();
	}

}
