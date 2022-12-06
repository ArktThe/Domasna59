package domasna8;

public class Fakultet {
	
	private String ime;
	private int brNaSmerovi;
	private int vkStudenti;
	
	public Fakultet (String ime, int brNaSmerovi, int vkStudenti) {
		this.ime = ime;
		this.brNaSmerovi = brNaSmerovi;
		this.vkStudenti = vkStudenti;
	}
	
	public String getIme () {
		return this.ime;
	}
	
	public int getBrNaSmerovi () {
		return this.brNaSmerovi;
	}
	
	public int getVkStudenti () {
		return this.vkStudenti;
	}
	
}