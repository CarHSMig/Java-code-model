import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int vetor[] = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {

            System.out.println("Informe o seu salário:");
            vetor[i] = scanner.nextInt();
        }

    }
}
