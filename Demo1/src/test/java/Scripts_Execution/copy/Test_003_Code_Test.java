package Scripts_Execution.copy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_003_Code_Test {
	@Test
	public void run() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.lifestylestores.com/in/en");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
