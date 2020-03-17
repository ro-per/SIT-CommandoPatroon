/* CONCRETE COMMAND - SCHAKEL IN VOORRUIT */
public class SchakelVoorruit implements Commando {
	private final Auto auto;

	public SchakelVoorruit(Auto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.voorruit();
	}
}