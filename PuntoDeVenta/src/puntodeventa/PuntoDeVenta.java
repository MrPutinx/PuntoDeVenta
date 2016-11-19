
package puntodeventa;

import javax.swing.JOptionPane;


public class PuntoDeVenta {
    String nombre;
        int valor;
        int pene;
        String apellido;
        String halo;
        int nepe;
    public static void main(String[] args) {
        System.out.println("Lince se la come");
        System.out.println("Y el Kevin se la da");
        System.out.println("No mame abuelo");
        int añoActual, añoNacimiento, edad;
        JOptionPane.showMessageDialog(null,"Vamos a calcular tu edad");
        añoActual=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año actual: "));
        añoNacimiento=Integer.parseInt(JOptionPane.showInputDialog("Ingresa el año de nacimiento: "));
        edad=añoActual-añoNacimiento;
        if (edad>40){
            JOptionPane.showMessageDialog(null,"Ya estas ruc@ tienes: "+edad);
        }else{
            JOptionPane.showMessageDialog(null,"Aun estas joven tienes: "+edad);
        }
        System.out.println("Rey deja de ver el partido");
        
    }
    public String getNombre(){
        return nombre;
    }
    public int getValor(){
        return valor;
    }
    public int getPene(){
        return pene;
    }
    public String getApellido(){
        return apellido;
    }
    public String getHalo(){
        return halo; 
    }
    
}
