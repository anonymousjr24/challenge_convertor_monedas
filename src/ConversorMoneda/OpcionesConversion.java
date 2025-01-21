package ConversorMoneda;

import javax.swing.JOptionPane;

public class OpcionesConversion {

    ConversorMoneda monedas = new ConversorMoneda();

    public void ConvertirMonedas(double valor){
        String opcion = (JOptionPane.showInputDialog(null, "Elegir moneda a la que convertir","Moneda",JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Peso a Dolar","Peso a Euro","Peso a Yen","Peso a Libra esterlina"},"Seleccion")).toString();

        switch (opcion) {
            case "Peso a Dolar":
                monedas.ConvertirPesoADolar(valor);
                break;
            case "Peso a Euro":
                monedas.ConvertirPesoAEuro(valor);
                break;
            case "Peso a Yen":
                monedas.ConvertirPesoAYen(valor);
                break;
            case "Peso a Libra esterlina":
                monedas.ConvertirPesoALibras(valor);
                break;
            default:
                break;
        }
    }
}
