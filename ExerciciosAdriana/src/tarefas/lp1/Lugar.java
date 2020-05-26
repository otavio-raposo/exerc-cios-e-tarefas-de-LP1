package tarefas.lp1;

public class Lugar {
	
	
	private String nome;
	private String localizacao;
	private String comercio;
	
	public void comprar() {
		System.out.println("O Turista comprou um produto");
	}
	
	public void visitar() {
		System.out.println("O Turista visitou o lugar");
	}
	
	public void comer() {
		System.out.println("O Turista comel uma comida típca do local");
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getComercio() {
		return comercio;
	}
	public void setComercio(String comercio) {
		this.comercio = comercio;
	}
	
	
	

}