import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actionone {

	@org.testng.annotations.Test
	private void finalone() throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless"); // Run in headless mode
		options.addArguments("--no-sandbox"); // Disable sandbox for CI
		options.addArguments("--disable-dev-shm-usage"); // Avoid /dev/shm issues
		options.addArguments("--disable-gpu"); // Avoid GPU bugs in CI
		options.addArguments("--remote-allow-origins=*"); // Avoid CORS issues (optional)

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://app.madtech.ai/");
		Thread.sleep(4000);
		driver.close();
	}
}
