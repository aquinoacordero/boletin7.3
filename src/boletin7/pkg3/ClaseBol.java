package boletin7.pkg3;

import javax.swing.JOptionPane;

public class ClaseBol {

    public double numero1;

    public ClaseBol() {

    }

    public void introDatos() {

        String valor1 = JOptionPane.showInputDialog("INTRODUZCA UN PRIMER NUMERO");
        numero1 = Short.parseShort(valor1);

    }

    public void salida() {
        if (numero1 < 0) {
            JOptionPane.showMessageDialog(null, "-");
        } else if (numero1 > 0) {
            JOptionPane.showMessageDialog(null, "+");
        } else {
            JOptionPane.showMessageDialog(null, "0");
        }
    }
}
