package faceBookStepDefination;

import java.io.IOException;
import java.util.HashMap;
import org.openqa.selenium.WebDriver;
import faceBookPage.faceBookPO;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class faceBookSteps {
	public static WebDriver driver = Hooks.driver;
	public faceBookPO faceBookObj;
	
	@Given("This is for testing")
	public void this_is_for_testing() {
		System.out.println("This is for testing Background");
	}

	@Given("launch the fb application")
	public void launch_the_fb_application() {
		System.out.println("Broswer has been launched");
	}
	
	@When("provide all the details")
	public void provide_all_the_details() {
		System.out.println("This is for testing purpose");
		
	}

	@When("provide all the details {string}")
	public void provide_all_the_details(String DATA) throws IOException, InterruptedException {

		HashMap getData = utilities.XLSreader.getData(DATA);

		String userName = (String) getData.get("USERNAME");
		String lastName = (String) getData.get("LASTNAME");
		String emailID = (String) getData.get("EMAILID");
		String moibleNumber = (String) getData.get("MOBILENUMBER");
		String password = (String) getData.get("PASSWORD");
		
		faceBookObj = new faceBookPO();

		faceBookObj.FaceBookLogin(userName, lastName, emailID, moibleNumber, password);
		faceBookObj.enterBody();
		faceBookObj.signpButton();
		System.out.println("Values are entered e properly for tesssting");

	}

	@Then("user is navigated to fb homepage")
	public void user_is_navigated_to_fb_homepage() {
		System.out.println("Browser has been closed");
	}

}
