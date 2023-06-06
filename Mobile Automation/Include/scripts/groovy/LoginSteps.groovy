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
	@Given("I am on login page")
	def onLoginPage() {
		Mobile.startApplication('C:\\Users\\Lenovo\\Downloads\\mobileappv3\\app-release.apk', true)
		Mobile.tap(findTestObject('Object Repository/Registrasi/android.widget.Button'), 10)
	}

	@When("I fill valid email")
	def fillValidEmail() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email (1)'), 'coba1@gmail.com', 10)
	}

	@When("I fill invalid email")
	def fillInvalidEmail() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email (1)'), 'baca@gmail.com', 10)
	}

	@When("I fill empty email")
	def fillEmptyEmail() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Email'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Email (1)'), '', 10)
	}

	@And("I fill valid password")
	def fillValidPassword() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), 'coba1', 10)
	}

	@And("I fill invalid password")
	def fillInvalidPassword() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), 'pass', 10)
	}

	@And("I fill empty password")
	def fillEmptyPassword() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.EditText - Password'), 10)
		Mobile.setText(findTestObject('Object Repository/Login/android.widget.EditText - Password (1)'), '', 10)
	}

	@And("I tap login button")
	def tapLoginButton() {
		Mobile.tap(findTestObject('Object Repository/Login/android.widget.Button (2)'), 10)
	}

	@Then("I am on homepage")
	def onHomePage() {
		Mobile.tap(findTestObject('Object Repository/Login/android.view.View'), 10)
		Mobile.closeApplication()
	}

	@Then("I see alert email atau password tidak valid")
	def seeAlert() {
		Mobile.tap(findTestObject('Object Repository/Login/android.view.View (1)'), 10)
		Mobile.closeApplication()
	}

	@Then("I see alert email can not empty")
	def seeAlertEmailCanNotEmpty() {
		Mobile.tap(findTestObject('Object Repository/Login/email can not empty'), 10)
		Mobile.closeApplication()
	}

	@Then("I see alert password can not empty")
	def seeAlertPasswordCanNotEmpty() {
		Mobile.tap(findTestObject('Object Repository/Login/password can not empty'), 10)
		Mobile.closeApplication()
	}
}