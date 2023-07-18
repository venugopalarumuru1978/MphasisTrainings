import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com/");
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("Seven Wonders of the World");
		driver.findElement(By.name("q")).submit();
		Thread.sleep(3000);
		driver.navigate().to("http://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.quit(); // it will close the browser
	}
}
