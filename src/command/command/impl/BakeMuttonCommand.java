package command.command.impl;

import command.command.Command;
import command.receiver.Receiver;

public class BakeMuttonCommand extends Command {

	public BakeMuttonCommand(Receiver receiver) {
		super(receiver);
	}

	@Override
	public void execute() {

		receiver.bakeMutton();
	}

}
