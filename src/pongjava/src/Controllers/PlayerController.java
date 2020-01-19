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
        int position = this.player.getY();
        int newPosition = position == 0 ? 1 : position + yPosition;
        if(position < this.limitMove && position > 0){
            this.player.setBounds(this.player.getX(), newPosition, this.player.getWidth(), this.player.getHeight());
        }else{
            if(newPosition == 355){
                this.player.setBounds(this.player.getX(), 350, this.player.getWidth(), this.player.getHeight());
            }
            
            if(newPosition == 1){
                this.player.setBounds(this.player.getX(), 5, this.player.getWidth(), this.player.getHeight());
            }
        }
    }
    
}
