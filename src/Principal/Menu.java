package Principal;
import javax.swing.*;

import ConversorMoneda.OpcionesConversion;

public class Menu {
    
    public static void main(String[] args) {
        
        OpcionesConversion conver = new OpcionesConversion();

        while(true){
            String opciones = JOptionPane.showInputDialog(null, "Seleccionar una opcion","Menu",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de Monedas","Conversor de temperatura"},"Elegir").toString();

            switch(opciones){
                case "Conversor de Monedas":
                    String input = JOptionPane.showInputDialog(null, "Ingresar valor a convertir");
                    double valor = Double.parseDouble(input);
                    conver.ConvertirMonedas(valor);

                    int res = JOptionPane.showConfirmDialog(null, "Desea continuar?");
                    if(JOptionPane.OK_OPTION == res){
                        System.out.println("");
                    }else{
                        JOptionPane.showMessageDialog(null, "Finalizado");
                    }  
                    break;
                case "Conversor de temperatura":
                    JOptionPane.showMessageDialog(null, "Proximamente");
                    break;
            }
        }
    }
}
