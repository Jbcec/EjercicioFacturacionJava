/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facturacionjava;
import javax.swing.JOptionPane;

/**
 *
 * @author juanb
 */
public class FacturacionJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creo un nuevo objeto de la clase Factura
        Factura nuevafactura = new Factura();
        //Llamo al método NuevaFactura
        nuevafactura.NuevaFactura();
        
        //Imprimo por consola la factura finalizada
        System.out.println("************************************************");
        System.out.println("FACTURA");
        System.out.println("************************************************");
        System.out.println();
        System.out.println("Número de factura: "+nuevafactura.nroFact+"       "+"Código de factura: "+nuevafactura.codFact);

        System.out.println();
        System.out.println("Categoría :"+nuevafactura.Letra+"       "+"Condición Impositiva: "+nuevafactura.clienteFact.condimpositiva);
        System.out.println();
        System.out.println("Número Cliente: "+nuevafactura.clienteFact.nroCliente);
        System.out.println();
        System.out.println("Tipo Documento: "+nuevafactura.clienteFact.tipoDocumento+"       "+"Número Documento Cliente: "+nuevafactura.clienteFact.nroDocumento);
        System.out.println();
        System.out.println("Domicilio Cliente: "+nuevafactura.clienteFact.domicilioCalle+"  "+nuevafactura.clienteFact.domicilioNro);
        System.out.println();
        System.out.println("Nombre Producto: "+nuevafactura.productoFact.nombrePr+"       "+"Código Producto:"+nuevafactura.productoFact.codigoPr);
        System.out.println();
        System.out.println("Precio producto:$"+nuevafactura.productoFact.precioPr);
        System.out.println();
        System.out.println("Precio unitario:$"+nuevafactura.precioUnitario);
        System.out.println();
        System.out.println("% IVA: "+nuevafactura.montoIva);
        System.out.println();
        System.out.println("Cantidad: "+nuevafactura.cantidad);
        System.out.println();
        System.out.println("Precio de venta: "+nuevafactura.precioVenta);
        System.out.println();
        System.out.println("Precio neto: "+nuevafactura.precioNeto);
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("TOTAL (sin IVA): $"+nuevafactura.total);
        System.out.println();
        System.out.println("TOTAL (con IVA): $"+nuevafactura.totalIva);
        
    }
    
}
