
public class Mannschaft {

	private Fussballspieler S1 = null ;
	private Fussballspieler S2 = null ;
	private Fussballspieler S3 = null ;
	private Fussballspieler S4 = null ;
	private Fussballspieler S5 = null ;
	
Mannschaft (Fussballspieler s1, Fussballspieler s2, Fussballspieler s3, Fussballspieler s4, Fussballspieler s5){
	S1 = s1; 
	S2 = s2;
	S3 = s3; 
	S4 = s4;
	S5 = s5;
	
}
		
public int einkommen(){
	return S1.getEinkommen() + S2.getEinkommen()+ 
		S3.getEinkommen() + S4.getEinkommen()+ S5.getEinkommen() ;
	
}

public String toString(){
	return  "1. " + S1.getName() + "\n" +
			"2. " + S2.getName() + "\n" +
			"3. " + S3.getName() + "\n" +
			"4. " + S4.getName() + "\n" +
			"5. " + S5.getName() + "\n" ;
}

}
