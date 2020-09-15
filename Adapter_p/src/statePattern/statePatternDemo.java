package statePattern;

public class statePatternDemo {

	public static void main(String[] args){
		Context context = new Context();
		context.setState(new startState(context));

		System.out.println(context.getState().toString());
		context.setState(new stopState(context));
		
		System.out.println(context.getState().toString());

	}
}
