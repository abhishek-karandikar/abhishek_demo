package IV;

import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class wikipedia {

	public static void main(String[]args) throws InterruptedException {


	System.setProperty("webdriver.chrome.driver",
					"D:\\Automation_Files\\chromedriver_win32\\chromedriver.exe");
					   ChromeDriver driver = new ChromeDriver();
					    Thread.sleep(1000);
					    driver.navigate().to("https://www.wikipedia.org/");
						driver.manage().window().maximize();
						
	driver.findElement(By.xpath("//a[@id='js-link-box-en']")).click();
	WebElement searchBar=driver.findElement(By.xpath("//input[@class='cdx-text-input__input']"));
	searchBar.click();
	searchBar.sendKeys("Salman Khan");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//button[@class='cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button']")).click();
    WebElement element = driver.findElement(By.xpath("//img[@width='220']"));
	System.out.println("The size is same"+ element.getSize());

 
driver.findElement(By.xpath("//div[@class='vector-toc-text']//following::div[5]]")).click();
 String expected = "2009–present: Commercial sucess";
 WebElement e = (driver.findElement(By.xpath("//span[@id='2009–present:_Commercial_success']")));
 String Actual = e.getText();
 
if(Actual.equals(expected)) {
	System.out.println("This is right Text");
}

else {
	System.out.println("This isn't right Text");
}
driver.close();
	}
	
}
