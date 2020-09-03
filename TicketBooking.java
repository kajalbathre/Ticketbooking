package ticketbookingtestcase;

import java.io.IOException;

import org.testng.annotations.Test;

import amazon.pageobjects.Ticketbookinghomepageobjects;
import app.globalpackage.Genericclass;

public class TicketBooking extends Genericclass {
	@Test

	public void test() throws IOException, InterruptedException {
		
		initialize("http://blazedemo.com/", "chrome");
		Ticketbookinghomepageobjects homepage = new Ticketbookinghomepageobjects(driver);
		selectByValue(homepage.departureCity, "Philadelphia");
		selectByValue(homepage.destinationCity, "Rome");
		homepage.findFlights.click();
		homepage.chooseFlight.click();
		homepage.name.sendKeys("test");
		homepage.purchaseFlight.click();
		String Ticketid = homepage.ticketId.getText();
		System.out.println(Ticketid);
	}}	