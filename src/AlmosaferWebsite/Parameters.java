package AlmosaferWebsite;

import java.util.Random;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Parameters {

	static WebDriver driver = new ChromeDriver();
	static Random rand = new Random();
    static SoftAssert myAssert = new SoftAssert();


	static String[] URLS = { "https://www.almosafer.com/ar", "https://www.almosafer.com/en" };
	static int RandomlndexForTheUrls = rand.nextInt(2);
	static String WebsiteUrl = URLS[RandomlndexForTheUrls];
	static String PopupClassName = "cta__image";
	static String FlightTabId = "uncontrolled-tab-example-tab-flights";
	
	


	static String[] ENFromCities = { "Cairo", "Tokyo", "Berlin", "Dubai", "Chicago" };
	static String[] ARFromCities = { "القاهرة", "طوكيو", "برلين", "دبي", "شيكاغو" };

	static String[] ENToCities = { "Istanbul", "Shanghai", "London", "Sydney", "jeddah" };
	static String[] ARToCities = { "اسطنبول", "شنغهاي", "لندن", "سيدني", "جدة" };

	static int RandomlndexForTheCities = rand.nextInt(5);
	static String ENFromCity = ENFromCities[RandomlndexForTheCities];
	static String ARFromCity = ARFromCities[RandomlndexForTheCities];
	static String ENToCity = ENToCities[RandomlndexForTheCities];
	static String ARToCity = ARToCities[RandomlndexForTheCities];

	static String FromInputClassName = "AutoComplete__Input";
	static String ARToInputCssSelector = "input[placeholder='محطة الوصول']";
	static String ENToInputCssSelector = "input[placeholder='Destination']";
	static String RandomClickCssSelector = "img[alt='hero-image']";
	
	static String ARFromDateCssSelector = ".sc-OxbzP.sc-lnrBVv.fIoFkY";
	static String ENFromDateCssSelector = ".sc-OxbzP.sc-lnrBVv.gKbptE";
	static String ARNextMonthButtonCssSelector = ".sc-eHgmQL.kgqFKY";
	static String ENNextMonthButtonCssSelector = ".sc-eHgmQL.gVsNJo";
	static String FromDayCssSelector = "div[aria-label='Mon Feb 05 2024']";
	static String ARToDateCssSelector = ".sc-OxbzP.sc-bYnzgO.iPcZol";
	static String ENToDateCssSelector = ".sc-OxbzP.sc-bYnzgO.bojUIa";
	static String ToDayCssSelector = "div[aria-label='Tue Feb 27 2024']";
	
	static String ActualFromDateCssSelector = ".sc-OxbzP.sc-lnrBVv.fIoFkY";
	static String ActualToDateCssSelector = ".sc-OxbzP.sc-bYnzgO.iPcZol";

	static String ClassCssSelector = ".sc-dPPMrM.fOQKsp";
	static String ClassBusinessCssSelector = "div[data-testid='FlightSearchCabinSelection__BusinessOption']";
	static String ActualFlightClassCssSelector = ".sc-dPPMrM.fOQKsp";

	static String SearchButtonCssSelector = "div[class='sc-hARARD jGOsnk d-none d-md-block'] button[type='button']";
	static String ActualResultPageCssSelector = ".sc-dPPMrM.fOQKsp";
}
