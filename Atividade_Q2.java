/*
 VAR







 */

package com.mycompany.atividade_q2;
import javax.swing.JOptionPane;

public class Atividade_Q2 {

    public static void main(String[] args) {
        Double pesoQporS,
        String input = JOptionPane.showInputDialog("Informe a quantidade de sanduíches a fazer:");
        int quantidadeSanduiches = Integer.parseInt(input); 

        
        pesoQueijoPorSanduiche = 2 * 50; 
        pesoPresuntoPorSanduiche = 1 * 50; 
        pesoHamburguerPorSanduiche = 1 * 100; 

        
        totalQueijo = pesoQueijoPorSanduiche * quantidadeSanduiches; 
        totalPresunto = pesoPresuntoPorSanduiche * quantidadeSanduiches; 
        totalHamburguer = pesoHamburguerPorSanduiche * quantidadeSanduiches; 

        
        totalQueijoKg = totalQueijo / 1000.0;
        totalPresuntoKg = totalPresunto / 1000.0;
        totalHamburguerKg = totalHamburguer / 1000.0;

        
        String resultado = "Para " + quantidadeSanduiches + " sanduíches, você precisará de:\n"
                + "Queijo: " + totalQueijoKg + " kg\n"
                + "Presunto: " + totalPresuntoKg + " kg\n"
                + "Hambúrguer: " + totalHamburguerKg + " kg";

        
        JOptionPane.showMessageDialog(null, resultado);
    }
}
    

