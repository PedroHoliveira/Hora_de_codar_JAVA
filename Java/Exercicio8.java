import java.util.Scanner;
public class Exercicio8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("insira 2 valores");
        int valor1 = in.nextInt();
        int valor2 = in.nextInt();

        if (valor2 <= 0){
            System.out.println("Insira o segundo valor novamente");
            valor2 = in.nextInt();
        }

        int divisao = valor1 / valor2;

        System.out.println("A divisao e de: " + divisao);
    }
}