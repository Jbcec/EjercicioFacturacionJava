
package facturacionjava;
import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Cliente {
    
    //Declaro las variables requeridas y el Scanner para tomar datos desde teclado
    int nroCliente, nroDocumento, opcionDocumento, domicilioNro;
    /*Los limites fueron fijados a ojo para evitar, en lo posible, que se ingresen números
    muy extensos en esas variables. El limite de DNI está en el primer número de nueve dígitos,
    el del número de domicilio está basado en la altura máxima de Avenida Rivadavia.*/
    int limiteDni = 100000000, limiteDomicilio = 28000;  
    String domicilioCalle, tipoDocumento, condimpositiva;
    Scanner entrada = new Scanner (System.in);
    
    //Método para recibir los datos del Cliente
    public void nroC(){
        System.out.println("************************************************");
        System.out.println("Ingrese el Número de Cliente: ");
        nroCliente = entrada.nextInt();
        System.out.println();
        System.out.println("Seleccione el Tipo de Documento del Cliente: 1- DNI, 2- CUIT ");
        System.out.println();
        System.out.println("1- DNI");
        System.out.println();
        System.out.println("2- CUIT");
        opcionDocumento = entrada.nextInt();
        if(opcionDocumento == 1){
            tipoDocumento = "DNI";
        }
        if(opcionDocumento == 2){
            tipoDocumento = "CUIT";
        }
        if(opcionDocumento > 2){
            System.out.println("Opcion invalida");
        }
        System.out.println();
        System.out.println("Ingrese el Número de "+tipoDocumento);
        nroDocumento = entrada.nextInt();
        if((opcionDocumento == 1) && (nroDocumento > limiteDni)){
        System.out.println("Código no valido");
        System.exit(0);
        }
        System.out.println();
        System.out.print("Ingrese la calle del domicilio del Cliente: ");
        domicilioCalle = entrada.next();
        System.out.println();
        System.out.print("Ingrese el número del domicilio del Cliente: ");
        domicilioNro = entrada.nextInt();
        System.out.println();
        if(domicilioNro > limiteDomicilio){
        System.out.println("Entrada no valida");
        System.exit(0);
        }
        System.out.println();
        System.out.println("Seleccione Condicion Impositiva:");
        System.out.println();
        System.out.println("1- IVA Responsable Inscripto");
        System.out.println();
        System.out.println("2- Monotributista");
        System.out.println();
        System.out.println("3- IVA No Inscripto");
        condimpositiva = entrada.next();
        //Switch que ya asocia la condición impositva con la "Letra" a mostar en la factura
        switch(condimpositiva){
            
            case "1": Factura.Letra = 'A';
                    condimpositiva = "IVA Responsable Inscripto";
            break;
            case "2": Factura.Letra = 'B';
                    condimpositiva = "Monotributista";
            break;
            case "3": Factura.Letra = 'X';
                    condimpositiva = "IVA No Inscripto";
            break;
            default: System.out.println("Opcion no valida");
                     System.exit(0);
            break;
        }
        System.out.println("************************************************");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }       

}
