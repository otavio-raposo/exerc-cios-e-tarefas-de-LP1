package tarefas.lp1;

public class AlunoFatec {
	
	private String nome;
	private int ra;
	private String email;
	
	public void faltas() {
		System.out.println("O Aluno consultou quantas faltas possui");
	}
	
	public void emprestimo() {
		System.out.println("O Aluno emprestou um livro");
	}
	
	public void notas() {
		System.out.println("O Aluno consultou sua nota");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRa() {
		return ra;
	}

	public void setRa(int ra) {
		this.ra = ra;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	

}