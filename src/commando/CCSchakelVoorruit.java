package commando;

import receivers.ReceiverAuto;

/* CONCRETE COMMAND - SCHAKEL IN VOORRUIT */
public class CCSchakelVoorruit implements Commando {
	private final ReceiverAuto auto;

	public CCSchakelVoorruit(ReceiverAuto auto) {
		this.auto = auto;
	}

	@Override // Command
	public void uitvoeren() {
		auto.voorruit();
	}
}