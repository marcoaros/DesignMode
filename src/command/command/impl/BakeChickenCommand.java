package command.command.impl;

import command.command.Command;
import command.receiver.Receiver;

public class BakeChickenCommand extends Command {

	public BakeChickenCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {

		receiver.bakeChicken();
	}

}
