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

WebUI.navigateToUrl('https://www.shafiq.id/')

WebUI.click(findTestObject('Object Repository/Berita/Page_Sharia Securities Crowdfunding  SHAFIQ/span_Masuk_hamburger-box'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Sharia Securities Crowdfunding  SHAFIQ/a_Berita'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Sharia Securities Crowdfunding  SHAFIQ/div_Berita Terkini'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Sharia Securities Crowdfunding  SHAFIQ/a_BeritaRaih Merdeka secara Finansial denga_05a245'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Raih Merdeka secara Finansial dengan M_5f9030/div_BeritaRaih Merdeka secara Finansial den_0d92aa'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Raih Merdeka secara Finansial dengan M_5f9030/img_Jumat,18-08-23_w-full max-w-full h-auto'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Raih Merdeka secara Finansial dengan M_5f9030/span_Langkah menuju merdeka finansial  2 min read'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Raih Merdeka secara Finansial dengan M_5f9030/div_BeritaRaih Merdeka secara Finansial den_6aa674'))

WebUI.click(findTestObject('Object Repository/Berita/Page_Raih Merdeka secara Finansial dengan M_5f9030/div_AlamatJalan Metro Pondok Indah Nomor 29_ea98ea'))

WebUI.closeBrowser()

