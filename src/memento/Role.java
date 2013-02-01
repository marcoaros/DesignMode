package memento;

public class Role {

	private short life = 100;
	private short attack = 100;
	private short defense = 100;
	
	public void showState(){
		System.out.println("life = " + life);
		System.out.println("attack = " + attack);
		System.out.println("defense = " + defense);
	}
	
	public RoleState saveState(){
		return new RoleState(life, attack, defense);
	}
	
	public void recoverState(RoleState roleState){
		life = roleState.getLife();
		attack = roleState.getAttack();
		defense = roleState.getDefense();
	}
	
	public void fightBoss(){
		life = 0;
		attack = 0;
		defense = 0;
	}
}
