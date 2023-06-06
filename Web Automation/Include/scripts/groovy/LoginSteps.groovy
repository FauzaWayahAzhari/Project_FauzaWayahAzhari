import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class LoginSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on the login page")
	def onTheLoginPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/login')
	}

	@When("User fill email (.*) and password (.*)")
	def fillNamePassword(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-21'), password)
	}

	@When("User fill empty email (.*) and password (.*)")
	def emptyEmail(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-21'), password)
	}

	@When("User fill invalid email (.*) and password (.*)")
	def invalidEmail(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-21'), password)
	}

	@When("User fill email (.*) and invalid password (.*)")
	def invalidPassword(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-21'), password)
	}
	@When("User fill invalid email (.*) and invalid password (.*)")
	def invalidEmailPassword(String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Email_input-18'), email)
		WebUI.setText(findTestObject('Object Repository/Login/Page_frontend-web/input_Password_input-21'), password)
	}

	@And("User click login button")
	def clickLoginButton() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/button_Login'))
	}

	@Then("User success login")
	def successLogin() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Login/Page_frontend-web/div_AltaShop0'),30)
		WebUI.closeBrowser()
	}
	@Then("User see warning alert email is required")
	def warningEmail() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_email is required'))
		WebUI.closeBrowser()
	}
	@Then("User see warning alert record not found")
	def warningRecord() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_record not found'))
		WebUI.closeBrowser()
	}
	@Then("User see warning alert email or password is invalid")
	def warningEmailOrPassword() {
		WebUI.click(findTestObject('Object Repository/Login/Page_frontend-web/div_email or password is invalid'))
		WebUI.closeBrowser()
	}
}