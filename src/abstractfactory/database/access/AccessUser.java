package abstractfactory.database.access;

import abstractfactory.database.IUser;

public class AccessUser implements IUser {

	@Override
	public void getUser() {
		System.out.println("访问Access的User表");

	}

}
