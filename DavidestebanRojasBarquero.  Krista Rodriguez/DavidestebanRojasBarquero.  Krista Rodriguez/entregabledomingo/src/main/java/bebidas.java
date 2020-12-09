
import javax.swing.JOptionPane;


public class bebidas extends arreglobebidas{
    private arreglopizza bebida[];

    public void especificarTamArreglobebida() {
          nbebidas = Integer.parseInt(JOptionPane.showInputDialog(" Digite la cantidad de bebidas que va a ordenar"));//esta variable la vamos a ingresar en el arreglo para que nos lleve la cantidad de pizzas
        bebida = new arreglopizza[nbebidas];//este arreglo es para llevar la cantidad de pizzas que el cliente desea
    
    



     bebidatamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"digite la orden que desea\n: Si desea una bebida digite 1:\n Si desea una bebida mediana digite 2:\n Si desea una bebida grande digite 3"));

    }
    
    
    public void determinarPreciobebida() {
        //estos contadores los utilizaremos para llevar un recuento de cuantas pizzas comprara el cliente*//
        int contadorpequeña = 0;
        int contadormediana = 0;
        int contadorgrande = 0;
        
       for(int i=1; i<=nbebidas; i++){
  
       
   
       switch (bebidatamaño) {
           
           case 1:
               
               contadorpequeña++;
               
               preciobebida=contadorpequeña*1000;
               
               
               break;
           case 2:
            
               
               contadormediana++;
               preciobebida=contadormediana*1800;
               
               break;
           default:
              
              
               contadorgrande++;
               preciobebida=contadorgrande*2200;
             
               break;
       
     }if(nbebidas!=i){
         
         bebidatamaño=Integer.parseInt(JOptionPane.showInputDialog(null,"digite su proxima orden:\n 1-pequeña\n 2-mediana o\n 3-grande"));
     }else{
     }
     }
 montobebida=preciobebida+preciobebida;
     JOptionPane.showMessageDialog(null,"\nLa cantidad de bebidas pequeñas son "+contadorpequeña+"\nLa cantidad de bebidas medianas son "+contadormediana+"\nla cantidad de bebidas grandes son "+contadorgrande);

     JOptionPane.showMessageDialog(null,"el total a pagar es "+montobebida);
    }
}
    







































