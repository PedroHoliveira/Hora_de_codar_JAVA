import java.util.Scanner;
public class Exercicio5 {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("INSIRA UM NUMERO PARA ANALISE");
        int numero = in.nextInt();

        if (numero >= 1 )
        {
            System.out.println("Seu numero e positivo");
        }
        if (numero < 0)
        {
            System.out.println("Seu numero e negativo");
        }
        if (numero == 0)
        {
            System.out.println("Seu numero e 0");
        }
    }
}
