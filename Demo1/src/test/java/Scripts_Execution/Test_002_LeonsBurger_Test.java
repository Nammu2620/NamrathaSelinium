package Scripts_Execution;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_002_LeonsBurger_Test {
	@Test
	public void run() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leons.in/");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
