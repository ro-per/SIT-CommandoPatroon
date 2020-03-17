public class Client_Persoon {
	public static void main(final String[] arguments) {
		// RECEIVER CLASS
		Receiver_Auto auto = new Receiver_Auto();

		// CONCRETE COMMANDS
		Commando voorruit = new ConcreetCommando_SchakelVoorruit(auto);
		Commando achteruit = new ConcreetCommando_SchakelAchterruit(auto);

		// INVOKER CLASS
		Invoker_Versnellingsbak versnellingsbak = new Invoker_Versnellingsbak();
		versnellingsbak.schakel(voorruit);
		versnellingsbak.schakel(achteruit);
	}
}