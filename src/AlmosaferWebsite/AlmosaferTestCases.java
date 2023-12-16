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

	@Test()
	public void FlightBookingTest() {
// 1- go to this website and let the language of the website to be randomly change arabic or english
		driver.get(WebsiteUrl);

		WebElement PopupButton = driver.findElement(By.className(PopupClassName));
		PopupButton.click();
//	2- go to flight tab	
		WebElement FlightTab = driver.findElement(By.id(FlightTabId));
		FlightTab.click();

		String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");

		if (ActualLanguage.contains("ar")) {
//	3- fill any random city in the from input and any random city in the to city
			WebElement FromInput = driver.findElement(By.className(FromInputClassName));
			FromInput.sendKeys(ARFromCity);
			WebElement RandomClick = driver.findElement(By.cssSelector(RandomClickCssSelector));
			RandomClick.click();
			WebElement ToInput = driver.findElement(By.cssSelector(ARToInputCssSelector));
			ToInput.sendKeys(ARToCity);
			RandomClick.click();
//	4- change the depature date to be at the begining of february and the return date to be any date at the end of february
			WebElement FromDate = driver.findElement(By.cssSelector(ARFromDateCssSelector));
			FromDate.click();
			WebElement NextMonthButton = driver.findElement(By.cssSelector(ARNextMonthButtonCssSelector));
			NextMonthButton.click();
			WebElement FromDay = driver.findElement(By.cssSelector(FromDayCssSelector));
			FromDay.click();
			RandomClick.click();
			WebElement ToDate = driver.findElement(By.cssSelector(ARToDateCssSelector));
			ToDate.click();
			WebElement ToDay = driver.findElement(By.cssSelector(ToDayCssSelector));
			ToDay.click();
//	5- change the class to be business man class then hit search button
			WebElement FlightClass = driver.findElement(By.cssSelector(ClassCssSelector));
			FlightClass.click();
			WebElement BusinessClass = driver.findElement(By.cssSelector(ClassBusinessCssSelector));
			BusinessClass.click();
			WebElement SearchButton = driver.findElement(By.cssSelector(SearchButtonCssSelector));
			SearchButton.click();

		} else {
//	3- fill any random city in the from input and any random city in the to city
			WebElement FromInput = driver.findElement(By.className(FromInputClassName));
			FromInput.sendKeys(ENFromCity);
			WebElement RandomClick = driver.findElement(By.cssSelector(RandomClickCssSelector));
			RandomClick.click();
			WebElement ToInput = driver.findElement(By.cssSelector(ENToInputCssSelector));
			ToInput.sendKeys(ENToCity);
			RandomClick.click();
//	4- change the depature date to be at the begining of february and the return date to be any date at the end of february
			WebElement FromDate = driver.findElement(By.cssSelector(ENFromDateCssSelector));
			FromDate.click();
			WebElement NextMonthButton = driver.findElement(By.cssSelector(ENNextMonthButtonCssSelector));
			NextMonthButton.click();
			WebElement FromDay = driver.findElement(By.cssSelector(FromDayCssSelector));
			FromDay.click();
			RandomClick.click();
			WebElement ToDate = driver.findElement(By.cssSelector(ENToDateCssSelector));
			ToDate.click();
			WebElement ToDay = driver.findElement(By.cssSelector(ToDayCssSelector));
			ToDay.click();
//	5- change the class to be business man class then hit search button
			WebElement FlightClass = driver.findElement(By.cssSelector(ClassCssSelector));
			FlightClass.click();
			WebElement BusinessClass = driver.findElement(By.cssSelector(ClassBusinessCssSelector));
			BusinessClass.click();
			WebElement SearchButton = driver.findElement(By.cssSelector(SearchButtonCssSelector));
			SearchButton.click();
		}
	}

	@AfterTest
	public void PostTesting() {

	}

}
