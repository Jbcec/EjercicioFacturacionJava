
package facturacionjava;
import java.util.Date;
import javax.swing.JOptionPane;
import java.io.IOException;
import java.util.Scanner;
import java.text.SimpleDateFormat;
/**
 *
 * @author juanb
 */
public class Factura {

    //Creo nuevos objetos de las clases Cliente, Pedido y Producto
    Cliente clienteFact = new Cliente();
    Pedido pedidoFact = new Pedido();
    Producto productoFact = new Producto();
    //Declaro las variables requeridas y el Scanner para tomar datos desde teclado
    String fechaFact;
    SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
    String montoIva;
    Scanner entrada = new Scanner (System.in);
    int nroFact, codFact, limiteFact = 999999;
    static char Letra;
    short cantidad, limitecantidad = 10000; //limite basado en el supuesto de que el stock de todos los productos sea de 10.000 unidades siempre
    float precioUnitario,iva, precioNeto,precioVenta, total, totalIva;
    
    
    /*Método para creación de una nueva Factura, siguiendo el siguiente orden:
    Datos de Producto
    Datos de Cliente (con esto dos ya se puede calcular el IVA)
    Datos del pedido
    Datos propios de la Factura en si
    Fórmulas para calcular lo requerido en la consigna*/
    
    public void NuevaFactura(){
        
        pedidoFact.nuevoPedido();
        productoFact.prodP();
        System.out.println("************************************************");
        System.out.println("Ingrese Cantidad a comprar: ");
        cantidad = entrada.nextShort();
        if(cantidad > limitecantidad){
        System.out.println("Excede el stock disponible");
        System.exit(0);
        };
        clienteFact.nroC();
        switch (Letra){
            case 'A': iva = 1.105f;
            break;
            case 'B': iva = 1.21f;
            break;
            case 'X': iva = 1.7f;
            break;
        }
        if(Pedido.nuevoPedido == 1){
            nroFact ++;
            codFact ++;
        }
   
        if(Letra == 'A'){
            montoIva = "%10.5";
        }
        if(Letra == 'B'){
            montoIva = "%21";
        }
        if(Letra == 'X'){
            montoIva = "%70";
        }
        precioUnitario = productoFact.precioPr;
        precioNeto = productoFact.precioPr * cantidad;
        precioVenta = precioNeto * iva;
        total = precioNeto;
        totalIva = precioVenta;

    }
    
    
    
}
