//Aula 2 Vetores (arrays)

import java.util.Scanner;

class Vetores {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    int[] vetor1 = new int[] { 1, 4, 7, 3, 5 };
    // int varx = vetor1[2]; acessando o valor 7
    int[] vetor2 = new int[5];

    // Repetidores
    System.out.println("Dados do vetor 1:\n");
    for (int i = 0; i < 5; i++) {
      int vlr = vetor1[i];
      System.out.println("Valor: " + vlr);
    }
    // Como não foi definido valores dos vetores é atribuido o valor de 0
    System.out.println("Dados do vetor 2:\n");
    for (int i = 0; i < 5; i++) {
      int vlr = vetor2[i];
      System.out.println("Valor: " + vlr);
    }

    int contador = 0;
    while (contador < 5) {
      System.out.println("Digite o valor: " + (contador + 1));
      // int vlr = leitor.nextInt();
      // vetor2[contador] = vlr;
      // contador++;
      vetor2[contador++] = leitor.nextInt(); // Resumo.
    }

    // Dobrar os valores do vetor 2
    contador = 0;
    do {
      if (vetor2[contador] == 0) {
        System.out.println("O valor da posição um não pode ser zero.");
        break;
      }
      vetor2[contador] = vetor2[contador] * 2;
      contador++;
    } while (contador < vetor2.length);

    System.out.println("O valor do vetor 2 multiplicado:\n");
    for (int i = 0; i < vetor2.length; i++) {
      int vlr = vetor2[i];
      System.out.println("Valor: " + vlr);
    }

    leitor.close();
  }
}