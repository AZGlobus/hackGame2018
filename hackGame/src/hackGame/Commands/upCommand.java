package hackGame.Commands;

import hackGame.player;

public class upCommand {
	player myActor;
	public upCommand(player argActor) {
		myActor=argActor;
	}
	public void execute() {
		myActor.up();
	}
}
