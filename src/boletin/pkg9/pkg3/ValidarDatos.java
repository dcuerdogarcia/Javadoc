/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg3;

/**
 *
 * @author dcuerdogarcia
 */
import javax.swing.JOptionPane;

public class ValidarDatos {
    
    public ValidarDatos(){
    }
    
    public float ValidarDatos(float valor){
        if(valor>0){
           return valor;
        }else{
            String dato = JOptionPane.showInputDialog("O valor introducido é incorecto, introduzca un valor corecto");
            float dato1 = Float.parseFloat(dato);
            if(dato1>0){
                JOptionPane.showMessageDialog(null, "Este valor si é corecto");
                return dato1;
            }else{
                while(dato1<=0){
                    String dato2 = JOptionPane.showInputDialog("Introduzca un dato valido");
                    dato1 = Float.parseFloat(dato2);
                }
                return dato1;
            }
        }
    }
}