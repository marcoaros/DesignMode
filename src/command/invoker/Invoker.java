package command.invoker;

import java.util.ArrayList;
import java.util.List;

import command.command.Command;

public abstract class Invoker {

	protected List<Command> commandList = new ArrayList<Command>();
	
	public void addCommand(Command command){
		commandList.add(command);
	}
	
	public void removeCommand(Command command){
		commandList.remove(command);
	}
	
	public void notifyReceiver(){
		for(Command command:commandList){
			command.execute();
		}
	}

}
