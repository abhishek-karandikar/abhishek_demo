package IV;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class applittool {

	public static void main(String[]args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
						"D:\\Automation_Files\\chromedriver_win32\\chromedriver.exe");
						   ChromeDriver driver = new ChromeDriver();
						    
driver.navigate().to(" https://demo.applitools.com/");

driver.manage().window().maximize();
Thread.sleep(1000);
driver.findElement(By.id("username")).sendKeys("Admin");
driver.findElement(By.id("password")).sendKeys("Admin123");
driver.findElement(By.id("log-in")).click();

WebElement searchBar=driver.findElement(By.xpath("//a[@id='log-in']/following::img)[2]"));
searchBar.click();

System.out.println("tesing");

}}