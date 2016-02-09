/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng431.lab4.newtonraphson;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;

/**
 *
 * @author yha5009
 */
public class CoefVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JTextField field = (JTextField) input;
        try {
            Integer.parseInt(field.getText());
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
