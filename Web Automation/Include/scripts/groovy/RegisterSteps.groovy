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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User on the register page")
	def onTheRegisterPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/auth/register')
	}

	@When("User fill valid fullname (.*) and email (.*) and password (.*)")
	def fillAllField(String fullname, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Nama Lengkap_input-18'), fullname)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Email_input-21'), email)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Password_input-24'), password)
	}
	@When("User empty fullname (.*) and email (.*) and password (.*)")
	def emptyFullname(String fullname, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Nama Lengkap_input-18'), fullname)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Email_input-21'), email)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Password_input-24'), password)
	}
	@When("User fill fullname (.*) and empty email (.*) and password (.*)")
	def emptyEmail(String fullname, String email, String password) {
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Nama Lengkap_input-18'), fullname)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Email_input-21'), email)
		WebUI.setText(findTestObject('Object Repository/Register/Page_frontend-web/input_Password_input-24'), password)
	}
	@And("User click register button")
	def clickRegisterButton() {
		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/span_Register'))
	}

	@Then("User success register")
	def successRegister() {
		WebUI.click(findTestObject('Object Repository/Register/Page_frontend-web/div_AltaShop0'))
		WebUI.closeBrowser()
	}
	@Then("User see alert fullname is required")
	def seeAlert() {
		println( "fullname is required")
		WebUI.getText(findTestObject('Object Repository/Register/Page_frontend-web/div_fullname is required'))
		WebUI.closeBrowser()
	}
	@Then("User will see alert email is required")
	def verifyAlert() {
		println( "email is required")
		WebUI.getText(findTestObject('Object Repository/Register/Page_frontend-web/Page_frontend-web/div_email is required'))
		WebUI.closeBrowser()
	}
}