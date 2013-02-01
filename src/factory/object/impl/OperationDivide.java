package factory.object.impl;

import factory.object.Operation;

public class OperationDivide extends Operation {

	@Override
	public String getResult(double a, double b) {
		if(b == 0){
			return "Error!The divisor is 0!";
		}
		return Double.toString(a / b);
	}

}
