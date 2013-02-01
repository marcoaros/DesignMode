package chainofresponsebility.handler.impl;

import chainofresponsebility.common.RequestGrade;
import chainofresponsebility.handler.Manager;
import chainofresponsebility.request.MyRequest;

public class CEO extends Manager {

	public CEO(String name) {
		super(name);
	}

	@Override
	public void accecptApplication(MyRequest myRequest) {

		if(myRequest.getGrade().equals(RequestGrade.hight)){

			System.out.println(this.name + "来处理" + myRequest.getContent());
		}else{
			if(this.superior != null){
				this.superior.accecptApplication(myRequest);
			}
		}
	}

}
