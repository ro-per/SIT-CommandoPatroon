
/* CONCRETE COMMAND - SCHAKEL IN ACHTERRUIT */
public class ConcreetCommando_SchakelAchterruit implements Commando {
	private final Receiver_Auto auto;

	public ConcreetCommando_SchakelAchterruit(Receiver_Auto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.achterruit();
	}
}