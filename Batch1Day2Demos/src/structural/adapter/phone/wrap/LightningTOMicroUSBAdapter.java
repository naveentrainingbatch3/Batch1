package structural.adapter.phone.wrap;

import structural.adapter.phone.LightningPhone;
import structural.adapter.phone.MicroUSBPhone;

public class LightningTOMicroUSBAdapter implements MicroUSBPhone {

	private final LightningPhone lightningPhone;

	public LightningTOMicroUSBAdapter(LightningPhone lightningPhone) {

		this.lightningPhone = lightningPhone;
	}

	public void recharge() {

		lightningPhone.recharge();

	}

	public void useMicroUsb() {
		System.out.println("Micro USB Connected");
		lightningPhone.useLightning();
	}

}
