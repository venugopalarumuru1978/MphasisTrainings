import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.openqa.selenium.chrome.WebDriverManager;

public class PageTimeOut {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//WebDriverManager.chromerdriver.setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
		
		Instant startTime = Instant.now();
		System.out.println(startTime.toString());
		
		driver.get("https://www.youtube.com/");
		
		Instant endTime = Instant.now();
		System.out.println(endTime.toString());
		
		Duration duration = Duration.between(startTime, endTime);
		System.out.println("Page Load Duration Time is : " + duration.toMillis() + " Milli Seconds");
		Thread.sleep(3000);
		driver.quit();
	}
}