package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase2Details {

	public WebDriver driver;

	By find = By.xpath("//*[@id=\"pushThematiqueContainer\"]/div/div[3]/div/div[3]/a/span");
	By text = By.xpath("//*[@id='main']/section[1]/div[1]/div[1]/p");
	public TestCase2Details(WebDriver driver) {

		this.driver = driver;

	}

	public WebElement getFind() {
		return driver.findElement(find);

	}
	public WebElement gettext() {
		return driver.findElement(text);

	}

}