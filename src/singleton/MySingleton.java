package singleton;

public class MySingleton {

	private static MySingleton mySingleton = null;

	private MySingleton() {

	}

	public static MySingleton getInstance() {

		if (mySingleton != null) {
			return mySingleton;
		}

		// 多线程时保证只有一个实例
		synchronized ("ensure only a instance") {
			if (mySingleton == null) {
				mySingleton = new MySingleton();
				return mySingleton;
			}

			return mySingleton;
		}

	}
}
