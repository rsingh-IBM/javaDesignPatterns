package interpretorpattern;

public class EndsWithPeriod implements Grammer{

	RepeatedWords repeatedWords = new RepeatedWords();
	@Override
	public String interpret(String context) {
		return(repeatedWords.interpret(HelperMethods.endsWithPerios(context)));
	}

}
