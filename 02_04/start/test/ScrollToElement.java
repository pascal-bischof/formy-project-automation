import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\Switchdrive\\3FHNW\\Stage_3\\Vorbereitung\\Lynda_Selenium_Essentials\\chromedriver_win32\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/scroll");

        WebElement name = driver.findElement(By.id("name"));

        Actions action = new Actions(driver);
        action.moveToElement(name);
        name.sendKeys("Peter Müller");

        WebElement date = driver.findElement(By.id("date"));
        date.sendKeys("01/02/1999");

        driver.quit();
    }
}
