
public class Fussballspieler extends Person{

private int Einkommen = 0;
	
	Fussballspieler(String name, int einkommen) {
		super(name);
		Einkommen = einkommen;
		// TODO Auto-generated constructor stub
	}
	
public int getEinkommen(){
return Einkommen;	
}

public String toString(){
	return getName() + " " + Einkommen;
}

}
