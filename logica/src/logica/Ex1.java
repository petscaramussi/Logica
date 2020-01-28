package logica;
public class Ex1 {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //variavel criada para armazenar o valor de B para usa-lo ápos a operação
        int amzn;
        amzn = b;
        //operação de troca
        b = a;
        a = amzn;
        //monstrar valores finais
        System.out.println("A = " + a + " B = " + b);
    }
    
}
