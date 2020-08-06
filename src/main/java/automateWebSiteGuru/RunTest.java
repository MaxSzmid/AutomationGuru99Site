package automateWebSiteGuru;

import org.openqa.selenium.WebDriver;

import browser.SelectBrowsers;

public class RunTest {

	public static void main(String[] args) throws InterruptedException {
		// select the browser
		WebDriver driver = SelectBrowsers.selectBrowser("chrome");
		// get the URL
		driver.get("http://demo.guru99.com/V1/index.php");
		// create an object with which you are going to execute the test
		// testCase 1
		LoginPage page = new LoginPage(driver);
		page.setUser("mngr276741");
		page.setPassword("YsaqAjY");
		page.clickOnButton();
		Thread.sleep(4000);

		// testCase 2
		HomePage homePage = new HomePage(driver);
		homePage.clickOnNewCustomer();

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

		// testCase 4
		NewAccount newAccount = new NewAccount(driver);
		newAccount.goToNewAccount(driver);
		newAccount.setAccountID("1");
		//newAccount.setAccountType("current");
		newAccount.setInitialDeposit("$500");
		Thread.sleep(4000);
		
		System.out.println("Test success");

	}

}
