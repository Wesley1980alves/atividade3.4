package projetoEscolar;

import java.util.Scanner;

public class ConceitoMedio {

	public static void main(String[] args) {
		double nota, nota2, nota3;
		double notaMedia = 0;
		NotasAlunos valor = new NotasAlunos();
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite notas do aluno ");
		nota = entrada.nextDouble();
		nota2 = entrada.nextDouble();
		nota3 = entrada.nextDouble();

		// chamar metodo
		valor.mediaAluno(nota, nota2, nota3);
		System.out.println("media aluno" + valor.notaMedia);
		if (valor.notaMedia > 8.0) {
			System.out.println("Aluno teve conceito A: PARABENS");
		}
		if (valor.notaMedia >= 7.1 && notaMedia <= 8.0) {
			System.out.println("Aluno teve conceito B: PARABENS");
		}
		if (valor.notaMedia >= 6.1 && notaMedia <= 7.0) {
			System.out.println("Aluno teve conceito C :PARABENS, ESTUDE MAIS UM POUCO , VOCE PODE MELHORAR ");
		}
		if (valor.notaMedia == 6.0) {
			System.out.println("Aluno teve conceito D: PARABENS , MAIS VOCE PRECISA ESTUDAR MAIS ");

		}
		if (valor.notaMedia < 6.0) {
			System.out.println("Nao a conceito , sua nota foi baixa demais, procure estudar mais um pouco.");
		}

	}

}
