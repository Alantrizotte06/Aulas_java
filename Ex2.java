import java.util.Scanner;

class Ex2 {
  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);

    String[] v1 = new String[5];
    String[] v2 = new String[5];
    double[] v3 = new double[5];
    double[] v4 = new double[5];

    for (int i = 0; i < 5; i++) {
      System.out.println("Nome do Aluno:");
      v1[i] = leitor.nextLine();

      System.out.println("Digite a matricula:");
      v2[i] = leitor.nextLine();

      System.out.println("Digite a nota 1:");
      v3[i] = leitor.nextDouble();

      System.out.println("Digite a nota 2:");
      v4[i] = leitor.nextDouble();

      leitor.nextLine();

      double nf = (v4[i] + v4[i]) / 2;
      String situacao;

      if (nf >= 6) {
        situacao = "Sim";
      } else {
        situacao = "Não";
      }

      System.out
          .println("Aluno:" + v1[i] + "\nMatricula:" + v2[i] + "\nAprovado:" + situacao + "\nNota final:" + nf);
    }

    leitor.close();
  }
}