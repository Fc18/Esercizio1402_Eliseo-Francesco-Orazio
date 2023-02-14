package esercizio1402;

public class Quadrato extends Superficie implements Colore{
	private int lato;
	private String colore = "Rosso";
	
	public Quadrato() {
		this.lato = 10;
	}
	
	public void calcolaSuferficie() {
		System.out.println("Area del Quadrato: " + lato*lato);
	}


	public String dammiColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}

}
