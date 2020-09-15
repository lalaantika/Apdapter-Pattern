package statePattern;

public class Context {

	private IState state;

	public void context(){
		state.doAction();
	}


	public IState getState() {
		return state;
	}

	public void setState(IState state) {
		this.state = state;
	}
}
