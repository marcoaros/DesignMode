package strategy;

import strategy.strategy.ComputeAmountStategy;

public class Main {

	/**
	 * 策略模式
	 * 固定情况：算法父类的抽象方法；算法父类和策略类的依赖关系
	 * 扩展情况：算法子类的增加，
	 * 例子：模拟用不同的算法计算商品价格，加了一层代理，使得算法使用类和算法类之间更加的松耦合
	 * 在算法使用类不变的情况下，可以改动整个算法父类和子类
	 * @throws ClassNotFoundException 
	 * @throws IllegalAccessException 
	 * @throws InstantiationException 
	 */
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		ComputeAmountStategy stategy = new ComputeAmountStategy("strategy.algorithm.impl.ComputeAmoutInDiscount");
		
		double orignalAmount = 1.0;
		String finalAmount = stategy.execute(orignalAmount);
		
		System.out.println(finalAmount);
		
	}

}
