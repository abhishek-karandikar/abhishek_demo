package IV;


import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class openmrs {

	public static void main(String[]args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
						"D:\\Automation_Files\\chromedriver_win32\\chromedriver.exe");
						   ChromeDriver driver = new ChromeDriver();
						   
						   String browser = "Chrome";
							
						    switch (browser)
						    {
						    case ("Firefox"):
						    	System.out.println("");
						    break;
						   
						    case("Chrome"):
						    	
						    }
driver.navigate().to(" https://demo.openmrs.org/openmrs/login.htm");
driver.manage().window().maximize();
Thread.sleep(1000);



String ExpectedTitle = "Login";
String ActualTitle = driver.getTitle();
Asserts.check(ExpectedTitle.isBlank(), "");
//Assert.isTrue(ExpectedTitle.equals("Login"), "The title is same", "");

	}
}
