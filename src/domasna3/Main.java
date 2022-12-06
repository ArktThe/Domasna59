package domasna3;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Main {
	public static void main (String[] args) {
		List<Integer> celiBroevi = new ArrayList<>();
		
		celiBroevi.add(3);
		celiBroevi.add(5);
		celiBroevi.add(2);
		celiBroevi.add(7);
		celiBroevi.add(4);
		
		Collections.sort(celiBroevi);
	
		System.out.println("Elementi na listata se: " + celiBroevi);
		
	}
}
