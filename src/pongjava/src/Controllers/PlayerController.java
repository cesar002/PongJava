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
public class PlayerController extends PlayerAbstract{

    public PlayerController(JLabel player) {
        super(player);
    }

    @Override
    public void moverse(int yPosition) {
        int newPosition = this.player.getY() + yPosition;
        
        this.player.setBounds(this.player.getX(), newPosition, this.player.getWidth(), this.player.getHeight());
        
        if(this.player.getY() >= this.limitMove){
            this.player.setBounds(this.player.getX(), this.limitMove, this.player.getWidth(), this.player.getHeight());
        }
        if(this.player.getY() <= 0){
            this.player.setBounds(this.player.getX(), 0, this.player.getWidth(), this.player.getHeight());
        }
    }
    
}
