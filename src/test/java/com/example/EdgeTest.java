import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class EdgeTest {
    @Test
    public void openGoogleInEdge() {
        // Set path to EdgeDriver executable
        System.setProperty("webdriver.edge.driver", "D:\\GITWD\\demo\\drivers\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com");
        System.out.println("Page Title: " + driver.getTitle());
        driver.quit();
    }
}
