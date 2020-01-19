/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Controllers;

import javax.swing.JLabel;
import pongjava.src.Abstracts.PlayerAbstract;

/**
 *
 * @author Soulu
 */
public class CPUPlayerController extends PlayerAbstract{

    public CPUPlayerController(JLabel player) {
        super(player);
    }

    @Override
    public void moverse(int yPosition) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
