package org.testng;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdactinPom extends BaseClass {
	
	public AdactinPom() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement userName;
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement loginButton;
	
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getUserName() {
		return userName;
	}
	
	public WebElement getPassword() {
		return password;
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	public WebElement getLocation() {
		return location;
	}
	@FindBy(id="hotels")
	private WebElement hotel;
	
	public WebElement getHotel() {
		return hotel;
	}
	@FindBy(id="room_type")
	private WebElement roomType;
	
	public WebElement getRoomType() {
		return roomType;
	}
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	
	public WebElement getNoOfRooms() {
		return noOfRooms;
	}
	@FindBy(id="adult_room")
	private WebElement noOfAdult;
	
	public WebElement getNoOfAdult() {
		return noOfAdult;
	}
	@FindBy(id="child_room")
	private WebElement noOfChild;
	
	public WebElement getNoOfChild() {
		return noOfChild;
	}
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	@FindBy(className="login_title")
	private WebElement selectHotelTitle;
	
	public WebElement getSelectHotelTitle() {
		return selectHotelTitle;
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectHotel;
	
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	
	@FindBy(id="continue")
	private WebElement continueButton;
	
	public WebElement getContinueButton() {
		return continueButton;
	}
	
	@FindBy(className="login_title")
	private WebElement bookHotelTitle;
	
	public WebElement getBookHotelTitle() {
		return bookHotelTitle;
	}
	
	@FindBy(id="first_name")
	private WebElement firstName;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(id="last_name")
	private WebElement lastName;
	
	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id="address")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	
	@FindBy(id="cc_type")
	private WebElement ccType;
	
	public WebElement getCcType() {
		return ccType;
	}
	
	@FindBy(id="cc_exp_month")
	private WebElement expMonth;
	
	public WebElement expMonth() {
		return expMonth;
	}
	
	@FindBy(id="cc_exp_year")
	private WebElement expYear;
	
	public WebElement getExpYear() {
		return expYear;
	}
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNo;
	
	public WebElement getCvvNo() {
		return cvvNo;
	}
	
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getBookNow() {
		return bookNow;
	}
}
