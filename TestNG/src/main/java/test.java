
import org.testng.annotations.Test;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppTest {

	// ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws Exception {
		
		driver = new RemoteWebDriver(new URL("http://localhost:4444"), driver);
        //driver = new ChromeDriver();
    driver.get("https://flipkart.com");
	}

  @Test
  public void findLinksOnPage() {
    List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("Number of links on the page: " + links.size());
    for (WebElement link : links) {
      System.out.println("Link text: " + link.getText());
      System.out.println("Link URL: " + link.getAttribute("href"));
      System.out.println();
    }
  }

		
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}