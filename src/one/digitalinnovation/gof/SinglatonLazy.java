package one.digitalinnovation.gof;


//Singleton preguiçoso
//@author nttl1

public class SinglatonLazy {
	
	private static SinglatonLazy instancia;
	
	private SinglatonLazy() {
		super();
	}
	
	public static SinglatonLazy getInstancia() {
		if(instancia == null) instancia = new SinglatonLazy();
		return instancia;
		
	}
		
	
	
	

}
