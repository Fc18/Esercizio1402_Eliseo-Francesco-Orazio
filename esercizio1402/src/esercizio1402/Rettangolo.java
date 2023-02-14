package esercizio1402;

public class Rettangolo extends Superficie implements Colore{
	
	private int base;
	private int altezza;
	private String colore;
	
	public Rettangolo() {
		base=5;
		altezza=10;
		colore="Verde";
	}
	
	public Rettangolo(int base,int altezza,String colore) {
		this.base = base;
		this.altezza = altezza;
		this.colore = colore;
	}
	
	
	public void calcolaSuferficie() {
		int area = base*altezza;
		System.out.println("Area del rettangolo: " + area);
	}


	public String dammiColore() {
		return colore;
	}


	public void setColore(String colore) {
		this.colore = colore;	
	}

}
