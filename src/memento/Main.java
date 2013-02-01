package memento;

public class Main {

	/**
	 * 备忘录模式，在不破坏封装性的前提下，捕获一个内部状态，在该对象之外进行保存，以后某个时间可以恢复这个状态
	 * 固定情况：主体有某个状态，状态可以改变，状态管理类负责存储主体某时间的某一状态
	 * 扩展情况：状态可以变化，可以是保存其他状态，要改RoleState类,但是不用更改main函数
	 * 例子：RPG中的存档机制
	 */
	public static void main(String[] args) {
		
		Role role = new Role();
		
		//这里封装了State，使得使用者不必了解State类
		RoleStateManager roleStateManager = new RoleStateManager();
		roleStateManager.setRoleState(role.saveState());
		
		role.showState();
		
		role.fightBoss();
		role.showState();
		
		role.recoverState(roleStateManager.getRoleState());
		role.showState();
		
	}

}
