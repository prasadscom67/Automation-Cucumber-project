package RunnerFiles;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(

		features = { "src\\test\\resources\\features\\faceBook.feature",
				"src\\test\\resources\\features\\amazon.feature",
				"src\\test\\resources\\features\\Testing.feature"
					 //"src\\test\\resources\\features\\amazon.feature"
				},
		glue = { "faceBookStepDefination" },
		
		plugin = { "pretty", 
				   "html:target/CUCUMBER-REPORT_JUnit.html",
				   //"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				   //"errorDescription.MyTestListener"
		//"errorDescription.MyTestListener"
		//"json:Folder_Name/cucumber.json",
		// "junit:Folder_Name/cucumber.xml"
		// "me.jvt.cucumber.report.prettyReports:target/cucumber"
		// "errorDescription.MyTestListener"
		}
		//tags = "@Anushna" // Tags are nothing but filters
		// dryRun=false,
		// extraGlue=false,
		// monochrome = true,
		// name=false,
		// objectFactory=false,
		// plugin={"json:target/cucumber.json"}
		// snippets=false,
		

)
public class faceBookTestRunnerFile_JUnit {
	public static boolean URLstatus = true;
	public static String siteURL = "http://www.facebook.com/r.php?locale=en_GB&display=page"; //QA
	//public static String siteURL = "http://www.facebook.com/r.php?locale=en_GB&display=page"; //STG
	//public static String siteURL = "http://www.facebook.com/r.php?locale=en_GB&display=page"; //Prod-beta
	//public static String siteURL = "http://www.facebook.com/r.php?locale=en_GB&display=page"; //Prod
	

}
