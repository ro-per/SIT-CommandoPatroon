
/* CONCRETE COMMAND - SCHAKEL IN ACHTERRUIT */
public class SchakelAchterruit implements Commando {
	private final Auto auto;

	public SchakelAchterruit(Auto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.achterruit();
	}
}