import java.util.Scanner;
public class Exercicio3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = in.next();

        System.out.println("Insira sua idade: ");
        int idade = in.nextInt();

        System.out.println("Olá " +  nome + "Sua idade é de: " + idade);

    }
}