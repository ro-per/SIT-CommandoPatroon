public class Client_Persoon {
	public static void main(final String[] arguments) {
		// RECEIVER CLASS
		Receiver_Auto auto = new Receiver_Auto();

		// CONCRETE COMMANDS
		Commando voorruit = new ConcreetCommando_SchakelVoorruit(auto);
		Commando achteruit = new ConcreetCommando_SchakelAchterruit(auto);

		// INVOKER CLASS
		Invoker_Versnellingsbak versnelling = new Invoker_Versnellingsbak();
		versnelling.schakel(voorruit);
		versnelling.schakel(achteruit);
	}
}
