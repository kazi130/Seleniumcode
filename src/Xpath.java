import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://gmail.com");	
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("kazijewel7@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]")).click();

	}

}
