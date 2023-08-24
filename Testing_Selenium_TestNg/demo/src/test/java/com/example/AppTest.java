package com.example;
// import org.junit.jupiter.api.Test;
// import org.openqa.selenium.By;
// import org.openqa.selenium.WebDriver;
// import org.openqa.selenium.WebElement;
// import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AppTest {

    
    public void testCountAndPrintLinks() {
        // Set the path to your chromedriver executable
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to the Flipkart homepage
        driver.get("https://www.flipkart.com");

        // Find all links on the page
        List<WebElement> links = driver.findElements(By.tagName("a"));

        // Print link count
        System.out.println("Number of links on the page: " + links.size());

        // Print link text and URLs
        for (WebElement link : links) {
            String linkText = link.getText();
            String linkUrl = link.getAttribute("href");
            System.out.println("Link Text: " + linkText + " - URL: " + linkUrl);
        }

        // Close the browser
        driver.quit();
    }
}
