package domasna;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main (String[] args) {
		List<String> gradovi = new ArrayList<>();
		
		gradovi.add("Prilep");
		gradovi.add("Kavadarci");
		gradovi.add("Skopje");
		gradovi.add("Bitola");
		gradovi.add("Ohrid");
		
		System.out.println("Elementite na listata se: " + gradovi);
	}
}