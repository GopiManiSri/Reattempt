package pageobject;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import reusablecomponents.ReadPropertyFile;
import uistore.TestCase1Details;
import uistore.TestCase3Details;

public class TestCase3 extends ReadPropertyFile {

	public static Logger log = Logger.getLogger(ReadPropertyFile.class.getName());

	@BeforeTest
	public void initialise() throws IOException {

		driver = DriverInitialisation();
	}

	@Test
	public void testcase3() throws InterruptedException, IOException {

		driver.get(p.getProperty("url"));
		Thread.sleep(3000);
		log.info("navigation to url");

		TestCase1Details t1 = new TestCase1Details(driver);
		Thread.sleep(5000);
		t1.getpopup().click();

		TestCase3Details tc = new TestCase3Details(driver);

		tc.getExperiance().sendKeys(Keys.chord(Keys.CONTROL, Keys.ENTER));
		Set<String> ab = driver.getWindowHandles();
		Iterator<String> it = ab.iterator();
		String parentId = it.next();
		String childid = it.next();
		driver.switchTo().window(childid);
		Thread.sleep(2000);
		tc.getFindOutMore().click();
		String title = driver.getTitle();
		if (title.contains("Meetings and Events")) {
			System.out.println("Present");
			log.info("Desired item found in  page");
		}
		driver.close();
		driver.switchTo().window(parentId);
	}
	@AfterTest
	public void close() {

		driver.close();
		driver = null;

	}

}