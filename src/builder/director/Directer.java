package builder.director;

import builder.builder.Builder;

public class Directer {

	private Builder builder;
	
	public Directer(Builder builder){
		this.builder = builder;
	}
	
	public void drawPerson(){
		
		builder.buildBody();
		builder.buildHead();
	}
}
