package chainofresponsebility.handler;

import chainofresponsebility.request.MyRequest;

public abstract class Manager {
	
	protected Manager superior;
	
	protected String name;
	
	public Manager(String name){
	     this.name = name;
	}
	

    public Manager getSuperior() {
		return superior;
	}


	public void setSuperior(Manager superior) {
		this.superior = superior;
	}

	public abstract void accecptApplication(MyRequest myRequest);

}
