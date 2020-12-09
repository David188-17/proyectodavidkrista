
import javax.swing.JOptionPane;


public class lasaña extends arreeglolasaña{
    
 private arreglopizza lasaña[];

    public void especificarTamArreglolasaña() {
          nlasañas = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de lasañas que va a ordenar"));//esta variable la vamos a ingresar en el arreglo para que nos lleve la cantidad de pizzas
        lasaña = new arreglopizza[nlasañas];//este arreglo es para llevar la cantidad de pizzas que el cliente desea
    
    



     saborlasaña=Integer.parseInt(JOptionPane.showInputDialog(null,"digite la orden que desea\n: Si desea una lasaña  de pollo digite 1:\n Si desea una lasaña de carne digite 2:\n Si desea una lasaña de atun digite 3"));

    }
    
    
    public void determinarPreciolasaña() {
        //estos contadores los utilizaremos para llevar un recuento de cuantas pizzas comprara el cliente*//
        int contadorpollo = 0;
        int contadorcarne = 0;
        int contadoratun = 0;
        
       for(int i=1; i<=nlasañas; i++){
  
       
   
       switch (saborlasaña) {
           
           case 1:
               
               contadorpollo++;
               
               preciolasaña=contadorpollo*3500;
               
               
               break;
           case 2:
            
               
               contadorcarne++;
               preciolasaña=contadorcarne*4000;
               
               break;
           default:
              
              
               contadoratun++;
               preciolasaña=contadoratun*2500;
             
               break;
       
     }if(nlasañas!=i){
         
         saborlasaña=Integer.parseInt(JOptionPane.showInputDialog(null,"digite su proxima orden:\n 1-pequeña\n 2-mediana o\n 3-grande"));
     }else{
     }
     }
 montolasaña=preciolasaña+preciolasaña;
     JOptionPane.showMessageDialog(null,"\nLa cantidad de lasañas de pollo son "+contadorpollo+"\nLa cantidad de lasañas de carne  son "+contadorcarne+"\nla cantidad de lasañas de atun son  "+contadoratun);

     JOptionPane.showMessageDialog(null,"el total a pagar es "+montolasaña);
    }
}




