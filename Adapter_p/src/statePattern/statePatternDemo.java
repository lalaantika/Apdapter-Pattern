package statePattern;

public class statePatternDemo {

	public static void main(String[] args){
		Context context = new Context();
		context.setState(new stopState());
		context.context();

		context.setState(new startState());
		context.context();

	}
}
