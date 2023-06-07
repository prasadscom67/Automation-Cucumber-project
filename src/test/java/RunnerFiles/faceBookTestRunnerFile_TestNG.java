package RunnerFiles;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
			
				
				//dryRun=false,
				//extraGlue=false,
		features = { 
				 //"src\\test\\resources\\features\\FACEBOOK.feature"
				 //"src\\test\\resources\\features\\AMAZON.feature",
				 "src\\test\\resources\\features\\DBTESTING.feature"
				},
				glue = { //"globalMethods",
						 //"faceBookStepDefination"
						 "DBTESTINGStepDefination"
						},
				//monochrome = true, 
				//name=false,
				//objectFactory=false,
				//plugin={"json:target/cucumber.json"}
				
						
				plugin={ "pretty", 
						"html:target/CUCUMBER-REPORT_TestNG.html"
						//"errorDescription.MyTestListener"
						//"json:Folder_Name/cucumber.json"
						//"junit:Folder_Name/cucumber.xml" 
						}
				//publish=false
				//snippets=false,
			    //tags = "@Anushna" // Tags are nothing but filters
				
		
)
				
				

public class faceBookTestRunnerFile_TestNG extends AbstractTestNGCucumberTests {
	public static boolean URLstatus = true;
	public static String siteURL = "http://www.facebook.com/r.php?locale=en_GB&display=page";
	@Test //(groups="cucumber",description="Runs Cucumber Feature",dataProvider="features")
	public void featureXL() { //(CucumberFeatureWrapper cucumberFeature) {
		//System.out.println("Test");
//		//testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//		testNGCucumberRunner.runCucumber(cucumberFeature.getCucumberFeature());
//		
	}

}