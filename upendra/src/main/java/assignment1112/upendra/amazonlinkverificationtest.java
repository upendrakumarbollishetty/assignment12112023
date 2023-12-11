package assignment1112.upendra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * 
Amazon webpage
@upendra

*/
//public class AmazonHomePage {
public class amazonlinkverificationtest {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
//		step1: formulate the test domain url and drive path
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/windows/chromedriver.exe";
		
//		step2 :  System properties for selenium driver
		System.setProperty("webDriver.chrome.driver",driverPath);
		
		
//		step3 : Initiate selenium web driver
		WebDriver driver=new ChromeDriver();
		
//		step4 : Launch Browser
		driver.get(siteUrl);
		
//		testSearch1();
//		testSearch2();
//		Thread.sleep(2000);
//		driver.close();
		
		linktest1();
		
		Thread.sleep(1000);
		linktest2();
		
		Thread.sleep(1000);
		
		driver.close();

	}

//	private By driver;
		
		/*  verify for the link
		 */
	private static void linktest1() throws InterruptedException {
//By driver;
		//		By driver;
		WebElement link =driver.findElement(By.xpath("/html/body"));
//		searchBox.sendKeys(" Skechers Men's Relaxed Fit: Braver - Rayland, Black");
		link.click();
		
		
		Thread.sleep(2000);
		
		String expectedTitle ="Amazon.com Gift Cards";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle)) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
		
		System.out.println("Actual Title :"+actualTitle);
		System.out.println("Expeccted Title :"+expectedTitle);
		
	}
		
//		verify the giftcards selection	
		private static void linktest2() throws InterruptedException {
			//By driver;
					//		By driver;
					WebElement link =driver.findElement(By.cssSelector("body"));
//					searchBox.clear();
//					searchBox.sendKeys(" Certified Refurbished Echo (4th Gen) Twilight Blue | Smart home hub with eero Mesh Wifi Router | Turns Echo Dot into a wifi extender");
//					searchBox.submit();
					link.click();
					
					
					Thread.sleep(2000);
					
					String expectedTitle ="Amazon.com : Certified Refurbished Echo (4th Gen) Twilight Blue | Smart home hub with eero Mesh Wifi Router | Turns Echo Dot into a wifi extender";
					String actualTitle = driver.getTitle();
					
					if(expectedTitle.equals(actualTitle)) {
						System.out.println("test is passed");
					}
					else {
						System.out.println("test is failed");
					}
					
					System.out.println("Actual Title :"+ actualTitle);
					System.out.println("Expeccted Title :"+ expectedTitle);
	}

}



