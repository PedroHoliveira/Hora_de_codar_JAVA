import java.util.Scanner;
public class Exercicio6 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe 3 valores diferentes para analise: ");

        double valor1 = in.nextInt();
        double valor2 = in.nextInt();
        double valor3 = in.nextInt();

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
        if (valor2 == valor3)
        {
            System.out.println("Insira um novo valor para 3: ");
            valor3 = in.nextInt();
        }
        if (valor1 > valor2 && valor1 > valor3)
        {
            System.out.println("O maior valor e o primeiro" + valor1);
        }
        if (valor2 > valor1 && valor2 > valor3)
        {
            System.out.println("O maior valor e o segundo" + valor2);
        }
        if (valor3 > valor1 && valor3 > valor2)
        {
            System.out.println("O maior valor e o terceiro" + valor3);
        }
    }
}