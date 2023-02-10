package org.testng;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase extends BaseClass{
	
	AdactinPom locators;

	@BeforeClass
	private void login() {
		browser("chrome");
		locators = new AdactinPom();
		launchUrl("https://adactinhotelapp.com/index.php");
		locators.getUserName().sendKeys("sathishgreens123");
		locators.getPassword().sendKeys("Greens@123");
		locators.getLoginButton().click();
		
	}
	
	@Test(priority=1)
	private void searchHotel() {
		
		WebElement location = locators.getLocation();
		select(location, "text", "London");
		
		WebElement hotel = locators.getHotel();
		select(hotel, "text", "Hotel Sunshine");
		
		WebElement roomType = locators.getRoomType();
		select(roomType, "text", "Deluxe");
		
		WebElement noOfRooms = locators.getNoOfRooms();
		select(noOfRooms, "text", "1 - One");
		
		WebElement noOfAdult = locators.getNoOfAdult();
		select(noOfAdult, "text", "2 - Two");
		
		WebElement noOfChild = locators.getNoOfChild();
		select(noOfChild, "text", "1 - One");
		
		click(locators.getSearch());
		
	}
	
	@Test(priority=2)
	private void selectHotel() {
		
		WebElement selectHotelTitle = locators.getSelectHotelTitle();
		String title = text(selectHotelTitle);
		//System.out.println(title);
		Assert.assertEquals(title, "Select Hotel");	
		
		WebElement selectHotel = locators.getSelectHotel();
		selectHotel.click();
		
		locators.getContinueButton().click();
		
		
		
	}
	
	@Test(priority=3)
	private void bookHotel() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement bookHotelTitle = locators.getBookHotelTitle();
		String text = text(bookHotelTitle);
		//System.out.println(text);
		Assert.assertEquals(text, "Book A Hotel");
		
		locators.getFirstName().sendKeys("Sathish");
		locators.getLastName().sendKeys("Greens");
		locators.getAddress().sendKeys("Chennai");
		locators.getCreditCardNo().sendKeys("1234567890123456");
		WebElement ccType = locators.getCcType();
		select(ccType, "text", "VISA");
		WebElement expMonth = locators.expMonth();
		select(expMonth, "text", "March");
		WebElement expYear = locators.getExpYear();
		select(expYear, "text", "2022");
		locators.getCvvNo().sendKeys("666");
		locators.getBookNow().click();
		
	}
	
	
	
}
