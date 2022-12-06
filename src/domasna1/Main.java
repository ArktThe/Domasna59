package domasna1;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> drzavi = new ArrayList<>();
		
		drzavi.add("Makedonija");
		drzavi.add("Kosovo");
		drzavi.add("Srbija");
		
		System.out.println("Golemina na listata: " + drzavi.size());
		
		if (drzavi.size() == 3) {
			drzavi.add("Zimbabve");
			drzavi.add("Nigerija");
			System.out.println("Golemina na listata: " + drzavi.size());
			System.out.println("Elementi na listata se: " + drzavi);
		} else 
			System.out.println("Elementi na listata se: " + drzavi);
		
		
	}
}