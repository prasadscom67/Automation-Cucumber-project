package faceBookPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import globalMethods.globalMethods;

public class faceBookPO2 {

	WebElement firstName() {
		return globalMethods.Elementname("firstname");
	}

	WebElement lastName() {
		return globalMethods.Elementname("lastname");
	}

	WebElement mobilenumber() {
		return globalMethods.Elementxpath("//input[@aria-label='Mobile number or email address']");
	}

	WebElement reentermobilenumber() {
		return globalMethods.Elementxpath("//input[@aria-label='Re-enter email address']");
	}

	WebElement password() {
		return globalMethods.Elementid("password_step_input");
	}

	WebElement day() {
		return globalMethods.Elementid("days");
	}

	WebElement month() {
		return globalMethods.Elementid("month");
	}

	WebElement year() {
		return globalMethods.Elementid("year");
	}

	WebElement radiobutton() {
		return globalMethods.Elementxpath("//label[text()='Females']");
	}

	WebElement signup() {
		return globalMethods.Elementxpath("//button[@name='websubmit']");
	}
	
		

	// setter methods

	public void FaceBookLogin(String username, String lastname, String emailID, String mobileNumber, String password) {

		firstName().sendKeys(username); //driver.findElement(By.xpath("//a[text='hi'").sendKeys("anu");
		lastName().sendKeys(lastname);
		mobilenumber().sendKeys(emailID);
		reentermobilenumber().sendKeys(mobileNumber);
		password().sendKeys(password);
	}

	public void enterBody() throws InterruptedException {

		Select selobj = new Select(globalMethods.Elementid("day"));
		Thread.sleep(2000);
		selobj.selectByValue("6");
		Select selobj1 = new Select(globalMethods.Elementid("month"));
		Thread.sleep(2000);
		selobj1.selectByValue("12");
		Select selobj2 = new Select(globalMethods.Elementid("year"));
		Thread.sleep(2000);
		selobj2.selectByVisibleText("1993");

	}

	public void signpButton() {
		radiobutton().click();
		signup().click();

	}

}
