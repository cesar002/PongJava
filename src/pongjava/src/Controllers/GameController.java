/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Controllers;

/**
 *
 * @author Soulu
 */
public class GameController {
    private final int speedPlayer = 30;
    private BallController ballController = null;
    private CPUPlayerController CPUplayerController = null;
    private PlayerController playerController = null;
    
    public GameController(BallController ballController, CPUPlayerController cpuPlayerController, PlayerController playerController){
        this.ballController = ballController;
        this.CPUplayerController = cpuPlayerController;
        this.playerController = playerController;
    }
    
    public void moveUpPlayer(){
        this.playerController.moverse((this.speedPlayer * -1));
    }
    
    public void moveDownPlayer(){
        this.playerController.moverse(this.speedPlayer);
    }
    
    public void moveBall(){
        this.ballController.mover();
    }
    
}
