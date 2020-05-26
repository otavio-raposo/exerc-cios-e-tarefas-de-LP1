package tarefas.lp1;

public class Calcados {
	
	private String tipo;
	private int tamanho;
	private String cor;
	
	public void calcar() {
		System.out.println("O calçado foi colocado");
	}
	
	public void lavar() {
		System.out.println("O calçado foi lavado");
	}
	
	public void emprestar() {
		System.out.println("O calçado foi emprestado para alguém");
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}
	
	

}
