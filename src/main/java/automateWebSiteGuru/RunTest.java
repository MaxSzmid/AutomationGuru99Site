package automateWebSiteGuru;

import org.openqa.selenium.WebDriver;

import browser.SelectBrowsers;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {
		// Select the browser
		WebDriver driver = SelectBrowsers.selectBrowser("chrome");
		driver.get("http://demo.guru99.com/V1/index.php");
		//You can check all the ducumentation in the folder Documentation ---> Gherkins and testCases"

		// Test Case (Guru99_TC_1)
		LoginPage page = new LoginPage(driver);
		page.setUser("mngr276741");
		page.setPassword("YsaqAjY");
		page.clickOnButtonLogin();
		System.out.println("test case 1 excecuted");
		Thread.sleep(4000);

		// Test Case (Guru99_TC_2)
		HomePage homePage = new HomePage(driver);
		homePage.clickOnNewCustomer();
		System.out.println("test case 2 excecuted");
		Thread.sleep(4000);

		// Test Case(Guru99_TC_3)
		NewCustomerPage newCustomer = new NewCustomerPage(driver);
		newCustomer.setName("Carlos Szmid");
		newCustomer.setGender("famale");
		newCustomer.setDOB("02/08/1992");
		newCustomer.setAdress("Independencia 59");
		newCustomer.setCity("Saldán");
		newCustomer.setState("Cordoba");
		newCustomer.setPIN("313131");
		newCustomer.setPhone("1122334455");
		newCustomer.setEmail("testEmail@email.com");
		System.out.println("test case 3 excecuted");
		Thread.sleep(4000);

		// Test Case(Guru99_TC_4)
		NewAccount newAccount = new NewAccount(driver);
		newAccount.goToNewAccount(driver);
		// As the button doesn't work well, i decided to redirect manually to the "New account" page, but this isn't OK
		newAccount.setAccountID("123");
		newAccount.setAccountType("current");
		newAccount.setInitialDeposit("$500");
		System.out.println("test case 4 excecuted");
		Thread.sleep(4000);
	}

}
