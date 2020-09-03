package amazon.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import app.globalpackage.Genericclass;

public class Ticketbookinghomepageobjects extends Genericclass {
	// define Page objects

	public Ticketbookinghomepageobjects(WebDriver driver) {
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//*[@name='fromPort']")
	public WebElement departureCity;

	@FindBy(xpath = "//*[@name='toPort']")
	public WebElement destinationCity;

	@FindBy(xpath = "//tr[1]//td[1]//input[@value='Choose This Flight']")
	public WebElement chooseFlight;

	@FindBy(xpath = "///html/body/div[2]/h3")
	public WebElement Flightdetail;
	
	@FindBy(xpath = "//*[@value='Find Flights']")
	public WebElement findFlights;
   
	@FindBy(xpath = "//*[@id='inputName']")
	public WebElement name;
	
	@FindBy(xpath = "//*[@value='Purchase Flight']")
	public WebElement purchaseFlight;
	
	@FindBy(xpath = "/html/body/div[2]/div/table/tbody/tr[1]/td[2]")
	public WebElement ticketId;
	
}
