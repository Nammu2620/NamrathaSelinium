package Scripts_Execution.copy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_001_Gucci_Test {
	@Test
	public void run() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.gucci.com/us/en/ca/women/handbags-c-women-handbags");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
