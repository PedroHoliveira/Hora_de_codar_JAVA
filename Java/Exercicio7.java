import java.util.Scanner;
public class Exercicio7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe 3 valores diferentes para analise: ");

        int valor1 = in.nextInt();
        int valor2 = in.nextInt();
        int valor3 = in.nextInt();

        if (valor1 == valor2)
        {
            System.out.println("Insira um novo valor para 2: ");
            valor2 = in.nextInt();
        }
        if (valor1 == valor3)
        {
            System.out.println("Insira um novo valor para 3: ");
            valor3 = in.nextInt();
        }
        if (valor2 == valor3) {
            System.out.println("Insira um novo valor para 3: ");
            valor3 = in.nextInt();
        }

        if (valor1 < valor2 && valor1 < valor3)
        {
            System.out.println("A soma dos maiores valor e de: " + (valor2 + valor3));
        }
        else if (valor2 < valor1 && valor2 < valor3)
        {
            System.out.println("A soma dos maiores valor e de: " + (valor1 + valor3));
        }
        else if (valor3 < valor1 && valor3 < valor2)
        {
            System.out.println("A soma dos maiores valor e de: " + (valor1 + valor2));
        }

    }
}