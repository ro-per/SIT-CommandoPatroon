import java.util.ArrayList;
import java.util.List;

/* INVOKER CLASS */
public class Invoker_Versnellingsbak {
	private final List<Commando> geschiedenis = new ArrayList<>();

	public void schakel(Commando commando) {
		geschiedenis.add(commando);
		commando.schakelen();
	}
}