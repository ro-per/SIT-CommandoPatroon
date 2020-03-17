public class Client {
	public static void main(final String[] arguments) {
		// RECEIVER CLASS
		Auto auto = new Auto();

		// CONCRETE COMMANDS
		Commando voorruit = new SchakelVoorruit(auto);
		Commando achteruit = new SchakelAchterruit(auto);

		// INVOKER CLASS
		Versnellingsbak versnelling = new Versnellingsbak();
		versnelling.schakel(voorruit);
		versnelling.schakel(achteruit);
	}
}
