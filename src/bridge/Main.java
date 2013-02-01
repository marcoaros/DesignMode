package bridge;

import bridge.abstraction.CellPhoneBand;
import bridge.abstraction.impl.IPhone;
import bridge.abstraction.impl.NoKia;
import bridge.implementor.CellPhoneSoft;
import bridge.implementor.impl.AddressList;
import bridge.implementor.impl.Games;

public class Main {

	/**
	 * 桥接模式，尽量使用合成和聚合，尽量不要用类继承
	 * 固定情况：某个实体可以有多种分类方法，把这些变化分离出多个类来，让各个类独自变化
	 * 扩展情况：暂无
	 * 例子：在手机可以按品牌分类后，再按使用软件分类的情况下，把品牌类和软件类分离出来
	 */
	public static void main(String[] args) {
		
       CellPhoneBand noKia = new NoKia();
       CellPhoneBand iPhone = new IPhone();
       
       CellPhoneSoft games = new Games();
       CellPhoneSoft addressList = new AddressList();
       
       noKia.setCellPhoneSoft(games);
       noKia.run();
       
       iPhone.setCellPhoneSoft(addressList);
       iPhone.run();
       
	}

}
