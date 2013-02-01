package command.receiver;

import java.util.ArrayList;
import java.util.List;

import command.command.Command;

public abstract class Receiver {

	protected String name;

	public Receiver(String name) {
		this.name = name;
	}

	public abstract void bakeMutton();

	public abstract void bakeChicken();

}
