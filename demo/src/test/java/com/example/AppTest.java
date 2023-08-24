import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindLinks {
  WebDriver driver;

  @BeforeTest
  public void setup() {
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    driver = new ChromeDriver();
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
  public void teardown() {
    driver.quit();
  }
}