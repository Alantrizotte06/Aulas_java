import java.util.Scanner;

class Console {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    System.out.println("Digite a nota A: ");
    int a = leitor.nextInt();

    System.out.println("Digite a nota B: ");
    int b = leitor.nextInt();

    int resultado = a + b;
    System.out.println("Resultado: " + resultado);

    // System.out.println("Digite um texto: ");
    // String mensagem = leitor.nextLine();
    // System.out.println(mensagem);
    // println
    // printf

    leitor.close();
  }
}