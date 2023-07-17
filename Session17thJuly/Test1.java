import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Mphasis\\chromedriver_win32\\chromedriver.exe");;
		WebDriver  n = new ChromeDriver();
		n.get("http://www.google.com/");
	}

}
