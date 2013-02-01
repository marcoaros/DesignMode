package chainofresponsebility.handler.impl;

import chainofresponsebility.common.RequestGrade;
import chainofresponsebility.handler.Manager;
import chainofresponsebility.request.MyRequest;

public class HeadMan extends Manager {

	public HeadMan(String name) {
		super(name);
	}

	@Override
	public void accecptApplication(MyRequest myRequest) {

		if(myRequest.getGrade().equals(RequestGrade.low)){

			System.out.println(this.name + "来处理" + myRequest.getContent());
		}else{
			if(this.superior != null){
				this.superior.accecptApplication(myRequest);
			}
			
		}
	}

}
