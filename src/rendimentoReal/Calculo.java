package rendimentoReal;

public class Calculo {
	
	// https://economia.uol.com.br/financas-pessoais/noticias/redacao/2018/08/14/como-calcular-rendimento-real-de-investimento.htm
	
	private double selic;
	private double taxaDI = 6.39;
	private double inflacao;
	
	
	public double getSelic() {
		return selic;
	}
	public void setSelic(double selic) {
		this.selic = selic;
	}
	
	public double getTaxaDI() {
		return taxaDI;
	}
	public void setTaxaDI(double taxaDI) {
		this.taxaDI = taxaDI;
	}

	public double getInflacao() {
		return inflacao;
	}
	public void setInflacao(double inflacao) {
		this.inflacao = inflacao;
	}
	
	
	
	public double rendimentoBruto(double rendimentoCBD) {
		double rendimentoBruto = getTaxaDI() * (rendimentoCBD/100);
		return rendimentoBruto;
		
	}
	
	
	
	public double rendimentoLiquido() {
		double rendimentoLiquido=0.0;
		
		
		return rendimentoLiquido;
	}
	
	public double calcRendimentoReal() {
	
	//	double rendimentoReal = (( ( 1 + rendimentoL�quido()) / (1 + Infla��o) ) - 1) x 100;... - 
		
				return 0.0;// rendimentoReal;
	}
	

}
