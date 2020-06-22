package aula27;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        String[] nomes = new String[5];
        
        for(int i = 0 ; i < 5 ; i++){
            System.out.println("Digite um nome: ");
            nomes[i] = Entrada.next();
        }
        System.out.println("nomes digitados: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(nomes[i]);
        }
        
        System.out.println("nomes digitados invertidos: ");
        for (int i = 4; i > -1; i--) {
            System.out.println(nomes[i]);
        }
        
        
        
        
        
        
    }
  
}
