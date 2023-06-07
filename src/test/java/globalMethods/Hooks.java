package globalMethods;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import RunnerFiles.faceBookTestRunnerFile_JUnit;
import RunnerFiles.faceBookTestRunnerFile_TestNG;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks {

	public static WebDriver driver;
	public static String URL;

	@Before
	public static void launchBrowser() {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(options);

		if (faceBookTestRunnerFile_JUnit.URLstatus) {
			URL = faceBookTestRunnerFile_JUnit.siteURL;
		}
		if (faceBookTestRunnerFile_TestNG.URLstatus) {
			URL = faceBookTestRunnerFile_TestNG.siteURL;
		}

		driver.get(URL);
		driver.manage().window().maximize();

	}

	@After
	public static void close(Scenario scenario) {

		if (scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot) driver;

			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "Screenshot");
		}

		driver.close();
		driver.quit();
	}

}
