package statePattern;

public class stopState implements IState{

	public stopState(Context context){
	}

	@Override
	public void doAction() {
		System.out.println("Stopping state...");
	}
	@Override
	public String toString() {
		return "This is a Stop";
	}
}
