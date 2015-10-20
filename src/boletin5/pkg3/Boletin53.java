
package boletin5.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Boletin53 {

    
    public static void main(String[] args) {
        Circulo obx = new Circulo();
        String respuesta1 = JOptionPane.showInputDialog("radio");
        obx.setRadio(Double.parseDouble(respuesta1));
        
        JOptionPane.showMessageDialog(null, "Área="+obx.getArea());
        JOptionPane.showMessageDialog(null, "Longitud="+obx.getLongitud());
    }
    
}
