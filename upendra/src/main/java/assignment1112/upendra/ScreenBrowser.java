package assignment1112.upendra;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;

public class ScreenBrowser {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/windows/chromedriver.exe");

        // Example: Capturing Screenshots
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to a website
            driver.get("https://www.redbus.com/");

            ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            // You can specify the path where you want to save the screenshot file
            // For example: FileUtils.copyFile(screenshotFile, new File("path/to/save/screenshot.png"));
            System.out.println("Screenshot captured.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }

        // Example: Changing Browser Profiles
        // Creating a ChromeOptions object to set browser preferences
        ChromeOptions chromeOptions = new ChromeOptions();

        // Disable images
        chromeOptions.addArguments("--disable-images");

        // Create a new WebDriver instance with the specified options
        WebDriver driverWithCustomProfile = new ChromeDriver(chromeOptions);

        try {
            // Navigate to a website
            driverWithCustomProfile.get("https://www.redbus.com");

            // Perform actions on the website using the WebDriver instance with the custom profile

        } finally {
            // Close the browser
            driverWithCustomProfile.quit();
        }
    }
}




