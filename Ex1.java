import java.util.Scanner;

class Ex1 {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite o número da matricula: ");
    int matricula = leitor.nextInt();

    leitor.nextLine(); // inserido para a quebra de linha dependente.

    System.out.println("Nome do Aluno: ");
    String nome = leitor.nextLine();

    System.out.println("Digite a nota A: ");
    double a = leitor.nextDouble();

    System.out.println("Digite a nota B: ");
    double b = leitor.nextDouble();

    double resultado = (a + b) / 2;
    String situacao;

    if (resultado >= 6) {
      situacao = "Aprovado";
    } else {
      situacao = "Reprovado";
    }

    System.out.println("\nMatricula: " + matricula + "\nNome do aluno(a):" + nome + "\nSituação: " + situacao
        + "\nNota final: " + resultado);

    leitor.close();
  }
}