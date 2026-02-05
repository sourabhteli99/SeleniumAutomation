package ModularFramework_POM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_BuyProduct_003_Test extends BaseTest 
{

	@Test
	public void buyProductMeThod() throws EncryptedDocumentException, IOException
	{
		Welcomepage wp = new Welcomepage(driver);
		wp.getElectronicslink().click();
		
		ElectrinicsPage ep = new ElectrinicsPage(driver);
		ep.getCellphonelink().click();
		
		CellPhonePage clph = new CellPhonePage(driver);
		clph.getCellphoneAddtoCartButton().click();
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(clph.getProductaddedtocart().isDisplayed(), true, "Rpoduct added to cart");
		
		wp.getShoppingcartlink().click();
		
		ShoppingCartPage shp = new ShoppingCartPage(driver);
		shp.getSmartphonecartItem().click();
		shp.getTermsofservicesButton().click();
		shp.getCheckoutButton().click();
		
		String city = Flib.readCellValueFromExcel("buyproductcreds", 1, 0);
		String address = Flib.readCellValueFromExcel("buyproductcreds", 1, 1);
		String pincode = Flib.readCellValueFromExcelinint("buyproductcreds", 1, 2);
		String contact = Flib.readCellValueFromExcelinint("buyproductcreds", 1, 3);
		
		System.out.println(city);
		System.out.println(address);
		System.out.println(pincode);
		System.out.println(contact);
		
		int rn = Flib.generateRandonNo();
		String PhoneNo = contact+rn;
		System.out.println(PhoneNo);
		 
		CheckOutPage cop = new CheckOutPage(driver);
		cop.buyproduct(city, address, pincode, PhoneNo);
		
		successfullPage sp = new successfullPage(driver);
		String actualtitle = sp.getSuccessmsg().getText();
		sa.assertEquals(actualtitle, "Your order has been successfully processed!", "Prduct has been failed to process");
		
		sa.assertAll();
	}
}
