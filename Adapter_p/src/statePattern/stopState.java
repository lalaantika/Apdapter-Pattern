package statePattern;

public class stopState implements IState{
	@Override
	public void doAction() {
		System.out.println("state is off");
	}

}
