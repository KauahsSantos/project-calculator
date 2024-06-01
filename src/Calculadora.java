import java.util.*;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        
        Scanner sc1 = new Scanner(System.in);
        
        int n1;
        int n2;
        
        System.out.println("Digite um número");
        n1 = sc1.nextInt();
        
        System.out.println("Digite outro número");
        n2 = sc1.nextInt();
        
        int n3 = n1 + n2;

        System.out.println(n3);
    }
}
