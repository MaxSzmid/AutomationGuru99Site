package automateWebSiteGuru;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class NewAccount {

	public NewAccount(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private WebDriver goToNewAccount;

	@FindBy(xpath = "//*[@name='cusid']")
	private WebElement accountID;

	@FindBy(xpath = "//*[@name='inideposit']")
	private WebElement initialDeposit;

	@FindBy(xpath = "//*[@name='button2']")
	private WebElement submitButton;

	@FindBy(xpath = "//*[@name='reset']")
	private WebElement resetButton;
	

	public void goToNewAccount(WebDriver driver) {
		driver.get("http://demo.guru99.com/V1/html/addAccount.php");
		
	}

	public void setAccountID(String accountID) {
		this.accountID.sendKeys(accountID);
	}

	public void setAccountType(String accounType) {
		try {
		    Select select = new Select(this.goToNewAccount.findElement(By.xpath("//*[@name='selaccount']")));
			select.selectByVisibleText(accounType);
		} catch (Exception e) {
			System.out.println("El elemento seleccionado no existe \n" + e);
		}
	}

	public void setInitialDeposit(String initialDeposit) {
		this.initialDeposit.sendKeys(initialDeposit);
	}

	public void clickOnSubmit() {
		this.submitButton.click();
	}

	public void clickOnResetButton() {
		this.resetButton.click();
	}

}
