package structural.adapter.phone.impl;

import structural.adapter.phone.MicroUSBPhone;

public class Android implements MicroUSBPhone {
	private boolean connector;
	public void recharge() {
		// TODO Auto-generated method stub
		if (connector)
		{
			System.out.println("Recharge Started");
			System.out.println("Recharge Finished");

		}else
		{
			System.out.println("Connect MicroUSb first");
		}
	}

	public void useMicroUsb() {
		// TODO Auto-generated method stub
		connector=true;
		System.out.println("MicroUSB connected");
	}

}
