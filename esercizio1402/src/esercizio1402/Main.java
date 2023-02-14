package esercizio1402;

public class Main {

	public static void main(String[] args) {
		
		//Quadrato
		Quadrato quad = new Quadrato();
		quad.calcolaSuferficie();
		System.out.println("Colore del Quadrato = " + quad.dammiColore());
		quad.setColore("Arancione");
		System.out.println("Colore del Quadrato Modificato = " + quad.dammiColore());
		
		//Rettangolo
		Rettangolo ret = new Rettangolo(20,20,"Giallo");
		ret.calcolaSuferficie();
		String coloreR = ret.dammiColore();
		System.out.println("Colore del rettangolo = " + coloreR);
		
		//Cerchio
		Cerchio cer = new Cerchio(20,"Azzurro");
		cer.calcolaSuferficie();
		System.out.println("Colore del Cerchio = " + cer.dammiColore());
		
		
		
		
		

	}

}
