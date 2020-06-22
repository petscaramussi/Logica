package fatecalgoritmos;
import java.util.*;
public class Ex5 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //variaveis
        int numTabuada;
        int result;
        //entrada
        numTabuada = Entrada.nextInt();
        //algoritmo
        for(int i = 0; i <= 10;i++ ){
            result = numTabuada * i;
            System.out.println(result);
        }
    }
}
