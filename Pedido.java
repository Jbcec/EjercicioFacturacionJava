/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionjava;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class Pedido {
    
    //Declaro las variables requeridas y el Scanner para tomar datos desde teclado
    static int nuevoPedido;
    int nroPedido = 0;
    private String detallesPedido;
    Scanner entrada = new Scanner (System.in);
    
    /**
     *
     */
    public void nuevoPedido(){
        System.out.println("************************************************");
        System.out.println();
        System.out.println("¿Desea realizar un nuevo pedido?");
        System.out.println();
        System.out.println("1- Si");
        System.out.println("2- No");
        System.out.println();
        nuevoPedido = entrada.nextInt();
        if (nuevoPedido == 1){
            nroPedido++;
        }else{
            System.exit(0);
        }
        System.out.println("************************************************");
        
    }
    
}
