package tarefas.lp1;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cordosolhos;
	
	public void piscar() {
		System.out.println("A pessoa piscou!");
	}
	
	public void sorrir() {
		System.out.println("A pessoa sorriu!");
	}
	
	public void ficouemcasa() {
		System.out.println("A pessoa se protegeu ficando em casa");
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCordosolhos() {
		return cordosolhos;
	}
	public void setCordosolhos(String cordosolhos) {
		this.cordosolhos = cordosolhos;
	}
	
	

}