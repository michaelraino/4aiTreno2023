/**
 * 
 * @author michael raino
 *<b>Classe Vagone</b>
 * <p>singolo oggetto</p>
 * <p>dati in ingresso:</p>
 * <UL>
 * <LI>numero posti totali
 * <LI>numero posti occupati
 * <LI>numero posti liberi
 * <LI>classe
 * </UL>
 */
public class Vagone {
	private int numP, postiOcc, postiDisp;
	private String classe;
	/**
	 * 
	 * @param numP
	 * @param classe
	 */
	/**
	 * @return metodo costruttore
	 */
	public Vagone(int numP, String classe) {
		this.numP = numP;
		postiOcc=0;
		postiDisp=0;
		this.classe = classe;
	}
	/**
	 * @return metodo che inserisce i posti occupati 
	 */
	public boolean setPostiOcc(int p) {
		if(p<=numP) {
			postiOcc = p;
			return true;
		}
		return false;
	}
	/**
	 * @return metodo che restituisce i posti occupati
	 */
	public int getPostiOcc() {
		return postiOcc;
	}
	/**
	 * @return metodo che restituisce i posti disponibili
	 */
	public int getPostiDisp() {
		return numP-postiOcc;
	}
	/**
	 * @return metodo che restituisce il peso totale dei passeggeri presenti sul treno
	 */
	public int pesoP() {
		int pTot=0;
		pTot= 65*postiOcc;
		return pTot;
	}
	/**
	 * @return metodo che restituisce il vagone completo
	 */
	public String toString() {
		String s="";
		s+="Il vagone di classe "+classe+" ha in totale "+numP+" posti.";
		s+="\nNel vagone sono stati occupati "+postiOcc+" posti e ne sono rimasti liberi "+getPostiDisp();
		s+="\nIl peso totale delle persone presenti su questo vagone ammonta a "+pesoP()+" kg.";
		return s;
	}
	/**
	 * @return metodo main per testare i metodi della classe
	 */
    public static void main(String[] args) {
		Vagone v1=new Vagone(39,"Prima");
		Vagone v2=new Vagone(32,"Terza");
		System.out.println(v1.setPostiOcc(12));       // ci verrà restituito un valore true perchè il numero inserito è minore di 39
		System.out.println(v2.setPostiOcc(36));		  // ci verrà restituito un valore false perchè il numero inserito è maggiore di 32
		System.out.println(v1);
		System.out.println(v2);
	}
}