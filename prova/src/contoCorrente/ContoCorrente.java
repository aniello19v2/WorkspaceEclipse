package contoCorrente;

public class ContoCorrente {
	
	private String nome;
	private double saldo;
	
	
	public ContoCorrente(String nome, double saldo) {
		this.nome = nome;
		if(saldo > 0.0)
			this.saldo = saldo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void deposita(double valore) {
		if(valore > 0)
			saldo = saldo + valore;
	}
	
	public void preleva(double valore) {
		if(valore > saldo)
			System.out.println("Il prelievo ha superato il saldo dell'account!");
		else
			saldo = saldo - valore;
	}
	
	
	
	
	

}
