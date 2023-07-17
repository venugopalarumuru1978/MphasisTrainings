import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// example of how to handle button
public class Example6 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/WeekendDesigningSessions/Ex5.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement txtpname = driver.findElement(By.id("txtPerson"));
		txtpname.sendKeys("Venugopal Arumuru");
		Thread.sleep(2000);
		WebElement button = driver.findElement(By.id("regBtn"));
		button.click();
		Thread.sleep(2000);
		System.out.println("Given Value is : " + driver.findElement(By.id("res")).getText());
	}
}
