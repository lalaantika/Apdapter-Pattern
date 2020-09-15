package statePattern;

public class startState implements IState{
	@Override
	public void doAction() {
		System.out.println("state is on");
	}
}
