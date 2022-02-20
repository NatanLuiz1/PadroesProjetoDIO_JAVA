package strategy;

public class Main {

	public static void main(String[] args) {
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		Robo robo = new Robo();
		robo.setStrategy(agressivo);
		
		robo.mover();
		robo.mover();
		robo.setStrategy(normal);
		robo.mover();
		robo.mover();
		robo.mover();
		

	}

}
