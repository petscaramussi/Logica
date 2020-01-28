package logica;
import java.util.*;
public class Ex6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variaveis
        int H;
        int b;
        //Obter os valores
        System.out.println("Altura(cm): ");
        H = entrada.nextInt();
        System.out.println("Base(cm): ");
        b = entrada.nextInt();
        //calculo
        H = H * b;
        System.out.println("Resultado: \n" + H + "cm");
        
    }
}
