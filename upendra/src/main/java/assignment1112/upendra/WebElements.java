package assignment1112.upendra;


	

	import java.time.Duration;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;

	/*
	 * Exlicit wait test synchronization
	 * Explicit wait in selenium is used for tell the web driver to wait for  a certain condition or maximum
	 *  to be exceeded before throwing "Element not visisble exception"
	 *  * @upendra
	 */
	public class WebElements {
		static WebDriver driver = null;
		static WebDriverWait wait;

		public static void main(String[] args) {

			setup();
			testmobilelink();
			testfashionlink();
			driver.close();
		}

		public static void setup() {

//			step1: formulate the test domain url and drive path
			String siteUrl = "https://www.amazon.in/";
			String driverPath = "drivers/windows/chromedriver.exe";

//			step2 :  System properties for selenium driver

			System.setProperty("webDriver.chrome.driver", driverPath);

//			step3 : Initiate selenium web driver

			driver = new ChromeDriver();

//			step 4 : add explicit way(conditional delay) 

			wait = new WebDriverWait(driver, Duration.ofSeconds(20));

//			step4 : Launch Browser

			driver.get(siteUrl);
		}

		public static void testmobilelink() {
//				int page;
//			WebElement mobilelink = driver.findElement(By.cssSelector("#a-page"));
			WebElement mobilelink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page")));
			System.out.println("is link loaded : " + mobilelink.isDisplayed());
			System.out.println("is link enabled : " + mobilelink.isEnabled());

			mobilelink.click();

			String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Test is Passed");
			} else {
				System.out.println("Test is failed");
			}
			System.out.println("Actual Title : " + actualTitle);
			System.out.println("Expected Title : " + expectedTitle);
		}

		public static void testfashionlink() {
//				int page;
//			WebElement fashionlink = driver.findElement(By.cssSelector("#a-page"));
			WebElement fashionlink = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#a-page")));
			System.out.println("is link loaded : " + fashionlink.isDisplayed());
			System.out.println("is link enabled : " + fashionlink.isEnabled());

			fashionlink.click();

			String expectedTitle = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";
			String actualTitle = driver.getTitle();

			if (expectedTitle.equals(actualTitle)) {
				System.out.println("Test is Passed");
			} else {
				System.out.println("Test is failed");
			}
			System.out.println("Actual Title : " + actualTitle);
			System.out.println("Expected Title : " + expectedTitle);
		}
	}


