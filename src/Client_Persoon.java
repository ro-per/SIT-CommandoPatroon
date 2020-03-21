public class Client_Persoon {
    public static void main(final String[] arguments) {
        // RECEIVER CLASS
        Receiver_Auto auto = new Receiver_Auto();

        // CONCRETE COMMANDS
        Commando voorruit = new ConcreetCommando_SchakelVoorruit(auto);
        Commando achteruit = new ConcreetCommando_SchakelAchterruit(auto);

        // INVOKER CLASS
        Invoker_VersnellingsPook versnellingspook = new Invoker_VersnellingsPook();
        versnellingspook.schakel(voorruit);
        versnellingspook.schakel(achteruit);
    }
}
