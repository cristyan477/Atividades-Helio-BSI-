/*
 VAR
 
real valorTotal, valorRestante, valorFelipe
inteiro valorCarlosAndre
cadeia:REAL
    
INICIO    
  escreva("Digite o valor total da conta: ")
    
converter o valor total para real
  valorTotal <- real(input)
    
calcular a parte que Carlos e Andre devem pagar
  valorCarlosAndre <- inteiro(valorTotal / 3)  // Divisão inteira
    
calcular o valor restante para Felipe
  valorRestante <- valorTotal - (valorCarlosAndre * 2)  // Subtrair a parte que Carlos e Andre pagam
  valorFelipe <- valorRestante  // Felipe paga o restante
    
Se (valor_total for maior que -1)
    escreva("Carlos deve pagar R$ ", valorCarlosAndre, ",00.\n")
    escreva("Andre deve pagar R$ ", valorCarlosAndre, ",00.\n")
    escreva("Felipe deve pagar R$ ", valorFelipe, ".\n")
se não
    escreva("Valor invalido")


fim


TESTE DE MESA

TOTAL / CARLOS / ANDRE / FELIPE / IF / ELSE / IMPRIMIR
10.67    3.00     3.00    4.67     V     -       V
-1        -        -       -       -     F       F 
100      33.00    33.00   34.00     V    -       V 


 */

package com.mycompany.atividade_q1;
import javax.swing.JOptionPane;
        
public class Atividade_Q1 {

    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Digite o valor total da conta:");
        double valorTotal = Double.parseDouble(input);
        
        
        int valorCarlosAndre = (int) (valorTotal / 3);  
        
        double valorRestante = valorTotal - (valorCarlosAndre * 2);  
        
        double valorFelipe = valorRestante;
        
        if (valorTotal > -1){
        JOptionPane.showMessageDialog(null, 
            "Carlos deve pagar R$ " + valorCarlosAndre + ",00.\n" + 
            "Andre deve pagar R$ " + valorCarlosAndre + ",00.\n" + 
            "Felipe deve pagar R$ " + String.format("%.2f", valorFelipe) + ".");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Valor invalido");
        }
    
    }
}