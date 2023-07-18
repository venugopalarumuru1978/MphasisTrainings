import java.io.File;
import java.io.FileOutputStream;
import java.util.Base64;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {

	public static void main(String[] args) throws Exception {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		//method 1
		//File sourceFile = driver.getScreenshotAs(OutputType.FILE);
		//File destFile = new File("./ScreenShots/demo.jpg");
		//FileUtils.copyFile(sourceFile, destFile);
		//System.out.println("Screenshot taken successfully");
		
		// method 2
		//byte[]  bytearr = driver.getScreenshotAs(OutputType.BYTES);
		//File destFile = new File("./ScreenShots/demo1.jpg");
		//FileOutputStream fos = new FileOutputStream(destFile);
		//fos.write(bytearr);
		//fos.close();
		//System.out.println("Screenshot taken successfully");
		
		
		// method 3
		
		String base64code =  driver.getScreenshotAs(OutputType.BASE64);
		byte[] bytarr =  Base64.getDecoder().decode(base64code);
		File destFile = new File("./ScreenShots/demo2.jpg");
		FileOutputStream fos = new FileOutputStream(destFile);
		fos.write(bytarr);
		fos.close();
		System.out.println("Screenshot taken successfully");
		
		Thread.sleep(2000);
		driver.quit();
	}
}