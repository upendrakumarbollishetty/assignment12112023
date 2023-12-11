package assignment1112.upendra;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JdbcSelenium {
    private WebDriver driver;

    @BeforeTest
    public void setup() {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Create a new instance of the ChromeDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testVerifyDB() throws ClassNotFoundException, SQLException {
        // Step 1: Load the driver class
        Class.forName("oracle.jdbc.driver.OracleDriver");

        // Step 2: Create the connection object
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "your_username", "your_password");

        // Step 3: Create the statement object
        Statement stmt = con.createStatement();

        // Step 4: Execute the SQL query
        ResultSet rs = stmt.executeQuery("SELECT * FROM Products");

        // Step 5: Iterate through the result set and perform web testing
        while (rs.next()) {
            int productId = rs.getInt(1);
            String productName = rs.getString(2);
            String productDescription = rs.getString(3);

            // Perform web testing using Selenium
            driver.get("https://www.seleniumhq.org");
            WebElement searchInput = driver.findElement(By.id("q"));
            searchInput.sendKeys(productName);
            searchInput.submit();

            // Print the database record and web page title
            System.out.println("Product ID: " + productId);
            System.out.println("Product Name: " + productName);
            System.out.println("Product Description: " + productDescription);
            System.out.println("Web Page Title: " + driver.getTitle());
            System.out.println("--------------------------------------------");
        }

        // Step 6: Close the connection object
        con.close();
    }

    @AfterTest
    public void teardown() {
        // Close the browser
        driver.quit();
    }
}




