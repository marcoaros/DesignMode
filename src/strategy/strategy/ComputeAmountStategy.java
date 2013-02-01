package strategy.strategy;

import strategy.algorithm.ComputeAmount;

public class ComputeAmountStategy {
	
   private ComputeAmount  computerAmount;
   
   public ComputeAmountStategy(String computerAmount) throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		this.computerAmount =  (ComputeAmount) Class.forName(computerAmount).newInstance();
   }
   
   public String execute(double price){
	  return computerAmount.computeAmount(price);
   }

}
