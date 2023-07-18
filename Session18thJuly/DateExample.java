import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateExample {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/WeekendDesigningSessions/Ex5.html");
		Thread.sleep(3000);
		WebElement dateBox = driver.findElement(By.name("txtBDate"));
		dateBox.sendKeys("18072023");
		System.out.println("Value is : " + dateBox.getAttribute("value"));
		Thread.sleep(3000);
		driver.quit();
	}
}