package aula;
public class Aula {

	public static void main(String[] args) {
		Caneta c1 = new Caneta();
		c1.cor = "azul";
		c1.ponta = 0.5f;
		c1.destampar();
		c1.rabiscar();
		c1.status();
		
		System.out.println("-----------------------");
		
		Caneta c2 = new Caneta();
		c1.cor = "preta";
		c1.modelo = "hostnet";
		c1.tampar();
		c1.rabiscar();
		c1.status();
		
	}

}
