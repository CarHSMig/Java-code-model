import java.util.Scanner;

public class Atividade41 {
    public static void main(String[] args) {

        Scanner idades = new Scanner(System.in);

        System.out.println("Informe a sua idade:");
        int idade = idades.nextInt();

        if (idade >= 18){
            System.out.println("Você é maior de idade!");}
        else{
            System.out.println("Você é menor de idade !");}


    }

}
