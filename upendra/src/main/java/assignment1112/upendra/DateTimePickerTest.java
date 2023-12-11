package assignment1112.upendra;
/**
 *DateTimePicker Test.
 * 
 * @upendra
 *
 */

	

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

	
	public class DateTimePickerTest {

		static WebDriver driver;

		public static void main(String[] args) {
			
			setUp();
			
			testDateTimePicker();
		}

		public static void setUp() {

			// step1: formulate a test domain url & driver path
			String siteUrl = "file:///C:/Users/upend/eclipse-workspace/seleniumtest/static/webelements.html";
			String driverPath = "drivers/windows/chromedriver.exe";

			// step2: set system properties for selenium dirver
			System.setProperty("webdriver.chrome.driver", driverPath);

			// step3: instantiate selenium webdriver
			driver = new ChromeDriver();

			// step4: add implicit wait (Unconditional Delay)
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

			// step5: launch browser
			driver.get(siteUrl);
		}
		
		// Pick date as 09/25/2023  select 02:45 PM
		public static void testDateTimePicker() {
			
			//Find the date time picker control
			WebElement dateInput = driver.findElement(By.id("bdatetime"));
			
			//Fill date as dd/mm/yyyy as 09/25/2013
			dateInput.sendKeys("25122023");
			
			 //Press tab to shift focus to time field
			dateInput.sendKeys(Keys.TAB);
			
			//Fill time as 02:45 PM
			dateInput.sendKeys("0245PM");
			
			
		}
	}


