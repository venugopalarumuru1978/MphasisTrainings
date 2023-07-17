import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// example of how to handle textbox
public class Example3 {

	public static void main(String[] args) throws Exception
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("email"));
		if(element.isDisplayed())
		{
			if(element.isEnabled())
			{
				element.sendKeys("abc@gmail.com"); // sending text to the textbox
				String enteredText =  element.getAttribute("value");
				System.out.println("Given Mail : " + enteredText);
				Thread.sleep(3000);
				element.clear();
				// clicking hyperlink
				driver.findElement(By.linkText("Forgotten password?")).click();				
			}
			else
				System.out.println("Textbox is Disabled");
		}
		else
			System.out.println("Textbox is not Visiable");
	}
}
