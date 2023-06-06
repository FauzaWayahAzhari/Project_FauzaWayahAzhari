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



class AddToCartSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User in the home page")
	def inTheHomePage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://alta-shop.vercel.app/')
	}

	@When("User select product")
	def selectProduct() {
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_frontend-web/div_Rustic Granite Shoes  Totam quibusdam v_5fbddf'))
	}

	@And("User click Beli button")
	def clickBeliButton() {
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_frontend-web/button_Beli'))
	}

	@Then("Product on cart")
	def ProductCart() {
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_frontend-web/i_AltaShop_v-icon notranslate fas fa-shoppi_c66ce9'))
		WebUI.click(findTestObject('Object Repository/AddToCart/Page_frontend-web/div_Rustic Granite ShoesRp 46-1Total Qty1To_98a1f5'))
		WebUI.closeBrowser()
	}
}