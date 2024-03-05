import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) {

    Scanner aluno = new Scanner(System.in);

    System.out.println("Digite o número da matricula: ");
    int matricula = aluno.nextInt();

    aluno.nextLine(); // inserido para a quebra de linha dependente.

    System.out.println("Nome do Aluno: ");
    String nome = aluno.nextLine();

    System.out.println("Digite a nota A: ");
    double a = aluno.nextDouble();

    System.out.println("Digite a nota B: ");
    double b = aluno.nextDouble();

    double resultado = (a + b) / 2;
    String situacao;

    if (resultado >= 6) {
      situacao = "Aprovado";
    } else {
      situacao = "Reprovado";
    }

    System.out.println("\nMatricula: " + matricula + "\nNome do aluno(a):" + nome + "\nSituação: " + situacao
        + "\nNota final: " + resultado);

    aluno.close();
  }
}