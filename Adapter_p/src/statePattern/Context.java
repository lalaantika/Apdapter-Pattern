package statePattern;

public class Context {

	private IState state;

	public Context(){
		this.state = null;
	}

	public IState getState() {
		return this.state;
	}

	public void setState(IState state) {
		this.state = state;
	}
}
