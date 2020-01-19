/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Controllers;

import javax.swing.JLabel;

/**
 *
 * @author Soulu
 */
public final class ScoreController {
    
    private static JLabel scorePlayer = null;
    private static JLabel scoreCPU = null;
    
    public static void setLabelsScores(JLabel labelScorePlayer, JLabel labelScoreCPU){
        scorePlayer = labelScorePlayer;
        scoreCPU = labelScoreCPU;
    }
    
    public static void addScorePlayer(){
        if(scorePlayer != null){
            int score = Integer.parseInt(scorePlayer.getText()) + 1;
            scorePlayer.setText(score+"");
        }
    }
    
    public static void addScoreCPU(){
        if(scoreCPU != null){
            int score = Integer.parseInt(scoreCPU.getText()) + 1;
            scoreCPU.setText(score+"");
        }
    }
    
}
