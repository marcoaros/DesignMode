package adapter.player.impl;

import adapter.player.BasketballTeamMember;


public class Forward implements BasketballTeamMember {

	@Override
	public void attack() {

		System.out.println("前锋进攻");
	}

	@Override
	public void defense() {

		System.out.println("前锋防守");
	}

}
