/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sweng431.lab4.newtonraphson;

/**
 *
 * @author yha5009
 */
public class NewtonRaphson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ExtremeFinderMenu menu = new ExtremeFinderMenu();
        menu.setVisible(true);
    }
    
    private static void log(String msg) {
        System.out.println(msg);
    }
    
}
