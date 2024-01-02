package AlmosaferWebsite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlmosaferTestCases extends Parameters {

	@BeforeTest
	public void Setup() {
		driver.manage().window().maximize();

	}

	@Test(priority = 1)
	public void GoToWebsite() throws InterruptedException {
		
		driver.get(WebsiteUrl);
		WebElement PopupButton = driver.findElement(By.className(PopupClassName));
		PopupButton.click();
		Thread.sleep(2000);
		
		String ActualURL = driver.findElement(By.tagName("link")).getAttribute("href");
		String ExpectedURL = WebsiteUrl;
		myAssert.assertEquals(ActualURL, ExpectedURL, "URLs do not match");
		myAssert.assertAll();

	}

	@Test(priority = 2)
	public void GoToFlightTab() {
		
		WebElement FlightTab = driver.findElement(By.id(FlightTabId));
		FlightTab.click();
		
		String ActualActiveTab = FlightTab.getAttribute("class");
		String ExpectedActiveTab = "active";
		myAssert.assertTrue(ActualActiveTab.contains(ExpectedActiveTab), "FlightTab is not the active tab");
		myAssert.assertAll();
	}

	@Test(priority = 3)
	public void FillCities() throws InterruptedException {
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		WebElement RandomClick = driver.findElement(By.cssSelector(RandomClickCssSelector));
		if (ActualLanguage.contains("ar")) {
			WebElement FromInput = driver.findElement(By.className(FromInputClassName));
			FromInput.sendKeys(ARFromCity);
			Thread.sleep(1000);
			RandomClick.click();
			WebElement ToInput = driver.findElement(By.cssSelector(ARToInputCssSelector));
			ToInput.sendKeys(ARToCity);
			Thread.sleep(1000);
			RandomClick.click();
			Thread.sleep(2000);
		} else {
			WebElement FromInput = driver.findElement(By.className(FromInputClassName));
			FromInput.sendKeys(ENFromCity);
			Thread.sleep(1000);
			RandomClick.click();
			WebElement ToInput = driver.findElement(By.cssSelector(ENToInputCssSelector));
			ToInput.sendKeys(ENToCity);
			Thread.sleep(1000);
			RandomClick.click();
			Thread.sleep(2000);
		}

	}

	@Test(priority = 4)
	public void ChooseDates() throws InterruptedException {

		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		WebElement RandomClick = driver.findElement(By.cssSelector(RandomClickCssSelector));
		if (ActualLanguage.contains("ar")) {
			WebElement FromDate = driver.findElement(By.cssSelector(ARFromDateCssSelector));
			FromDate.click();
			WebElement NextMonthButton = driver.findElement(By.cssSelector(ARNextMonthButtonCssSelector));
			NextMonthButton.click();
			Thread.sleep(1000);
			WebElement FromDay = driver.findElement(By.cssSelector(FromDayCssSelector));
			FromDay.click();
			RandomClick.click();
			Thread.sleep(1000);
			WebElement ToDate = driver.findElement(By.cssSelector(ARToDateCssSelector));
			ToDate.click();
			Thread.sleep(1000);
			WebElement ToDay = driver.findElement(By.cssSelector(ToDayCssSelector));
			ToDay.click();
			Thread.sleep(2000);
			
			String ActualFromDate =  driver.findElement(By.cssSelector(ARFromDateCssSelector)).getText();
			String ActualToDate =  driver.findElement(By.cssSelector(ARToDateCssSelector)).getText();
			String ExpectedFromDate = "5";
			String ExpectedToDate = "27";
			myAssert.assertTrue(ActualFromDate.contains(ExpectedFromDate), "FromDate do not match");
			myAssert.assertTrue(ActualToDate.contains(ExpectedToDate), "ToDate do not match");
			myAssert.assertAll();
//			System.out.println(ActualFromDate);
//			System.out.println(ActualToDate);

			
		} else {
			WebElement FromDate = driver.findElement(By.cssSelector(ENFromDateCssSelector));
			FromDate.click();
			WebElement NextMonthButton = driver.findElement(By.cssSelector(ENNextMonthButtonCssSelector));
			NextMonthButton.click();
			Thread.sleep(1000);
			WebElement FromDay = driver.findElement(By.cssSelector(FromDayCssSelector));
			FromDay.click();
			RandomClick.click();
			Thread.sleep(1000);
			WebElement ToDate = driver.findElement(By.cssSelector(ENToDateCssSelector));
			ToDate.click();
			Thread.sleep(1000);
			WebElement ToDay = driver.findElement(By.cssSelector(ToDayCssSelector));
			ToDay.click();
			Thread.sleep(2000);
			
			String ActualFromDate =  driver.findElement(By.cssSelector(ENFromDateCssSelector)).getText();
			String ActualToDate =  driver.findElement(By.cssSelector(ENToDateCssSelector)).getText();
			String ExpectedFromDate = "5";
			String ExpectedToDate = "27";
			myAssert.assertTrue(ActualFromDate.contains(ExpectedFromDate), "FromDate do not match");
			myAssert.assertTrue(ActualToDate.contains(ExpectedToDate), "ToDate do not match");
			myAssert.assertAll();
//			System.out.println(ActualFromDate);
//			System.out.println(ActualToDate);
			
		}
		
	}

	@Test(priority = 5)
	public void ChooseBusinessClass() throws InterruptedException {
		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");
		WebElement FlightClass = driver.findElement(By.cssSelector(ClassCssSelector));
		FlightClass.click();
		Thread.sleep(1000);
		WebElement BusinessClass = driver.findElement(By.cssSelector(ClassBusinessCssSelector));
		BusinessClass.click();
		Thread.sleep(2000);
		
		if (ActualLanguage.contains("ar")) {
		String ActualFlightClass = driver.findElement(By.cssSelector(ClassCssSelector)).getText();
		String ExpectedFlightClass = "رجال الأعمال";
		myAssert.assertTrue(ActualFlightClass.contains(ExpectedFlightClass), "Business Class not chosen correctly");
		myAssert.assertAll();
//		System.out.println(ActualFlightClass);
	
	
		}else {
			String ActualFlightClass = driver.findElement(By.cssSelector(ClassCssSelector)).getText();
			String ExpectedFlightClass = "Business";
			myAssert.assertTrue(ActualFlightClass.contains(ExpectedFlightClass), "Business Class not chosen correctly");
			myAssert.assertAll();
//			System.out.println(ActualFlightClass);
		
		}
	
		WebElement SearchButton = driver.findElement(By.cssSelector(SearchButtonCssSelector));
		SearchButton.click();
	}

	@AfterTest
	public void PostTesting() {

	}

}
