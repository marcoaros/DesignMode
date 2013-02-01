package chainofresponsebility.handler.impl;

import chainofresponsebility.common.RequestGrade;
import chainofresponsebility.handler.Manager;
import chainofresponsebility.request.MyRequest;

public class Minister extends Manager {

	public Minister(String name) {
		super(name);
	}

	@Override
	public void accecptApplication(MyRequest myRequest) {

		if(myRequest.getGrade().equals(RequestGrade.medium)){

			System.out.println(this.name + "来处理" + myRequest.getContent());
		}else{
			if(this.superior != null){
				this.superior.accecptApplication(myRequest);
			}
		}
	}

}
