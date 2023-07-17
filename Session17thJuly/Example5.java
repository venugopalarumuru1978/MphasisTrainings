import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// example of how to handle checkbox
public class Example5 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/WeekendDesigningSessions/Ex5.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement chkbox1 = driver.findElement(By.name("chk1"));
		chkbox1.click();  // it will check option
		Thread.sleep(2000);
		if(chkbox1.isSelected())
		{
			String val = chkbox1.getAttribute("value");
			System.out.println("Given Value is : " + val);
			chkbox1.click(); // uncheck
			System.out.println("Option Unchecked");
		}
	}
}
