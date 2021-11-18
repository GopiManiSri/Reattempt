package uistore;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase1Details {

	public WebDriver driver;
	By destination = By.xpath("//*[@id='search-destination']");
	By popup=By.xpath("//*[@id='onetrust-close-btn-container']/button");
	By searchbutton = By.xpath("//*[@id='engine-submit']/button");
	By hotel = By.xpath("//*[@id='intersect-6']/div/div[1]/div[1]/header/h2/a");
	
	public TestCase1Details(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getDestination() {
		return driver.findElement(destination);
	}
	public WebElement getpopup() {
		return driver.findElement(popup);
	}
	public WebElement getSearch() {
		return driver.findElement(searchbutton);
	}
	public WebElement getHotel() {
		return driver.findElement(hotel);
	}

	
}
