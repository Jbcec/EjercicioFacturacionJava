
package facturacionjava;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Producto {
    //Declaro las variables requeridas y el Scanner para tomar datos desde teclado
    int codigoPr, limiteCod = 1000000;
    String nombrePr;
    float precioPr;
    Scanner entrada = new Scanner (System.in);
    
    //Método para recibir los datos del Producto
    public void prodP(){
        System.out.println("************************************************");
        System.out.println();
        System.out.println("Ingrese el Código del Poducto: ");
        codigoPr = entrada.nextInt();
        if(codigoPr > limiteCod){
        System.out.println("Código no valido");
        System.exit(0);
        }
        System.out.println();
        System.out.println("Ingrese el Nombre del Poducto: ");
        nombrePr = entrada.next();
        System.out.println();
        System.out.println("Ingrese el Precio del Poducto: ");
        precioPr = entrada.nextFloat();
        System.out.println("************************************************");
        
        
        
    }
    
}
