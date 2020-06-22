package fatecalgoritmos;
import java.util.*;
public class Ex2 {

    public static void main(String[] args) {
       Scanner Entrada = new Scanner(System.in);
       //variaveis 
       int base;
       int altura;
       int result;
       
       //entrada
       System.out.println("Base (cm): ");
       base = Entrada.nextInt();
       System.out.println("Base (cm): ");
       altura = Entrada.nextInt();
       //operação
       result = (base * altura) / 2;
       //saida
        System.out.println(result);
    }
    
}
