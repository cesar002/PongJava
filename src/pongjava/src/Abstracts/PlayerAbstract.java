/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Abstracts;

import javax.swing.JLabel;

/**
 *
 * @author Soulu
 */
public abstract class PlayerAbstract {
    protected JLabel player = null;
    
    public void setLabelPlayer(JLabel player){
        this.player = player;
    }
    
    public abstract void moverse(int yPosition);
    
}
