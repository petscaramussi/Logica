package logica;
import java.util.*;
public class Ex7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //variaveis
        int anos;
        int meses;
        int dias;
        //obter idade
        System.out.println("anos: ");
        anos = entrada.nextInt();
        System.out.println("e meses: ");
        meses = entrada.nextInt();
        //tratamento de erros
        while(meses > 11){
            System.out.println("Você só pode ter até 11 meses, após isso é considerado 1 ano. Digite seu mês novamente: ");
            meses = 0;
            meses = entrada.nextInt();
        }
        System.out.println("e dias: ");
        dias = entrada.nextInt();
        //tratamento de erros
        while(dias > 30){
            System.out.println("Você só pode ter até 30 dias, após isso é considerado 1 mes. Digite seus dias novamente: ");
            dias = 0;
            dias = entrada.nextInt();
        }
        //calculos
         anos = anos * 365;
         meses = meses * 30;
         dias = dias + meses + anos;
        //mostrar resultado
        System.out.println("sua idade em DIAS:");
        System.out.println(dias);
        
    }
}
