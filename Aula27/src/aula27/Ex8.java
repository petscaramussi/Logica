package aula27;
import javax.swing.JOptionPane;
public class Ex8 {
    public static void main(String[] args) {
        double horas, minutos, valor;
    
        minutos = Double.parseDouble(JOptionPane.showInputDialog("Informe os minutos"));
        horas = minutos/ 60;
        
        if(minutos <= 15){
        valor = 0;
        JOptionPane.showMessageDialog(null, "tempor estacionado: " + minutos + " total a pagar: R$" + valor);
        }
        
        if(minutos > 15 && minutos < 600){
        valor = horas * 3;
        JOptionPane.showMessageDialog(null, "tempor estacionado: " + minutos + " total a pagar: R$" + valor);
        }
        
        if(minutos >= 600){
        valor = 30;
        JOptionPane.showMessageDialog(null, "tempor estacionado: " + minutos + " total a pagar: R$" + valor);
        }
    }
    
    
}
