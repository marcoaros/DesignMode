package adapter.player.impl;

import adapter.foreignplayer.CentreForward;
import adapter.player.BasketballTeamMember;

public class Interpreter implements BasketballTeamMember {
	
	private CentreForward centreForward;
	
	public Interpreter(CentreForward centreForward){
		this.centreForward = centreForward;
	}

	@Override
	public void attack() {

		centreForward.myAttack();
	}

	@Override
	public void defense() {

		centreForward.myDefense();
	}

}
