import java.util.Scanner;
public class Exercicio4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //CALCULO RETANGULO
        System.out.println("Calculo da area do retangulo");

        System.out.println("Informe a base do retangulo: ");
        int base_retangulo = in.nextInt();

        System.out.println("Informe a altura do retangulo: ");
        int altura_retangulo = in.nextInt();

        int area_retangulo = base_retangulo * altura_retangulo;

        System.out.println("O resultado da area é de " + area_retangulo);
        System.out.println();

        //CALCULO QUADRADO

        System.out.println("Calculo da area do quadrado");

        System.out.println("Informe o lado do quadrado: ");
        int lado_quadrado = in.nextInt();

        int area_quadrado = lado_quadrado * lado_quadrado;
        System.out.println("O resultado da area é de " + area_quadrado);
        System.out.println();

        //CALCULO LOSANGO

        System.out.println("Calculo da area do losango");

        System.out.println("Informe a diagonal maior do losango: ");
        int diag_maior = in.nextInt();

        System.out.println("Informe a diagonal menor: ");
        int diag_menor = in.nextInt();

        int area_losango = (diag_maior * diag_menor) / 2;

        System.out.println("A area do losango é de : " + area_losango);
        System.out.println();

        //CALCULO TRAPEZIO

        System.out.println("Calculo da area do Trapezio");
        System.out.println("Informe a base maior do trapezio: ");
        int base_maior = in.nextInt();

        System.out.println("Informe a base menor do trapezio: ");
        int base_menor = in.nextInt();

        System.out.println("Informe a altura do trapezio: ");
        int altura_trapezio = in.nextInt();

        int area_trapezio = ((base_maior + base_menor) * altura_trapezio) / 2;

        System.out.println("A area do trapezio é de : " + area_trapezio);
        System.out.println();

        //CALCULO PARALELOGRAM0

        System.out.println("Calculo da area do Paralelogramo");
        System.out.println("Informe a base: ");
        int base_paralelogramo = in.nextInt();

        System.out.println("Informe a altura: ");
        int altura_paralelogramo = in.nextInt();

        int area_paralelogramo = base_paralelogramo * altura_paralelogramo;

        System.out.println("A area do paralelogramo é de : " + area_paralelogramo);
        System.out.println();

        //CALCULO TRIANGULO

        System.out.println("Calculo da area do triangulo");
        System.out.println("Informe a base: ");
        int base_triangulo = in.nextInt();

        System.out.println("Informe a altura: ");
        int altura_triangulo = in.nextInt();

        int area_triangulo = (base_triangulo * altura_triangulo) / 2;

        System.out.println("A area do trinagulo é de : " + area_triangulo);
        System.out.println();

        //CALCULO CIRCULO

        System.out.println("Calculo da area do Circulo");
        System.out.println("Informe o raio do circulo: ");
        int raio = in.nextInt();
        double pi = 3.14;

        double area_circulo = pi * (raio * raio);

        System.out.println("A area do circulo é de : " + area_circulo);
        System.out.println();

    }
}
