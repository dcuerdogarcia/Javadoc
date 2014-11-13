/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg9.pkg3;
import javax.swing.JOptionPane;
/**
 *
 * @author dcuerdogarcia
 */
public class Metodos {
   
    public Metodos(){
    float base, altura;
    
    ValidarDatos valido = new ValidarDatos();   
    
    String dato1 = JOptionPane.showInputDialog("Introduce a base dun triangulo ");
        base = Float.parseFloat(dato1);
        float base2 = valido.ValidarDatos(base);
        
        String dato2 = JOptionPane.showInputDialog("Introduce a altura do triangulo ");
        altura = Float.parseFloat(dato2);
        float altura2 = valido.ValidarDatos(altura);
        
        JOptionPane.showMessageDialog(null, "A area do triangulo de base " + base2 + " e altura " + altura2 + " é de " + ((base2*altura2)/2) + "m^2");
    }
    
}