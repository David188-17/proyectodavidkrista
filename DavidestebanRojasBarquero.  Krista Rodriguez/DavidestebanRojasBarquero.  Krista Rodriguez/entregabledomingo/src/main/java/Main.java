
import javax.swing.JOptionPane;




public class Main {

    
    public static void main(String[] args) {
       
        cliente Cliente=new cliente();
        Cliente.datos();
        
        
        
        pizza Pizza=new pizza();
       Pizza.especificarTamArregloPiza();
        Pizza.determinarPreciopizza();
    
     bebidas Bebida=new bebidas();
     Bebida.especificarTamArreglobebida();
     Bebida.determinarPreciobebida();
    
    lasaña Lasaña=new lasaña();
    Lasaña.especificarTamArreglolasaña();
     Lasaña.determinarPreciolasaña();
    
     
     
     
     
    int montototall=Pizza.montopizza+Bebida.montobebida+Lasaña.montolasaña;
    String nombresclientes=Cliente.nombrecliente;
    int numerosdecelular=Cliente.numerocliente;
    int numeroscedula=Cliente.numerocedula;
    int option=0; String op=" ";

    
    op=JOptionPane.showInputDialog("SELECCIONAR UNA OPCION: \n"
+ "\n 1.- no desea servicio express"
+ "\n2.- si desea servicio express");

option=Integer.parseInt(op);
switch(option){
case 1:  JOptionPane.showMessageDialog(null,"pizza fide estimado:\n "+Cliente.nombrecliente+"\n"+Cliente.numerocliente+"\n"+Cliente.numerocedula+"\n"
        +Pizza.montopizza+"\nel monto por la bebida es: "+Bebida.montobebida+
            "\nel monto a pagar por la lasaña es:  "+Lasaña.montolasaña+ "\nel monto a pagar por todo es de  "+montototall); break;

case 2: servicioexpress Servicioexpress=new servicioexpress();
           Servicioexpress.cobro(); 
            int montototal=Pizza.montopizza+Servicioexpress.montoexpress+Bebida.montobebida+Lasaña.montolasaña;
    JOptionPane.showMessageDialog(null,"pizza fide estimado:\n "+Cliente.nombrecliente+"\ncon el numero "+Cliente.numerocliente+"\ncon el numero de cedula"+Cliente.numerocedula+"\n"+
            Pizza.montopizza+"\nel monto por la bebida es: "+Bebida.montobebida+
            "\nel monto a pagar por la lasaña es:  "+Lasaña.montolasaña+"\nel monto a pagar por el servicio express es de (si no requirio servicio express su monto sera de 0):  "+Servicioexpress.montoexpress+
    "\nel monto a pagar por todo es de  "+montototal); break;

    
    
    
     
    
    
    
    
    
    
    
    
    
    
    }
    
}
        }