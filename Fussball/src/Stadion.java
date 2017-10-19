public class Stadion {
	
public static void main(String[] args) {
	
	System.out.println("asd");
	
	Person[] Zuschauer = new Person[45001]; // <<<< Array erstellen
	Fussballspieler[] Spieler_rot = new Fussballspieler [6]; // 0-4 = rot 5-10 blau
	Fussballspieler[] Spieler_blau = new Fussballspieler [6]; // 0-4 = rot 5-10 blau

	for (int i = 1; i <= 45000 ;++i){
		Zuschauer[i] = new Person("Zuschauer-" + i); 
	}
	
	
	for (int i = 1; i <= 5 ;++i){
		Spieler_rot[i] = new Fussballspieler("Spieler-" + "rot-" + i, 10000 * i); 
	}
	
	for (int i = 1; i <= 5 ;++i){
		Spieler_blau[i] = new Fussballspieler("Spieler-" + "blau-" + i, 20000 * i); 
	}
	
	Mannschaft rot = new Mannschaft(Spieler_rot[1],Spieler_rot[2],Spieler_rot[3],
			Spieler_rot[4],Spieler_rot[5]);
	
	Mannschaft blau = new Mannschaft(Spieler_blau[1],Spieler_blau[2],Spieler_blau[3],
			Spieler_blau[4],Spieler_blau[5]);

	System.out.println(rot + "\n" + blau ) ;
	System.out.println(rot.einkommen());
	System.out.println(blau.einkommen());
	System.out.println(Zuschauer[1]);
}

}
