package assignment1112.upendra;


	

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	import org.openqa.selenium.chrome.ChromeDriver;

	/*it is test script for searching on google search engine
	 * 
	 * @upendra
	 * 
	 * 
	 */
	public class WebElementsHandled {
		
		public static void main(String[] args) throws InterruptedException {
			
//			step1: formulate the test domain url and drive path
			String siteUrl = "https://www.google.com/";
			String driverPath = "drivers/windows/chromedriver.exe";

			
//			step2 :  System properties for selenium driver
			
			
			System.setProperty("webDriver.chrome.driver",driverPath);
			
			
//			step3 : Initiate selenium web driver
			
			WebDriver driver = new ChromeDriver();
			
//			step4 : Launch Browser
			
			driver.get(siteUrl);

//			step 5: Evaluate Test
//			locate search box
			WebElement searchBox = driver.findElement(By.name("q"));
			searchBox.sendKeys("selenium documentation");
			searchBox.submit();
//			add delay
			Thread.sleep(2000);
			String expected_title = "selenium documentation - Google Search";
			String actual_title = driver.getTitle();
			
			if(expected_title.equals(actual_title)) {
				System.out.println("test is passed");
			}
			else {
				System.out.println("test is failed");
			}
			System.out.println("Expected Title : "+expected_title);
			System.out.println("Actual Title : "+actual_title);
//			step6 : Execute 
			driver.close();
		}
	}


