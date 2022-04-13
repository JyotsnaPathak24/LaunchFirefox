package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefoxBrowser {
	public static void main(String[] args) {
		
	    System.setProperty("webdriver.gecko.driver", "C:\\Users\\harsh\\eclipse-workspace\\LaunchFirefox\\FirefoxBrowserJars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.quit();
		}
}
