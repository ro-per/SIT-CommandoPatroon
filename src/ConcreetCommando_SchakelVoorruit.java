/* CONCRETE COMMAND - SCHAKEL IN VOORRUIT */
public class ConcreetCommando_SchakelVoorruit implements Commando {
	private final Receiver_Auto auto;

	public ConcreetCommando_SchakelVoorruit(Receiver_Auto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.voorruit();
	}
}