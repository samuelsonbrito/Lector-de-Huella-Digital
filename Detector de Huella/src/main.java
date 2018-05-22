
import Vistas.JFprincipal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cristian Gonzalez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      JFprincipal principal = new JFprincipal();
      principal.setExtendedState(JFprincipal.MAXIMIZED_BOTH);
      principal.setVisible(true);
      
    }
    
}
