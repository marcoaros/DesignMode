package chainofresponsebility;

import java.io.IOException;

import chainofresponsebility.common.RequestGrade;
import chainofresponsebility.handler.Manager;
import chainofresponsebility.handler.impl.CEO;
import chainofresponsebility.handler.impl.HeadMan;
import chainofresponsebility.handler.impl.Minister;
import chainofresponsebility.request.MyRequest;

public class Main {

	/**
	 * 职责链模式，避免请求发送者与所有接受者直接的耦合关系，将被请求的对象组合成一个链，沿着这条链传送请求，一直到有对象处理它为止
	 * 固定情况：每个接收者处理不同情况的请求，接收者之间有顺序关系
	 * 扩展情况：指定接收者处理哪些请求，组合接受者直接的顺序关系
	 * 例子：员工向公司管理人员提出一些请求
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
         MyRequest request1 = new MyRequest(RequestGrade.low, "请病假");
         MyRequest request2 = new MyRequest(RequestGrade.medium, "加薪");
         MyRequest request3 = new MyRequest(RequestGrade.hight, "报告重大事件");
         
         Manager headMan = new HeadMan("组长");
         Manager minister = new Minister("部长");
         Manager ceo = new CEO("CEO");
         
         headMan.setSuperior(minister);
         minister.setSuperior(ceo);
         
         headMan.accecptApplication(request1);
         headMan.accecptApplication(request2);
         headMan.accecptApplication(request3);
	}

}
