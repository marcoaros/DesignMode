package memento;

public class RoleState {

	private short life;
	private short attack;
	private short defense;
	
	public RoleState(short life,short attack,short defense){
		this.life = life;
		this.attack = attack;
		this.defense = defense;
	}
	
	public short getLife() {
		return life;
	}
	public void setLife(short life) {
		this.life = life;
	}
	public short getAttack() {
		return attack;
	}
	public void setAttack(short attack) {
		this.attack = attack;
	}
	public short getDefense() {
		return defense;
	}
	public void setDefense(short defense) {
		this.defense = defense;
	}
	
	
	
}
