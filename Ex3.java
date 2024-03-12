import java.util.Scanner;

public class Ex3 {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int[] nota = new int[5];

    System.out.println("Digite a Matricula: ");
    String matricula = leitor.nextLine();

    System.out.println("Digite o nome: ");
    String nome = leitor.nextLine();

    for (int cont = 0; cont < 5; cont++) {

      if (nota[cont] < 0 || nota[cont] > 10) {
        System.out.println("A nota não pode ser menor que 0 ou maior que 10.\n");
      } else {
        System.out.println("Digite a nota " + (cont + 1) + ":");
        nota[cont] = leitor.nextInt();
      }
    }

    System.out.println("\nMatricula: " + matricula + "\nNome: " + nome);

    for (int cont = 0; cont < 5; cont++) {
      System.out.println("Nota " + (cont + 1) + ": " + nota[cont]);
    }

    // for (int cont = 0; cont < 5; cont++) {
    // System.out.println("\nMatricula: " + matricula + "\nNome: " + nome + "\nNota
    // " + (cont + 1) + ": " + nota[cont]);
    // } Realizado for para repetição não chegamos ao resultado desejado, que seria
    // os dados do aluno e as 5 notas.

    leitor.close();
  }
}
