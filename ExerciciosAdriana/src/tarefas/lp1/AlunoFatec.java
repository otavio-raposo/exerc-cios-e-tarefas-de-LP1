package tarefas.lp1;

public class AlunoFatec {
	
	private String nome;
	private int ra;
	private String email;
	

	public AlunoFatec(String nome, String email, int ra) {
		this.nome=nome;
		this.email=email;
		this.ra=ra;
	}
	
	public void faltas() {
		System.out.println("O Aluno "+this.nome+" de RA nº "+this.ra+" consultou quantas faltas possui");
	}
	
	public void emprestimo() {
		System.out.println("O Aluno "+this.nome+" de RA nº "+this.ra+" emprestou um livro");
	}
	
	public void notas() {
		System.out.println("O Aluno "+this.nome+" de RA nº "+this.ra+" consultou sua nota");
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
