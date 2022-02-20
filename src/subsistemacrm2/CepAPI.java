package subsistemacrm2;


public class CepAPI {
	
private static CepAPI instancia;
	
	private CepAPI() {
		super();
	}
	
	public static CepAPI getInstancia() {
		if(instancia == null) instancia = new CepAPI();
		return instancia;
		
	}
	
	public String recuperarCidade(String cep) {
		return "Recife";
	}
	public String recuperarEstado(String cep) {
		return "PE";
	}
}
