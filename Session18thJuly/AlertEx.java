import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertEx {

	public static void main(String[] args)  throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/WeekendDesigningSessions/Ex6.html");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		// Alert Box
		WebElement alert = driver.findElement(By.id("AlertBox"));
		alert.click();
		// to get msg from alertbox
		String msg = driver.switchTo().alert().getText();
		System.out.println("Message : " + msg);
		// to click Ok button on Alertbox
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		// Confirm Box
		System.out.println(driver.findElement(By.id("res2")).getText());
		driver.findElement(By.id("ConfirmBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();  // clicking Ok button
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("res2")).getText());
		driver.findElement(By.id("ConfirmBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss(); // clicking Cancel Button
		System.out.println(driver.findElement(By.id("res2")).getText());
		Thread.sleep(3000);
		
		// Prompt Box
		System.out.println(driver.findElement(By.id("res1")).getText());
		driver.findElement(By.id("PromptBox")).click();
		Thread.sleep(3000);
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("Praveen Kumar");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();  // clicking Ok button
		Thread.sleep(3000);
		System.out.println(driver.findElement(By.id("res1")).getText());
		driver.findElement(By.id("PromptBox")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss(); // clicking Cancel Button
		System.out.println(driver.findElement(By.id("res1")).getText());
		Thread.sleep(3000);
		
		driver.quit(); // it will close the browser
	}
}
