
import javax.swing.JOptionPane;


public class pizza extends arreglopizza {
private arreglopizza pizza[];

    public void especificarTamArregloPiza() {
          npizzas = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a pizza fide \n Digite la cantidad de pizzas que va a ordenar"));//esta variable la vamos a ingresar en el arreglo para que nos lleve la cantidad de pizzas
        pizza = new arreglopizza[npizzas];//este arreglo es para llevar la cantidad de pizzas que el cliente desea
    
    



     pizzatamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"digite la orden que desea\n: Si desea una pizza pequeña digite 1:\n Si desea una pizza mediana digite 2:\n Si desea una pizza grande digite 3"));

    }
    
    
    public void determinarPreciopizza() {
        //estos contadores los utilizaremos para llevar un recuento de cuantas pizzas comprara el cliente*//
        int contadorpequeña = 0;
        int contadormediana = 0;
        int contadorgrande = 0;
        
       for(int i=1; i<=npizzas; i++){
  
       
   
       switch (pizzatamaño) {
           
           case 1:
               
               contadorpequeña++;
               
               precio=contadorpequeña*1500;
               
               
               break;
           case 2:
            
               
               contadormediana++;
               precio=contadormediana*5000;
               
               break;
           default:
              
              
               contadorgrande++;
               precio=contadorgrande*7000;
             
               break;
       
     }if(npizzas!=i){
         
         pizzatamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"digite su proxima orden:\n 1-pequeña\n 2-mediana o\n 3-grande"));
     }else{
     }
     }
 montopizza=precio+precio;
     JOptionPane.showMessageDialog(null,"\nLa cantidad de pizzas pequeñas son "+contadorpequeña+"\nLa cantidad de pizzas medianas son "+contadormediana+"\nla cantidad de pizzas grandes son "+contadorgrande);

     JOptionPane.showMessageDialog(null,"el total a pagar es "+montopizza);
    }
}
    



