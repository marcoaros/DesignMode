package observer;

import observer.observer.impl.NBAWatcher;
import observer.observer.impl.PhoneCaller;
import observer.subject.impl.Boss;
import observer.subject.impl.Secretary;

public class Main {

	/**
	 * 观察者模式
	 * 固定情况：观察者父类的抽象方法，被观察者父类的抽象方法，观察者父类与被观察者父类之间的依赖关系
	 * 扩展情况：增加观察者和被观察者的子类
	 * 例子：模拟老板视察工作，秘书暗地通知员工的数据流，老板是被观察者
	 */
	public static void main(String[] args) {
		
         Secretary secretary = new Secretary();
         
         PhoneCaller phoneCaller = new PhoneCaller();
         NBAWatcher nbaWatcher = new NBAWatcher();
         
         secretary.addObserver(phoneCaller);
         secretary.addObserver(nbaWatcher);
         
         secretary.notifyAllObserver("老板来了");
         
         Boss boss = new Boss();
         
         boss.addObserver(phoneCaller);
         boss.addObserver(nbaWatcher);
         
         boss.notifyAllObserver("工作时间，你在干嘛？");
         
	}

}
