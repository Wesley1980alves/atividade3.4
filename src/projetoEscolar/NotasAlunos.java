package projetoEscolar;

public class NotasAlunos {
	//atributos
	 double nota,nota2,nota3;
	 double notaMedia;
	//metodos
	public int mediaAluno(double nota,double nota2, double nota3) {
		this.notaMedia=(nota+nota2+nota3)/3;
		return (int) notaMedia;		
		
	}
}
