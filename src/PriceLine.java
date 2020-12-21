import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PriceLine {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://priceline.com");	
	//	driver.findElement(By.id("location")).sendKeys("JFK");
		driver.findElement(By.xpath("//input[@id='location']")).sendKeys("Jamaica, NY");
		
      
	}

}
