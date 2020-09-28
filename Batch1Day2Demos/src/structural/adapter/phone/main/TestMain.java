package structural.adapter.phone.main;

import structural.adapter.phone.LightningPhone;
import structural.adapter.phone.MicroUSBPhone;
import structural.adapter.phone.impl.Android;
import structural.adapter.phone.impl.Iphone;
import structural.adapter.phone.wrap.LightningTOMicroUSBAdapter;

public class TestMain {

	public static void rechargeMIcroUSBPhone(MicroUSBPhone phone)
	{
		phone.useMicroUsb();
		phone.recharge();
	}
	public static void rechargeLightningPhone(LightningPhone phone)
	{
		phone.useLightning();
		phone.recharge();
	}
	public static void main(String[] args) {
		Android android=new Android();
		Iphone iphone=new Iphone();
		System.out.println("Recharge Iphone with Lightning");
		rechargeLightningPhone(iphone);
		System.out.println("Recharge Android with MicroUSB");
		rechargeMIcroUSBPhone(android);
		System.out.println("Recharging Iphone with MicroUSB");
		
		rechargeMIcroUSBPhone(new LightningTOMicroUSBAdapter(iphone));
	}
}
