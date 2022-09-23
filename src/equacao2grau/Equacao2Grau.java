//teste realizado com 2,0 e -4
package equacao2grau;

import java.util.Scanner;

public class Equacao2Grau {
    
    private static double calcularDelta(int a, int b, int c) throws IllegalArgumentException{
        double delta = Math.pow(b,2) - 4*a*c;
        if (delta<0) {
            throw new IllegalArgumentException("Delta é: "+delta+"\nNão existem raízes reais.");
        }
        return delta;
    }
    
    public static void main(String[] args)
    {
        int a, b, c;
        double x1, x2, delta;
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Informe o valor de A: ");
        a = scanner.nextInt();
        
        System.out.println("Informe o valor de B: ");
        b = scanner.nextInt();
        
        System.out.println("Informe o valor de C: ");
        c = scanner.nextInt();
        
       delta = calcularDelta(a,b,c);
        
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        
        System.out.println("O valor de Delta e: " + delta);
        System.out.println("O valor de x1 e: " + x1);
        System.out.println("O valor de x2 e: " + x2);
    }
    
}
