package factory.object.impl;

import factory.object.Operation;

public class OperationMultiply extends Operation {

	@Override
	public String getResult(double a, double b) {
		return Double.toString(a * b);
	}

}
