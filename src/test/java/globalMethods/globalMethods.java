package globalMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import faceBookStepDefination.Hooks;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

public class globalMethods {
	public static WebDriver driver = Hooks.driver;

	public static WebElement Elementxpath(String xpath) {

		return driver.findElement(By.xpath(xpath));

	}

	public static WebElement Elementid(String id) {

		return driver.findElement(By.id(id));
	}

	public static WebElement Elementname(String name) {

		return driver.findElement(By.name(name));
	}

	public static WebElement Elementclassname(String classname) {

		return driver.findElement(By.className(classname));
	}

	public static WebElement Elementlinktext(String linkText) {

		return driver.findElement(By.linkText(linkText));

	}

	public static WebElement Elementpartiallinktext(String partiallinktext) {

		return driver.findElement(By.partialLinkText(partiallinktext));
	}

	public static WebElement Elemenettagname(String Tagname) {

		return driver.findElement(By.tagName(Tagname));
	}

}
