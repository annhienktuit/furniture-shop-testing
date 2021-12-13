import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://ie-104-flower-shop-fe-konsept-store.vercel.app/login')

WebUI.setText(findTestObject('Object Repository/Page_Konsept/input_Username_MuiOutlinedInput-input MuiIn_c5d559 (1)'), 'annhienkt')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Konsept/input_Password_MuiOutlinedInput-input MuiIn_ae054b (1)'), 
    '391WRAcRvROQWKPTiPGB5Q==')

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_Log In (1)'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/a_Products (1)'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/div_Add To Cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/span_Add to cart (1)'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/button_1'))

WebUI.click(findTestObject('Object Repository/Page_Konsept/div_Desk Decor - admin'))

WebUI.closeBrowser()

