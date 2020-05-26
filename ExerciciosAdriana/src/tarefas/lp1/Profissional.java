package tarefas.lp1;

public class Profissional {
	
	private String profissao;
	private int salario;
	private String especializacao;
	
	public void trabalhou() {
		System.out.println("O profissional trabalhou hoje");
	}
	
	public void pagamento() {
		System.out.println("O profissional foi pago hoje");
	}
	
	public void demissao() {
		System.out.println("O profissional foi demitido hoje");
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getSalario() {
		return salario;
	}

	public void setSalario(int salario) {
		this.salario = salario;
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
	
	

}