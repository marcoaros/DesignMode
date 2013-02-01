package proxy;

import java.io.IOException;

import proxy.proxy.PursuitProxy;
import proxy.subject.Pursuit;
import proxy.subject.impl.PursuitImpl;

public class Main {

	/**
	 * 代理模式，隐藏实现类的细节
	 * 固定情况：被代理类的需要被代理的方法
	 * 扩展情况：暂无
	 * 例子：模拟帮好朋友追女生
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		
		Pursuit pursuit = new PursuitImpl();
		PursuitProxy pursuitProxy = new PursuitProxy(pursuit);
		
		pursuitProxy.giveGift();
		pursuitProxy.sendMessage();
		
	}
	

}
