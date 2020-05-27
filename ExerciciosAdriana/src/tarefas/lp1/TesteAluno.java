package tarefas.lp1;

public class TesteAluno {

	public static void main(String[] args) {
		AlunoFatec alunoNovo = new AlunoFatec("Alex", "alex@fatec", 123456);
		System.out.println("O aluno "+alunoNovo.getNome()+" Tem o RA de nº"+alunoNovo.getRa()+" e o email"+alunoNovo.getEmail());
		
		AlunoFatec alunoNovo02 = new AlunoFatec(null, null, 0);
		alunoNovo02.setNome("Bia");
		alunoNovo02.setEmail("bia@fatec");
		System.out.println("O aluno "+alunoNovo02.getNome()+" Tem o RA de nº"+alunoNovo02.getRa()+" e o email"+alunoNovo02.getEmail());
		
		alunoNovo.faltas();
		alunoNovo02.notas();
		alunoNovo02.emprestimo();
		
		
	
	}

}
