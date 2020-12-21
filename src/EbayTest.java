import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com");
		Thread.sleep(3000);
	//	driver.findElement(By.id("id=\"gh-ac\")).sendKeys("airpods pro");
		driver.findElement(By.xpath("//input[@id='gh-ac']")).sendKeys("airpods pro");
		Thread.sleep(3000);
		driver.findElement(By.id("gh-btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//h3[contains(text(),'Apple Airpods Pro White In Ear Headset with Wirele')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("binBtn_btn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(text(),'No thanks')]")).click();
		
		
		Thread.sleep(3000);
		driver.close();

	}

}
