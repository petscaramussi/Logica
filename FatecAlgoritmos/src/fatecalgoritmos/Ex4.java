package fatecalgoritmos;
import java.util.*;
public class Ex4 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //variaveis
        double altura;
        double kg;
        double resultado;
        //entradas
        System.out.println("Kilos");
        kg = Entrada.nextDouble();
        System.out.println("Metros");
        altura = Entrada.nextDouble();
        //algoritmo
        resultado = kg / (altura * altura);
        //saida
        System.out.println("IMC: " + resultado);
        
    }
}
