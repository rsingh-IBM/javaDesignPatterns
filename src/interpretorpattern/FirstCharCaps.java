package interpretorpattern;

public class FirstCharCaps implements Grammer{

	@Override
	public String interpret(String context) {
		char x = context.charAt(0);
		if(!Character.isUpperCase(x)) {
			context = context.substring(0,1).toUpperCase()+context.substring(1);
		}
		return context;
	}
}
