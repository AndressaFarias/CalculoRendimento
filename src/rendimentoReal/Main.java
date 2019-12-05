package rendimentoReal;

public class Main {

	public static void main(String[] args) {
		// Como calcular ganho de CDB e poupança
		Calculo calc = new Calculo();
		System.out.println("Taxa DI = 6,39 - CDB a 120%");
		
		System.out.println("Rendimento Bruto " + calc.rendimentoBruto(120.0) + " %");
	}

}
