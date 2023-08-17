package IV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMS {
	public static void main(String[]args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
						"D:\\Automation_Files\\chromedriver_win32\\chromedriver.exe");
						   ChromeDriver driver = new ChromeDriver();
						   
						    driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
							driver.manage().window().maximize();
							 Thread.sleep(1000);
							
WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
username.click();
username.sendKeys("Admin");	
Thread.sleep(1000);
driver.findElement(By.xpath("//input[@name=\"password\"]")).click();
driver.findElement(By.xpath("//input[@name=\"password\"]")).sendKeys("admin123");
Thread.sleep(1000);

String expected = "OrangeHRM";
WebElement e = (driver.findElement(By.xpath("//img[@src='/web/images/ohrm_branding.png?v=1689053487449']")));
String Actual = e.getText();

if(expected.equals(Actual)) {
	System.out.println("OrangeHRM is dispalyed");
}
else {
	System.out.println("OrangeHRM isn't dispalyed");
}
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();


driver.close();

	}	
}
