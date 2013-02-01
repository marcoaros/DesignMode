package mediator;

import java.io.IOException;

import mediator.colleague.Country;
import mediator.colleague.impl.Iraq;
import mediator.colleague.impl.USA;
import mediator.mediator.UnitedNations;

public class Main {

	/**
	 * 中介者模式,用一个中介对象来封装一系列的对象交互，把交互的复杂性变成中介者的复杂性
	 * 固定情况：中介者要知道所有需要通信的对象
	 * 扩展情况：通信对象直接的关系可以通过中介者互相改变
	 * 例子：模拟联合国传达伊拉克和美国直接的消息。Cairngorm中的Command就是中介者
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		UnitedNations unitedNations = new UnitedNations();
		
		Country usa = new USA(unitedNations);
		Country irap = new Iraq(unitedNations);
		
		//第一种实现
//		unitedNations.setAccuser(irap);
//		unitedNations.setDefendant(usa);
		
		//第二种实现
		unitedNations.addCommand(usa, irap);
		unitedNations.addCommand(irap, usa);
		

		
		irap.sendMessage("你凭什么打我");
		usa.sendMessage("因为你那边有石油");
		
	}

}
