package wwsession;

import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class wwAutomation {
	
	@Test(priority=1)
	public void launchWebsite() throws Throwable {
		
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\SAMVEEN\\eclipse-workspace\\wwsession\\Drivers\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.weightwatchers.com/us/");
	driver.manage().window().maximize();
	String title = driver.getTitle();
	System.out.println(title);
	String expectedTitle = "WW (Weight Watchers): Weight Loss & Wellness Help | WW USA";
	if(expectedTitle.equals(title)) {
   	 System.out.println("THE Title IS verified");
   	 }
    else {
   	 System.out.println("THE Title IS NOT VERIFIED");
   	 }
	
	
    driver.findElement(By.xpath("//body/div[@id='root']/div/div/div/div/div/div/div/ul/li[1]/a[1]/span[1]/span[2]")).click();
    Thread.sleep(3000);
    String titleb = driver.getTitle();
    System.out.println("  ");
	System.out.println(titleb);
	String expectedTitle2 = "Find WW Studios & Meetings Near You | WW USA";
	if(expectedTitle2.equals(titleb)) {
	   	 System.out.println("THE Title IS verified");
	   	 }
	    else {
	   	 System.out.println("THE Title IS NOT VERIFIED");
	   	 }
	System.out.println(" ");
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	//searching the postal code
	driver.findElement(By.id("location-search")).sendKeys("10011");
	driver.findElement(By.id("location-search-cta")).click();
	
	String firstTitle = driver.findElement(By.className("linkUnderline-1_h4g")).getText();
	System.out.println(firstTitle);
	
	String distance = driver.findElement(By.className("distance-OhP63")).getText();
	System.out.println(distance);
	driver.findElement(By.className("linkUnderline-1_h4g")).click();
	
	String secondTitle = driver.findElement(By.className("locationName-1jro_")).getText();
	System.out.println(secondTitle);

	//Get the current day of the week from local system
	Calendar searchCalendar = Calendar.getInstance();
	String dayName = searchCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
	
	//Get the first three characters of the string and turn it to uppercase
	
	String currentDay = dayName.substring(0,3).toUpperCase();
	
	//Get all the hours of operation
	List<WebElement> hoursOfOperation = driver.findElements(By.xpath("//span[contains(text(),'"+currentDay+"')]/following-sibling::div/span[@class='meetingTime-1g52A']"));
	//Print out all hours of operation
	for(int i=0;i<hoursOfOperation.size();i++) {
		System.out.println(hoursOfOperation.get(i).getText());
	}
	
	}
}
