package sit707;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        // Set path to ChromeDriver executable
        System.setProperty("webdriver.chrome.driver", "E:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

        // Create a new instance of the ChromeDriver
        WebDriver driver = new ChromeDriver();

        // Print the driver instance to confirm it started
        System.out.println(driver);

        // Open Google's homepage
        driver.get("https://www.google.com");
        System.out.println("Page title: " + driver.getTitle());

        try {
            // Let the browser stay open for 5 seconds
            Thread.sleep(5 * 1000);
        } catch (InterruptedException e) {
            // Print stack trace if an exception occurs
            e.printStackTrace();
        }

        // Close the browser
        driver.close();
    }
}