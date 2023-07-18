import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEx {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/WeekendDesigningSessions/Ex5.html");
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.name("ddlLoc"));
		Thread.sleep(3000);
		Select locOption = new Select(dropdown);
		List<WebElement>  showall =  locOption.getOptions();
		
		for(WebElement w : showall)
		{
			System.out.println(w.getText());
		}
		locOption.selectByIndex(1);
		Thread.sleep(3000);
	
		locOption.selectByValue("Hyderabad");
		Thread.sleep(3000);
		locOption.selectByVisibleText("Amaravathi");
		Thread.sleep(3000);
		System.out.println("------------------");
		System.out.println("Selected Value : " + locOption.getFirstSelectedOption().getText());
		System.out.println("------------------");
		
		// dropdown with multiple options
		
		WebElement multiDropdown = driver.findElement(By.name("ddlCourse"));
		Select multiOptions = new Select(multiDropdown);
		
		List<WebElement>  mul_All = multiOptions.getOptions();
		
		for(WebElement m : mul_All)
		{
			System.out.println(m.getText());
		}
		System.out.println("--------");
		
		multiOptions.selectByIndex(0);
		Thread.sleep(3000);
		multiOptions.selectByValue("Dotnet");
		Thread.sleep(3000);
		multiOptions.selectByVisibleText("Python Course");
		Thread.sleep(3000);
		multiOptions.deselectByValue("Dotnet");
		Thread.sleep(3000);
		
		List<WebElement>  selectedOptions = multiOptions.getAllSelectedOptions();
		
		for(WebElement s : selectedOptions)
		{
			System.out.println(s.getText());
		}
		System.out.println("--------");
		
		driver.quit(); // it will close the browser
	}
}
