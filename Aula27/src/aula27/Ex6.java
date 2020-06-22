
package aula27;
import javax.swing.JOptionPane;


public class Ex6 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        int[] numeros2 = new int[10];
        
        for (int i = 0; i < 10; i++) {
            numeros[i] = Integer.parseInt(JOptionPane.showInputDialog("digite um numero: "));
            numeros2[i] = numeros[i] * 5;
        }
        
        for(int b = 0; b < 10; b++){
            System.out.println(numeros[b]+ numeros2[b]);
            
        
        }
    }
}
