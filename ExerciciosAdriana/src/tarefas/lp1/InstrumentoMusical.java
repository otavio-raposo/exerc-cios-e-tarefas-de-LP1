package tarefas.lp1;

public class InstrumentoMusical {
	
	private String nome;
	private String tipo;
	private String cor;
	
	public void tocar() {
		System.out.println("O Instrumento foi tocado");
	}
	
	public void limpar() {
		System.out.println("O Instrumento foi limp");
	}
	
	public void afinar() {
		System.out.println("O Instrumento foi afinado");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
