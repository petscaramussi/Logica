package fatecalgoritmos;
import java.util.*;
public class Ex1{
    public static void main(String[] args) {
        Scanner Entrada = new Scanner(System.in);
        //variaveis
        int placa;
        int dia;
        //entradas
        System.out.println("Insira o numero da placa: ");
        placa = Entrada.nextInt();
        System.out.println("Insira o dia: ");
        dia = Entrada.nextInt();
        //algoritmo
        if(dia == 31){
            System.out.println("pode circular");
        }else if(placa%2 == 0 && dia%2 == 0){
            System.out.println("pode circular");
        }else if(placa%2 != 0 && dia%2 != 0){
            System.out.println("pode circular");
        }else{
            System.out.println("não pode circular");
        }
        
        
        
    }
}
