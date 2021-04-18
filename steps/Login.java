package steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {
	
	public ChromeDriver driver;
	
	
	@Given("Open the chrome browser")
	public void browser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	
	@Given("Load URL")
	public void url()
	{
		driver.get("http://leaftaps.com/opentaps");
	}
	
	@Given("enter the username as {string}")
	public void name(String username )
	{
		driver.findElement(By.id("username")).sendKeys(username);
	}
	@Given("enter the password as {string}")
	public void password(String password)
	{
		driver.findElement(By.id("password")).sendKeys(password);
	}
	
	@When("click on login button button")
	public void login()
	{
		driver.findElement(By.className("decorativeSubmit")).click();
	}
	@Then("homepage should be displayed")
	public void verifypage()
	{
		System.out.println("page is verifies as " + driver.getTitle());
	}
	@But("Error should be displayed")
	
	public void error()
	{
		System.out.println("Error meassage is displayed");
	}
	
	@When("Click the Crmsfa link")
	public void crmsfalink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

	}
	@When("Click leads button")
	public void leadsbutton() {
		
		driver.findElement(By.linkText("Leads")).click();
	}
	@When("Click Createlead")
	public void createLead() {
		
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@When("enter the company name as {string}")
	public void cName(String companyname) {
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
	}
	@When("Enter the first name as {string}")
	public void fName(String firstname) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);

	}
	@When("Enter the last name as {string}")
	public void lName(String lastname) {
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
	}
	@When("Click Create lead")
	public void createLeadButton() {
		
		driver.findElement(By.name("submitButton")).click();
	}
	@Then("Create lead is created")
	public void createleadmessage() {
		
		System.out.println("The lead is created");

	}
	@When("Click Findleads")
	public void findLeads() {
		driver.findElement(By.linkText("Find Leads")).click();

	}
	@When("Click on phone")
	public void phone() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

	}
	@When("enter the pnum as {string}")
	public void pnum(String pnum) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pnum);

	}
	@When("Click findleads")
	public void findLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);

	}
	@When("select firstlead")
	public void firstLead() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("Click edit")
	public void edit() {
		driver.findElement(By.linkText("Edit")).click();

	}
	@When("enter cname{string}")
	public void cnames(String cname) {
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);

	}
	@When("Click update")
	public void updateButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Edit lead is performed")
	public void editLeadAction() {
	System.out.println("Edit lead is performed");

	}
	
	@When("Click duplicatelead")
	public void duplicatelead() {
		driver.findElement(By.linkText("Duplicate Lead")).click();

	}
	@When("Click on submit")
	public void duplicateSubmitButton() {
		driver.findElement(By.name("submitButton")).click();

	}
	@Then("Duplicate Lead is performed")
	public void duplicateLeadAction() {
	System.out.println("Duplicate lead is performed");

	}
	@When("Click delete")
	public void deleteButton() {
		driver.findElement(By.linkText("Delete")).click();

	}
	@Then("Delete Lead is performed")
	public void deleteLeadAction() {
	System.out.println("Delete lead is performed");

	}
	@When("Click Merge Leads")
	public void mergeleads() {
		driver.findElement(By.linkText("Merge Leads")).click();

	}
	@When("Click 1st lookup")
	public void lookup1() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();

	}
	@When("find window handle and go to first window")
	public void windowhandle() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));

	}
	@When("enter first name as Naveen")
	public void fname1() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Naveen");

	}
	@When("select 1st leadid")
	public void leadid() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();

	}
	@When("go to first window")
	public void firstwindow() {
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));

	}
	@When("Click 2nd lookup")
	public void lookup2() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

	}
	@When("enter first name as Jacob")
	public void fname2() {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("sri");

	}
	@When("Click Mergelead")
	public void mergeleadButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();

	}
	@Then("merge lead is done")
	public void mergeLeadAction() {
		System.out.println("Merge lead is completed");

	}
	
	}
	


