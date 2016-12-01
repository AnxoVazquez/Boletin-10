/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin10_1;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author avazquezsuarez
 */
public class Boletin10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int jugador1, jugador2 = 0;
        int intentos=0;
        int num =  (int) (Math.random() *10 + 1);
        
        intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero de intentos"));
        
        for(int i=0; i<=intentos;i++){
            jugador1= Integer.parseInt(JOptionPane.showInputDialog("Introduzca porfavor el numero que cree que es"));
            if (num== jugador1) {
                JOptionPane.showMessageDialog(null,"felicidades, ha ganado");
                break;
            }
            else{
                JOptionPane.showMessageDialog(null,"El numero secreto es mayor");
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }
        }
    }
    
}
