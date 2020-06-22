
package desafio;
import java.text.DecimalFormat;
import java.util.*;
public class Desafio {

    public static void main(String[] args) {
        //instancia para usar a entrada do teclado
        Scanner Entrada = new Scanner(System.in);
        //instancia para usar só duas casas decimais
        DecimalFormat df = new DecimalFormat("###,##0.00");
        
        //variaveis auxiliares
        String nome = "";
        double menor = 10000;
        //vetor com a primeira letra do nome dos carros
        String cars[];
        cars = new String[5];
        //Vetor com o nome completo dos carros
        String aux[];
        aux = new String[5];
        //vetor para armazenar os Km/L
        double kmpl[];
        kmpl = new double[5];
        
        double milkm[];
        milkm = new double[5];
        
        
        
        System.out.println("Digite o nome de 5 carros");
        
        for(int i = 0; i < 5; i++){
            aux[i] = Entrada.next();
            cars[i] = aux[i].substring(0, 1);
           
        }
        for (int j = 0; j < 5; j++) {
            System.out.println("O " + aux[j] + " faz quantos KM com 1 litro de combustivel?");
            kmpl[j] = Entrada.nextDouble();
        }
        
        for (int k = 0; k < 5; k++) {
            if(kmpl[k] < menor){
                menor = kmpl[k];
                nome = aux[k];
            }
        }
        
        
        
        System.out.println("Carro mais economico: "+ nome);
        for (int l = 0; l < 5; l++) {
            milkm[l] = 1000 / kmpl[l];
            System.out.println("O " + aux[l] + " faz 1000KM com: " + df.format(milkm[l]) + " litros de combustivel");
        }
        
        
    }
    
}
