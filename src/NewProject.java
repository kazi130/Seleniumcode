import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NewProject {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
					
					WebDriver driver = new ChromeDriver();
					driver.manage().window().maximize();
					driver.get("https://demoqa.com");	
			        Thread.sleep(3000);
			        driver.findElement(By.xpath("(//div[@class='category-cards']//div[@class='card-up'])[1]")).click();
			        Thread.sleep(2000);
			         driver.findElement(By.id("item-0")).click();
			         Thread.sleep(2000);
			         driver.findElement(By.id("item-1")).click();
		//	         driver.findElement(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/ol[1]/li[1]/span[1]/label[1]/span[1]/*[1]")).click();
			         driver.findElement(By.xpath("//span[@class='rct-checkbox']")).click();
	}

}
