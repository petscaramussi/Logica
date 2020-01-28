package logica;
import java.util.*;
public class Ex5 {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        //variaveis
        int num;
        int n;
        //pedido de núnemero
        System.out.println("Digite um numero: ");
        n = entrada.nextInt();
        //calculo de antecessor
        n = n - 1;
        //mostrar resultado
        System.out.println("Antecessor: " + "\n" + n);
        
    }
}
