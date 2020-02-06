/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Controllers;

import java.awt.geom.Area;
import java.util.Random;
import javax.swing.JLabel;

/**
 *
 * @author Soulu
 */
public class BallController {
    private JLabel ball = null;
    private JLabel player = null;
    private JLabel cpuPlayer = null;
    private final int ballWidth = 13;
    private final int ballHeight = 13;
    private int maxX = 630;
    private int maxY = 416;
    private int positionY = 0;
    private int positionX = 0;
    private int speedX = 10;
    private int speedY = -10;
    
    public BallController(JLabel ball, JLabel player, JLabel cpuPlayer){
        this.ball = ball;
        this.positionX = this.ball.getX();
        this.positionY = this.ball.getY();
        this.player = player;
        this.cpuPlayer = cpuPlayer;
    }
    
    public void mover(){
        new Thread(() -> {
            try{
                while(true){
                    this.ball.setBounds(this.positionX, this.positionY, this.ballWidth, this.ballWidth);
                    Thread.sleep(40);
                    
                    this.positionX = this.positionX + this.speedX;
                    this.positionY = this.positionY + this.speedY;   
                    
                    this.bounceInBackground();
                    
                    if(this.checkPlayerCollision()){
                        this.bounceInPlayer();
                    }
                    if(this.checkCPUPlayerCollision()){
                        this.bounceInCPUPlayer();
                    }
                }
            }catch(Exception e){}
        }).start();
    }
    
    private boolean checkPlayerCollision(){
        Area pArea = new Area(this.player.getBounds());
        Area bArea = new Area(this.ball.getBounds());
        
        return pArea.intersects(bArea.getBounds2D());
    }
    
    private boolean checkCPUPlayerCollision(){
        Area pArea = new Area(this.cpuPlayer.getBounds());
        Area bArea = new Area(this.ball.getBounds());
        
        return pArea.intersects(bArea.getBounds2D());
    }
    
    private void bounceInPlayer(){
        this.ball.setBounds(this.player.getX(), this.ball.getY(), this.ballWidth, this.ballHeight);
        if(this.speedX < 0)
            this.speedX = this.speedX * -1;

    }
    
    private void bounceInCPUPlayer(){
        this.ball.setBounds(this.cpuPlayer.getX(), this.ball.getY(), this.ballWidth, this.ballHeight);
        if(this.speedX >= 0)
            this.speedX = this.speedX * -1;

    }
    
    
    
    private void bounceInBackground(){
        //rebote de derecha a izquierda
        if(this.ball.getX() >= this.maxX){
            this.ball.setBounds(this.maxX, this.ball.getY(), this.ballWidth, this.ballHeight);            
            if(this.speedX >= 0){
                this.speedX = this.speedX * -1;
                ScoreController.addScoreCPU();
            }
        }
        //rebote de abajo a arriba
        if(this.ball.getY() >= this.maxY){
            this.ball.setBounds(this.ball.getX(), this.maxY, this.ballWidth, this.ballHeight);
            if(this.speedY >= 0)
                this.speedY = this.speedY * -1;   
        }
        //rebote de izquierda a derecha
        if(this.ball.getX() <= 0){
            this.ball.setBounds(0, this.ball.getY(), this.ballWidth, this.ballHeight);
            if(this.speedX < 0){
                this.speedX = this.speedX * -1;
                ScoreController.addScorePlayer();
            }
        }
        //rebote de arriba a abajo
        if(this.ball.getY() <= 0){
            this.ball.setBounds(this.ball.getX(), 0, this.ballWidth, this.ballHeight);
            if(this.speedY < 0)
                this.speedY = this.speedY * -1;
        }
    }
    
}
