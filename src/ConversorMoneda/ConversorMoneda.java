package ConversorMoneda;
import javax.swing.JOptionPane;

public class ConversorMoneda {
    
    public void ConvertirPesoADolar(double valor){
        double dolar = valor / 280;
        dolar = (double)Math.round(dolar * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Son $ " + dolar + " dolares");
    }

    public void ConvertirPesoAEuro(double valor){
        double euro = valor / 136.5357;
        euro = (double)Math.round(euro * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Son $ " + euro + " euros");
    }

    public void ConvertirPesoAYen(double valor){
        double yen = valor / 1;
        yen = (double)Math.round(yen * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Son $ " + yen + " yenes");
    }

    public void ConvertirPesoALibras(double valor){
        double libra = valor / 152.30;
        libra = (double)Math.round(libra * 100d) / 100;

        JOptionPane.showMessageDialog(null, "Son $ " + libra + " libras esterlinas");
    }
}
