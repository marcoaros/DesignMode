package adapter;

import adapter.foreignplayer.CentreForward;
import adapter.player.BasketballTeamMember;
import adapter.player.impl.Forward;
import adapter.player.impl.Interpreter;
import adapter.player.impl.ShotingGaurd;

public class Main {

	/**
	 * 适配器模式，通过把一个已写好类的接口转化成客户希望的另一个接口，使原本接口不兼容的而不能一起工作的一些类可以一起工作了
	 * 固定情况：父类的接口和子类的实现
	 * 扩展情况：来了一个实现内容一样但接口名不一样的类，想还是以父类接口统一管理子类，则要设计一个继承于父类的适配器
	 * 例子：NBA外籍球员需要翻译官才能听懂教练说什么
	 */
	public static void main(String[] args) {
		
		BasketballTeamMember forword = new Forward();
		BasketballTeamMember shotingGaurd = new ShotingGaurd();
		
		CentreForward centreForward = new CentreForward();
		//给外籍中锋加一个翻译官，做适配器
		BasketballTeamMember interpreter = new Interpreter(centreForward);
		
		forword.attack();
		shotingGaurd.attack();
		interpreter.attack();
		

	}

}
