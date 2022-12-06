package domasna10;
import java.util.ArrayList;

public class Main {
	public static void main (String[] args) {
	ArrayList<Integer> l1 = new ArrayList<Integer>();
    l1.add(1);
    l1.add(3);
    l1.add(5);
    ArrayList<Integer> l2 = new ArrayList<Integer>();
    l2.add(2);
    l2.add(3);
    l2.add(6);
    ArrayList<Integer> presek = new ArrayList<Integer>();
    
    l1.retainAll(l2);
    System.out.println("Presek na listite iznesuva: " + l1);
    
	}
}