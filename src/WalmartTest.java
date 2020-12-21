import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WalmartTest {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://walmart.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("global-search-input")).sendKeys("laptop");
		driver.findElement(By.id("global-search-submit")).click();
		driver.findElement(By.xpath("//*[@id=\"searchProductResult\"]/ul/li[4]/div/div[2]/div[2]/a/div/img")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-label='Purple']")).click();
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

	}

}
