package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * You can select the browser where the test will be executed
 * @author Max szmid
 */

public class SelectBrowsers {

	static String urlFirefoxWebDriver = "your location of the firefox web driver";
	static String urlChromeWebDriver = "your location of the Chrome web driver";

	/**
	 * Method that allows you to select the browser
	 * 
	 * @param String broweserName --> the name of the browser that you want to
	 *               select.
	 * 
	 * @return Webdriver
	 */
	public static WebDriver selectBrowser(String browserName) {
		WebDriver driver = null;

		if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", urlFirefoxWebDriver);
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", urlChromeWebDriver);
			driver = new ChromeDriver();
		}

		return driver;
	}

}
