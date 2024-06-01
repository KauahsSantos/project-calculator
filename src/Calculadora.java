import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){

        int n1;
        int n2;
        int n3;
        int n4;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Digite um número");
        n1 = sc1.nextInt();

        System.out.println("");
        
        System.out.println("Digite outro número");
        n2 = sc1.nextInt();

        System.out.println("");

        System.out.println("----------------");
        System.out.println("1 | Soma");
        System.out.println("2 | Subtração");
        System.out.println("3 | Multiplicação");
        System.out.println("4 | Divisão");
        System.out.println("----------------");
        n3 = sc1.nextInt();

        System.out.println("");

        if(n3 == 1){
            n4 = n1 + n2;

            System.out.println("A soma de: " + n1 + " + " + n2 + " = " + n4);

        }if (n3 == 2) {
            n4 = n1 - n2;

            System.out.println("A subtração de: " + n1 + " - " + n2 + " = " + n4);
        }if (n3 == 3){
            n4 = n1 * n2;

            System.out.println("A multiplicação de: " + n1 + " * " + n2 + " = " + n4);
        }if (n3 == 4){
            n4 = n1 / n2;

            System.out.println("A multiplicação de: " + n1 + " / " + n2 + " = " + n4);
        }

    }
}
