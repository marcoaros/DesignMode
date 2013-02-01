package state;

import state.myworkstate.impl.MorningState;
import state.work.Work;
import state.work.impl.MyWork;

public class Main {

	/**
	 * 状态模式：当判断状态的分支语句太多的时候，根据状态的变化来改变主体行为的变化
	 * 固定情况：主题类一段时间内有某一状态，状态类根据主体类实时的信息进行互相转化
	 * 扩展情况：增加新的状态及它与其他状态的关系
	 * 例子：工作写代码的时候程序员会有不同的状态，状态之间的如何转化已经进行了隐藏
	 */
	public static void main(String[] args) {
		
		Work myWork = new MyWork();
		
		myWork.setState(new MorningState());
		
		myWork.setCurrentHour((short)6);
		myWork.writePragram();
		
		myWork.setCurrentHour((short)13);
		myWork.writePragram();
		
		myWork.setCurrentHour((short)19);
		myWork.setFinished(false);
		myWork.writePragram();
		
		
		
		
	}

}
