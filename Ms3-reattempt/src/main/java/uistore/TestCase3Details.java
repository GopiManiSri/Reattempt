package uistore;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCase3Details {
	
	public WebDriver driver;
	
	
	By experiance=By.xpath("//*[@id=\'footer\']/div[2]/div[1]/ul/li[4]/a");
	By findOutMore=By.xpath("//*[@id=\'novotelMeeting\']/div/a");
	
	public TestCase3Details(WebDriver driver) {

 this.driver=driver;
 
}
	
	public WebElement getExperiance() {
		// TODO Auto-generated method stub
		return driver.findElement(experiance);

		}
	public WebElement getFindOutMore() {
		// TODO Auto-generated method stub
		return driver.findElement(findOutMore);

		}
	
	

}