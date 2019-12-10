package rendimentoReal;

public class Main {
	
	
	public static void main(String[] args) {
		Menu menu = new Menu();
		menu.menu(1);
		
		menu.menu(2);
		
		// Como calcular ganho de CDB e poupança
		
		Calculo calc = new Calculo();
		//6,39% (taxa do CDI) x 1,2 (120% / 100) = 7,67%
		System.out.println("Taxa DI = 6,39 - CDB a 120%");
		
		System.out.println("Rendimento Bruto " + calc.rendimentoBruto(120.0) + " %");
	}

}
