import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){

        int n1;
        int n2;
        
        Scanner sc1 = new Scanner(System.in);
        
        System.out.println("Digite um número");
        n1 = sc1.nextInt();
        
        System.out.println("Digite outro número");
        n2 = sc1.nextInt();
        
        int n3 = n1 + n2;

        System.out.println("----------------");

        System.out.println(n3);
    }
}
