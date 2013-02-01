package command;

import command.command.Command;
import command.command.impl.BakeChickenCommand;
import command.command.impl.BakeMuttonCommand;
import command.invoker.Invoker;
import command.invoker.impl.Waiter;
import command.receiver.Receiver;
import command.receiver.impl.Baker;

public class Main {

	/**
	 * 命令模式，把请求操作的对象和知道怎么执行操作的那个对象分开，可扩展的访问那个对象的方法
	 * 固定情况：command绑定在固定的Receiver上；invoker负责接收一连串的命令并触发它们
	 * 扩展情况：依据Receiver已有的方法，增加新的命令
	 * 例子：进入餐厅找服务员点菜
	 */
	public static void main(String[] args) {
		
	      Receiver baker = new Baker("王师傅");
	      
	      Command bakeChickenComand = new BakeChickenCommand(baker);
	      Command bakeMuttonCommand = new BakeMuttonCommand(baker);
	      
	      Invoker waiter = new Waiter();
	      
	      waiter.addCommand(bakeChickenComand);
	      waiter.addCommand(bakeMuttonCommand);
	      
	      waiter.notifyReceiver();
	      
	      waiter.removeCommand(bakeChickenComand);
	      waiter.notifyReceiver();
	      
	}

}
