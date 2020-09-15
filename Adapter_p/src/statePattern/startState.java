package statePattern;

public class startState implements IState{

	public startState(Context context){
	}

	@Override
	public void doAction() {
		System.out.println("Starting state...");

	}

	@Override
	public String toString() {
		return "This is a Start";
	}
}
