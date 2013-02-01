package factory.object.impl;

import factory.object.Operation;

public class OperationPlus extends Operation {

	@Override
	public String getResult(double a, double b) {
		return Double.toString(a + b);
	}

}
