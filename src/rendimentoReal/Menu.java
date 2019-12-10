package rendimentoReal;

public class Menu {

	public void menu(int op) {
		do {
			
			System.out.println("Cálculo Rendimento Bruto");
			System.out.println("Comparação pré e pós-fixado");
			
			switch(op) {
			
			case 1: System.out.println("OP 1");
			break;
			
			case 2:System.out.println("OP 2");
			break;
			}
			
		}while(op != 0);
	}
	
}

