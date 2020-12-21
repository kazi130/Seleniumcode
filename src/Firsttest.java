import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firsttest {

	public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
			
			WebDriver kazi = new ChromeDriver();
	      kazi.manage().window().maximize();
		  Thread.sleep(5000);
			kazi.get("https://amazon.com/");
			
Thread.sleep(5000);	
kazi.close();
	}

}
