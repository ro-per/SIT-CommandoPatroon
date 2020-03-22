package receivers;

/* RECEIVER CLASS */
public class ReceiverAuto {
	private String versnelling = "neutraal";

	public void voorruit() {
		versnelling = "De auto is in voorruit geschakeld";
		System.out.println(versnelling);
	}

	public void achterruit() {
		versnelling = "De auto is in achterruit geschakeld";
		System.out.println(versnelling);
	}
}