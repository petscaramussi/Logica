
package aula27;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //variaveis
        int num1, num2, num3, num4, num5;
        
        System.out.println("digite 5 numeros par a somatoria: ");
        num1 = Entrada.nextInt();
        num2 = Entrada.nextInt();
        num3 = Entrada.nextInt();
        num4 = Entrada.nextInt();
        num5 = Entrada.nextInt();
        
        int soma = num1 + num2 + num3 + num4 + num5;
        
        System.out.println("soma : " + soma);
        System.out.println("numeros digitados: " +  num1 + " | " +  num2 + " | " + num3 + " | " + num4 + " | " + num5);
        
    }
}
