package behavior.stratergy.impl;

import behavior.stratergy.PayAlgorithm;

public class TraineePayAlgorithm implements PayAlgorithm {

	@Override
	public double getPay(double salary) {
		// TODO Auto-generated method stub
		return salary+(salary*0.12);
	}

}
