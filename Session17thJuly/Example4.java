import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// example of how to handle radiobutton
public class Example4 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/WeekendDesigningSessions/Ex5.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement radiobox1 = driver.findElement(By.id("malegen"));
		radiobox1.click();
		if(radiobox1.isSelected())
		{
			System.out.println("Gender Value is : " + radiobox1.getAttribute("value"));
		}
		Thread.sleep(2000);
		WebElement radiobox2 = driver.findElement(By.id("femalegen"));
		radiobox2.click();
		if(radiobox2.isSelected())
		{
			System.out.println("Gender Value is : " + radiobox2.getAttribute("value"));
		}		
	}
}
