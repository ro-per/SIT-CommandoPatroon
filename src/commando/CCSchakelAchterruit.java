package commando;

import receivers.ReceiverAuto;

/* CONCRETE COMMAND - SCHAKEL IN ACHTERRUIT */
public class CCSchakelAchterruit implements Commando {
	private final ReceiverAuto auto;

	public CCSchakelAchterruit(ReceiverAuto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.achterruit();
	}
}