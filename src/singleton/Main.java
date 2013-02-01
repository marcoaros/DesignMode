package singleton;


public class Main {

	/**
	 * 单例模式，保证一个类只有一个实例，也只需要一个实例，提供一个访问它的全局访问点
	 * 固定情况：单例类构造函数设为private
	 * 扩展情况：暂无
	 * 例子：Cairngrom中的Model
	 */
	public static void main(String[] args) {
		
		MySingleton obj1 = MySingleton.getInstance();
		MySingleton obj2 = MySingleton.getInstance();
		
//		MySingleton obj3 = new MySingleton();
		
		if(obj2 == obj1){
			System.out.println("单例模式成功");
		}

	}

}
