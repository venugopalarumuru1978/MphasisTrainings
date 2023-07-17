import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example2 {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.id("email"));
		highlight(driver, element);
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.name("pass")));
		Thread.sleep(2000);
		//highlight(driver, driver.findElement(By.className("_6ltj")));
		//highlight(driver, driver.findElement(By.linkText("Forgotten password?")));
		highlight(driver, driver.findElement(By.partialLinkText("Forgotten")));
		Thread.sleep(2000);
		highlight(driver, driver.findElement(By.name("login")));
	}

	public static void highlight(WebDriver driver, WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		jsExecutor.executeScript("arguments[0].setAttribute('style', 'border:2px solid red; background:yellow')", element);
	}

}
