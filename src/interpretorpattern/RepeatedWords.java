package interpretorpattern;

public class RepeatedWords implements Grammer{

	FirstCharCaps firstCharCaps = new FirstCharCaps();
	@Override
	public String interpret(String context) {
		
		return firstCharCaps.interpret(
				HelperMethods.noRepeatableWords(context)
				);
	}

}
