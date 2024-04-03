package Scripts_Execution.copy;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test_002_VanHeusen_Test
{
	@Test
	public void run() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.vanheusen.com/");
		driver.manage().window().minimize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
}
