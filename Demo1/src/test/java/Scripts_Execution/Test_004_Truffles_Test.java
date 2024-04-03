package Scripts_Execution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_004_Truffles_Test {
	@Test
	public void run() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.truffles.co.in/");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
