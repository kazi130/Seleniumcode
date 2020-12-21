import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://Facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("kjewel74@yahoo.com");
		driver.findElement(By.id("pass")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
		
		

	}

}
