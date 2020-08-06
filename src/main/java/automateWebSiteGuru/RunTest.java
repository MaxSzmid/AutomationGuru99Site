package automateWebSiteGuru;

import org.openqa.selenium.WebDriver;

import browser.SelectBrowsers;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {
		// select the browser
		WebDriver driver = SelectBrowsers.selectBrowser("chrome");
		driver.get("http://demo.guru99.com/V1/index.php");

		// creating an object to execute the "Login" test
		// testCase 1
		LoginPage page = new LoginPage(driver);
		page.setUser("mngr276741");
		page.setPassword("YsaqAjY");
		page.clickOnButtonLogin();
		Thread.sleep(4000);

		// creating an object to execute the "Home page" test
		// testCase 2
		HomePage homePage = new HomePage(driver);
		homePage.clickOnNewCustomer();

		// creating an object to execute the "Create new customer" test
		// testCase 3
		NewCustomerPage newCustomer = new NewCustomerPage(driver);
		newCustomer.setName("Carlos");
		newCustomer.setGender("famale");
		newCustomer.setDOB("02/08/1992");
		newCustomer.setAdress("Independencia 59");
		newCustomer.setCity("Cordoba");
		newCustomer.setState("Argentina");
		newCustomer.setPIN("515251");
		newCustomer.setPhone("3564665543");
		newCustomer.setEmail("testEmail@email.com");
		Thread.sleep(4000);

		// creating an object to execute the "Create new account test"
		// testCase 4
		NewAccount newAccount = new NewAccount(driver);
		// This action redirect you to the page "New Account "because the button" New
		// account" isn't clickable
		newAccount.goToNewAccount(driver);
		newAccount.setAccountID("1");
		newAccount.setInitialDeposit("$500");
		Thread.sleep(4000);
	}

}
