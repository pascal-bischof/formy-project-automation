import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class KeyboardAndMouseInput {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Switchdrive\\3FHNW\\Stage_3\\Vorbereitung\\Lynda_Selenium_Essentials\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/keypress");

        WebElement name = ((ChromeDriver) driver).findElementById("name");
        name.click();
        name.sendKeys("Peter Muster");

        WebElement button = driver.findElement(By.id("button"));
        button.click();

        driver.quit();
    }
}
