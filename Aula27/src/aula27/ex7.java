package aula27;
import java.util.Arrays;
import javax.swing.JOptionPane;
public class ex7 {
    public static void main(String[] args) {
        int[] vetor1 = new int[5];
        int[] vetor2 = new int[5];
        
        for(int i = 0; i < 5; i++) {
            vetor2[i] = vetor1[i];
        }
        JOptionPane.showInputDialog(null, Arrays.toString(vetor2));
    }
}
