package clients;

import commando.Commando;
import commando.CCSchakelAchterruit;
import commando.CCSchakelVoorruit;
import invokers.InvokerVersnellingsPook;
import receivers.ReceiverAuto;

public class ClientPersoon {
    public static void main(final String[] arguments) {
        // RECEIVER CLASS
        ReceiverAuto auto = new ReceiverAuto();

        // CONCRETE COMMANDS
        Commando voorruit = new CCSchakelVoorruit(auto);
        Commando achteruit = new CCSchakelAchterruit(auto);

        // INVOKER CLASS
        InvokerVersnellingsPook versnellingspook = new InvokerVersnellingsPook();
        versnellingspook.schakel(voorruit);
        versnellingspook.schakel(achteruit);
    }
}
