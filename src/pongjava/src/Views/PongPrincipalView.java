/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pongjava.src.Views;

import pongjava.src.Controllers.BallController;
import pongjava.src.Controllers.CPUPlayerController;
import pongjava.src.Controllers.GameController;
import pongjava.src.Controllers.PlayerController;
import pongjava.src.Controllers.ScoreController;

/**
 *
 * @author Soulu
 */
public class PongPrincipalView extends javax.swing.JFrame {
    
    private GameController gameController;
    
    public PongPrincipalView() {
        initComponents();
       
        this.init();
    }
    
    
    public void init(){
        this.gameController = new GameController(new BallController(this.lblBall, this.lblRacketPlayer, this.lblRacketCPU), new CPUPlayerController(lblRacketCPU), new PlayerController(this.lblRacketPlayer));
        ScoreController.setLabelsScores(this.lblCountPlayer, this.lblCountCPU);
        this.gameController.moveBall();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContainer = new javax.swing.JPanel();
        lblCountCPU = new javax.swing.JLabel();
        lblCountPlayer = new javax.swing.JLabel();
        lblRacketPlayer = new javax.swing.JLabel();
        lblRacketCPU = new javax.swing.JLabel();
        lblBall = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pong Java");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        pnlContainer.setBackground(new java.awt.Color(0, 0, 0));
        pnlContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCountCPU.setFont(new java.awt.Font("Consolas", 2, 36)); // NOI18N
        lblCountCPU.setForeground(new java.awt.Color(255, 255, 255));
        lblCountCPU.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountCPU.setText("0");
        pnlContainer.add(lblCountCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(335, 6, 45, -1));

        lblCountPlayer.setFont(new java.awt.Font("Consolas", 2, 36)); // NOI18N
        lblCountPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblCountPlayer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblCountPlayer.setText("0");
        pnlContainer.add(lblCountPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 6, 41, -1));

        lblRacketPlayer.setBackground(new java.awt.Color(255, 255, 255));
        lblRacketPlayer.setForeground(new java.awt.Color(255, 255, 255));
        lblRacketPlayer.setOpaque(true);
        pnlContainer.add(lblRacketPlayer, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 200, 13, 55));

        lblRacketCPU.setBackground(new java.awt.Color(255, 255, 255));
        lblRacketCPU.setForeground(new java.awt.Color(255, 255, 255));
        lblRacketCPU.setOpaque(true);
        pnlContainer.add(lblRacketCPU, new org.netbeans.lib.awtextra.AbsoluteConstraints(616, 181, 14, 55));

        lblBall.setBackground(new java.awt.Color(255, 255, 255));
        lblBall.setOpaque(true);
        pnlContainer.add(lblBall, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 13, 13));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        pnlContainer.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 0, -1, 416));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 652, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if(evt.getKeyCode() == 38 || evt.getKeyCode() == 87){
            this.gameController.moveUpPlayer();
        }else if(evt.getKeyCode() == 40 || evt.getKeyCode() == 83){
            this.gameController.moveDownPlayer();
        }
    }//GEN-LAST:event_formKeyPressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PongPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PongPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PongPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PongPrincipalView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PongPrincipalView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblBall;
    private javax.swing.JLabel lblCountCPU;
    private javax.swing.JLabel lblCountPlayer;
    private javax.swing.JLabel lblRacketCPU;
    private javax.swing.JLabel lblRacketPlayer;
    private javax.swing.JPanel pnlContainer;
    // End of variables declaration//GEN-END:variables
}
