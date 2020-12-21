import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumClass3 {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
		driver.findElement(By.xpath("(//span[@class='nav-line-1'])[3]")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("ap_email")).sendKeys("kjewel74@yahoo.com");
		Thread.sleep(3000);
		driver.findElement(By.id("continue")).submit();
		Thread.sleep(3000);
		driver.findElement(By.name("password")).sendKeys("abc123");
		Thread.sleep(3000);
		driver.findElement(By.id("signInSubmit")).submit();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
