package org.POMrepository;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.genericLib.SelectUtility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;



public class CheckOutPage 
{
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement billingNewAddress;
	@FindBy(name = "billing_address_id") private WebElement billingAddressDD;
	@FindBy(id = "BillingNewAddress_CountryId") private WebElement billingAddresscountryDD;
	@FindBy(id = "BillingNewAddress_City") private WebElement billingNewAddressCity;
	@FindBy(id = "BillingNewAddress_Address1") private WebElement billingNewAddressAddress1;
	@FindBy(id = "BillingNewAddress_Address2") private WebElement billingNewAddressAddress2;
	@FindBy(id = "BillingNewAddress_ZipPostalCode") private WebElement billingNewAddressZipPostalCode;
	@FindBy(id = "BillingNewAddress_PhoneNumber") private WebElement billingNewAddressPhoneNumber;
	@FindBy(xpath = "//input[@onclick='Billing.save()']") private WebElement billingAddressContinueButton;
	
	@FindBy(id = "shipping-address-select") private WebElement shippingAddressDD;
	@FindBy(xpath = "//input[@onclick='Shipping.save()']") private WebElement shippingAddressContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ShippingMethod.save()']") private WebElement shippingMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentMethod.save()']") private WebElement paymentMethodContinueButton;
	
	@FindBy(xpath = "//input[@onclick='PaymentInfo.save()']") private WebElement paymentInfoContinueButton;
	
	@FindBy(xpath = "//input[@onclick='ConfirmOrder.save()']") private WebElement confirmOrderContinueButton;
	
	@FindBy(xpath = "//strong[text()='Your order has been successfully processed!']") private WebElement buyproductsuccessfulmsg;
	
	public CheckOutPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBillingNewAddress() {
		return billingNewAddress;
	}

	public WebElement getBillingAddressDD() {
		return billingAddressDD;
	}

	public WebElement getBillingNewAddressCity() {
		return billingNewAddressCity;
	}

	public WebElement getBillingNewAddressAddress1() {
		return billingNewAddressAddress1;
	}

	public WebElement getBillingNewAddressAddress2() {
		return billingNewAddressAddress2;
	}

	public WebElement getBillingNewAddressZipPostalCode() {
		return billingNewAddressZipPostalCode;
	}

	public WebElement getBillingNewAddressPhoneNumber() {
		return billingNewAddressPhoneNumber;
	}

	public WebElement getBillingAddressContinueButton() {
		return billingAddressContinueButton;
	}

	public WebElement getShippingAddressDD() {
		return shippingAddressDD;
	}

	public WebElement getShippingAddressContinueButton() {
		return shippingAddressContinueButton;
	}

	public WebElement getShippingMethodContinueButton() {
		return shippingMethodContinueButton;
	}

	public WebElement getPaymentMethodContinueButton() {
		return paymentMethodContinueButton;
	}

	public WebElement getPaymentInfoContinueButton() {
		return paymentInfoContinueButton;
	}

	public WebElement getConfirmOrderContinueButton() {
		return confirmOrderContinueButton;
	}
	
	public WebElement getBillingAddresscountryDD() {
		return billingAddresscountryDD;
	}

	public WebElement getBuyproductsuccessfulmsg() {
		return buyproductsuccessfulmsg;
	}

	public void buyproduct(String city, String address1, String pincode, String phoneNo)
	{
		SelectUtility su = new SelectUtility();
		try 
		{ 
			if(billingAddressDD.isDisplayed())
			{
				su.selectByVisibleText(billingAddressDD,"New Address");
				su.selectByVisibleText(billingAddresscountryDD,"India"); 
			}
		}
		catch(Exception e)
		{
			su.selectByVisibleText(billingAddresscountryDD,"India");
		}
		billingNewAddressCity.sendKeys(city);
		billingNewAddressAddress1.sendKeys(address1);
		billingNewAddressZipPostalCode.sendKeys(pincode);
		billingNewAddressPhoneNumber.sendKeys(phoneNo);
		
		billingAddressContinueButton.click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContinueButton.click();
	}
	
	
	public void Productcheckout() throws EncryptedDocumentException, IOException
	{
		
		
		Select sc =new Select(billingAddressDD);
		
		sc.selectByIndex(1);
		//sc.selectByVisibleText("New Address");
		//billingNewAddress.click();
		//sc.selectByVisibleText("India");
		
//		billingNewAddressCity.sendKeys(city);
//		billingNewAddressAddress1.sendKeys(address);
//		billingNewAddressPhoneNumber.sendKeys(phonenumber);
//		billingNewAddressZipPostalCode.sendKeys(pincode);
		getBillingAddressContinueButton().click();
		shippingAddressContinueButton.click();
		shippingMethodContinueButton.click();
		paymentMethodContinueButton.click();
		paymentInfoContinueButton.click();
		confirmOrderContinueButton.click();
		
	}
	
	
}
