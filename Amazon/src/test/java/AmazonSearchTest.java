
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchTest {
    public static void main(String[] args) {
        // Set the path to the ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // a. Navigate to amazon.in
        driver.get("https://www.amazon.in");

        // b. Enter a product
        // Assume there is an element with id 'search-box' for entering the product
        driver.findElement(By.id("search-box")).sendKeys("YourProduct");

        // c. Click on search button
        // Assume there is an element with id 'search-button' for the search button
        driver.findElement(By.id("search-button")).click();

        // d. Verify the title of the result page
        String pageTitle = driver.getTitle();
        if (pageTitle.contains("YourProduct")) {
            System.out.println("Search successful!");
        } else {
            System.out.println("Search failed!");
        }

        // Close the browser
        driver.quit();
    }
}
