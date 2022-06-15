package activities;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the browser
        driver.get("https://www.training-support.net");

        // Find About Us link using id
        driver.findElement(By.id("about-link")).click();
        driver.navigate().back();

        // Find About Us link using class
        driver.findElement(By.className("green")).click();

        // Find About Us link with CSS Selector
        driver.findElement(By.cssSelector("a#about-link"));

        // Find About Us link with Xpath
        driver.findElement(By.xpath("//a[@href='about']"));

        // Close the browser
        driver.close();
    }

}
