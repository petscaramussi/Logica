//
package aula27;
import java.util.*;
public class Ex3 {
    

    
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        double chop = 2.50;
        double aperitivo = 27;
        double adicionais = 1.50;
        //variaveis
        int pessoas;
        int qtdechop;
        int qtdeape;
        int qtdeadd;
        String pagamento;
        //entradas
        System.out.println("quantidade de pessoas:");
        pessoas = Entrada.nextInt();
        System.out.println("Chops:");
        qtdechop = Entrada.nextInt();
        System.out.println("Aperitivos");
        qtdeape = Entrada.nextInt();
        System.out.println("Adicionais");
        qtdeadd = Entrada.nextInt();
        System.out.println("opcão de pagamento (cartao, cheque, a vista)");
        pagamento = Entrada.next();
        //total de cada produto
        double totalChop = qtdechop * chop;
        double totalAperitivos = qtdeape * aperitivo;
        double totalAdicionais = qtdeadd * adicionais;
        double total = totalChop + totalAperitivos + totalAdicionais;
        double garcon = total * 0.10;
        double totalPPessoa;
        
        if("cartao".equals(pagamento)){
            total = (total * 0.90) + garcon;
            totalPPessoa = total / pessoas;
            System.out.println("R$ " + totalPPessoa + " por pessoa.");
        }
        if("vista".equals(pagamento)){
            total = (total * 0.80) + garcon;
            totalPPessoa = total / pessoas;
            System.out.println("R$ " + totalPPessoa + " por pessoa.");
            
        }
        if("cheque".equals(pagamento)){
            total = total + garcon;
            totalPPessoa = total / pessoas;
            System.out.println("R$ " + totalPPessoa + " por pessoa.");
        }
        
        
        
        
        
        
         
    }
    
}
