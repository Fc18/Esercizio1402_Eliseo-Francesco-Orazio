package esercizio1402;

public class Cerchio extends Superficie implements Colore{
	
	private int raggio;
	private final double pigreco = 3.14;
	private String colore;
	
	public Cerchio(int raggio,String colore) {
		this.raggio = raggio;
		this.colore = colore;
	}
	
	
	public void calcolaSuferficie() {
		double area = Math.pow(raggio, 2) * pigreco;
		System.out.println("Area del cerchio: " + area);
	}



	public String dammiColore() {
		return colore;
	}



	public void setColore(String colore) {
		this.colore = colore;
	}

}
