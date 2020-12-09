
import javax.swing.JOptionPane;


public class servicioexpress {
    

   
  public int montoexpress=0;
public void cobro(){

int distancia=Integer.parseInt(JOptionPane.showInputDialog(null,"el servicio express se le cobrara deacuerdo a la distancia:\n digite a que distancia esta su casa si a 100 metros \n a 1000metros\n o si es mas digite cuanta es la distancia "+ montoexpress ));
       for(int i=1; i<=1; i++){
  
       
   
       switch (distancia) {
           
           case 100:
             montoexpress=montoexpress+500 ;
               
               
              
               
               
               break;
           case 1000:
             montoexpress=montoexpress+ 1000 ;
               
               
               
               break;
           default:
              
              montoexpress=montoexpress+ 1500 ;
              
             
               break;

  
       
    
    
    }

    JOptionPane.showMessageDialog(null,"el monto del express es "+montoexpress);
    
       }
    
}

    public servicioexpress() {
    }

    public int getMontoexpress() {
        return montoexpress;
    }

    public void setMontoexpress(int montoexpress) {
        this.montoexpress = montoexpress;
    }
}










