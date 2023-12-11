package assignment1112.upendra;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlealerts {

    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "drivers/windows/chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to a sample webpage with an alert
        driver.get("https://www.amazon.in/");

        // Locate the element that triggers the alert (for demonstration purposes)
        WebElement alertButton = driver.findElement(By.cssSelector("button[data-target='alert']"));
        alertButton.click();

        // Switch to the alert
        Alert alert = driver.switchTo().alert();

        // Get the text of the alert
        String alertText = alert.getText();
        System.out.println("Alert Text: " + alertText);

        // Perform actions on the alert (e.g., accept/dismiss)
        // alert.accept(); // Uncomment this line to accept the alert
        alert.dismiss(); // Comment out this line if you are accepting the alert

        // Close the browser
        driver.quit();
    }
}




