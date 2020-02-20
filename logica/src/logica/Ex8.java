package logica;
import java.util.Scanner;
import java.text.DecimalFormat; 

public class Ex8 {
    public static void main(String[] args) {
        //instancias
        Scanner entrada = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###.00");
        
        //variaveis
        double brancos, nulos, validos, total;
    
        
        //obtenção de valores
        System.out.println("Votos Validos:");
        validos = entrada.nextInt();
        System.out.println("Votos Brancos:");
        brancos = entrada.nextInt();
        System.out.println("Votos Nulos:");
        nulos = entrada.nextInt();
        
        
        
        //calculo de total
        total = validos + brancos + nulos;
        System.out.println("Total:");
        System.out.println(total);
        
        
        
        //calculo de porcentagem
        brancos = (brancos * 100) / total;
        System.out.println("Brancos:");
        System.out.println(df.format(brancos) + "%");
        
        nulos = (nulos * 100) / total;
        System.out.println("Nulos:");
        System.out.println(df.format(nulos) + "%");
        
        validos = (validos * 100) / total;
        System.out.println("Validos:");
        System.out.println(df.format(validos) + "%");
        
        
                
        
              
        
        
        
    }
 
}
