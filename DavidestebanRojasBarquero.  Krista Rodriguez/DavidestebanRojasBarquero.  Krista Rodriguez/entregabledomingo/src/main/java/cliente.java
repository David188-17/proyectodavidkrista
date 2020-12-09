
import javax.swing.JOptionPane;


public class cliente {
    String nombrecliente;
    int numerocliente;
    int numerocedula;
    public void datos(){
        
        
        nombrecliente =JOptionPane.showInputDialog("por favor digite su nombre completo");
     numerocliente=Integer.parseInt(JOptionPane.showInputDialog("por favor digite su numero de telefono"));
     numerocedula=Integer.parseInt(JOptionPane.showInputDialog("por favor digite su numero de cedula"));
    
   JOptionPane.showMessageDialog(null,"\n el nombre del cliente es "+nombrecliente.toUpperCase()+"\n el numero del cliente es "+numerocliente+"\n el numero de cedula del cliente es "+numerocedula);
    
    
    
    
    }

    








}
