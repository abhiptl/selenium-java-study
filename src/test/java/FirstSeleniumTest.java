import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by Abhishek.
 */
public class FirstSeleniumTest {

	@Before
	public void setUp() {
		//System.setProperty("webdriver.gecko.driver", "C:\\Sanelib\\workspace\\Selenium\\selenium-java-study\\src\\test\\resources\\geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", "/home/ubuntu/selenium-deploys/drivers/geckodriver");
	}

	/*@Test
	public void testGoogleHomeWithGoogleChrome() {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://www.google.com");

		assertThat(webDriver.getTitle(), is(equalTo("Google")));

		webDriver.quit();
	}*/

	@Test
	public void testGoogleHomeWithFirefox() {
		WebDriver webDriver = new FirefoxDriver();
		webDriver.get("https://www.google.com");

		assertThat(webDriver.getTitle(), is(equalTo("Google")));

		webDriver.quit();
	}


}
