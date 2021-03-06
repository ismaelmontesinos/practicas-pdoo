/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Component;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import napakalaki.*;

/**
 *
 * @author Admin1
 */

public class NapakalakiView extends javax.swing.JFrame {

    /**
     * Creates new form NapakalakiViwe
     */
    
    Napakalaki napakalakiModel;
    private Monster currentMonster;
    private Player currentPlayer;
    private CombatResult cR;
    private CultistPlayer cPlayer;
    
    
   
    
    public NapakalakiView() {
        initComponents();
        jButtonLuchar.setEnabled(false);
        jButtonNextTurn.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonLuchar = new javax.swing.JButton();
        monsterView1 = new GUI.MonsterView();
        playerView2 = new GUI.PlayerView();
        jButtonMeetMonster = new javax.swing.JButton();
        jButtonNextTurn = new javax.swing.JButton();
        pendingBadConsequence1 = new GUI.PendingBadConsequence();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jButtonLuchar.setBackground(new java.awt.Color(0, 0, 0));
        jButtonLuchar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonLuchar.setText("LUCHAR");
        jButtonLuchar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLucharActionPerformed(evt);
            }
        });

        jButtonMeetMonster.setBackground(new java.awt.Color(0, 0, 0));
        jButtonMeetMonster.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMeetMonster.setText("Conocer al Monstruo");
        jButtonMeetMonster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMeetMonsterActionPerformed(evt);
            }
        });

        jButtonNextTurn.setBackground(new java.awt.Color(0, 0, 0));
        jButtonNextTurn.setForeground(new java.awt.Color(255, 255, 255));
        jButtonNextTurn.setText("Siguiente Turno");
        jButtonNextTurn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextTurnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jButtonLuchar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(jButtonNextTurn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonMeetMonster, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerView2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pendingBadConsequence1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(monsterView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pendingBadConsequence1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(playerView2, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonLuchar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMeetMonster)
                    .addComponent(jButtonNextTurn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMeetMonsterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMeetMonsterActionPerformed
        monsterView1.setVisible(true);
        jButtonLuchar.setEnabled(true);
        jButtonMeetMonster.setEnabled(false);
        
        setNapakalaki(napakalakiModel);
    }//GEN-LAST:event_jButtonMeetMonsterActionPerformed

    private void jButtonNextTurnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextTurnActionPerformed
        boolean pasar=napakalakiModel.nextTurn();
        if(pasar){
            playerView2.setPlayer(napakalakiModel.getCurrentPlayer());
            monsterView1.setMonster(napakalakiModel.getCurrentMonster());
            jButtonNextTurn.setEnabled(false);
            jButtonLuchar.setEnabled(false);
            jButtonMeetMonster.setEnabled(true);
        }
        setNapakalaki(napakalakiModel);
    }//GEN-LAST:event_jButtonNextTurnActionPerformed

    private void jButtonLucharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLucharActionPerformed
        cR = napakalakiModel.developCombat();
        
        jButtonNextTurn.setEnabled(true);
        
        jButtonMeetMonster.setEnabled(true);
        if(cR==CombatResult.WIN){
            JOptionPane.showMessageDialog(null, "Has ganado");
            currentMonster.getPrize();
            jButtonLuchar.setEnabled(false);
        }
        
        else if(cR==CombatResult.WINGAME)
            JOptionPane.showMessageDialog(null, "Has ganado y se acaba el juego");

        else if(cR==CombatResult.LOSE){
            JOptionPane.showMessageDialog(null, "Has perdido jajajajaja");
            jButtonLuchar.setEnabled(false);
            pendingBadConsequence1=new PendingBadConsequence();
            pendingBadConsequence1.setPendingBadConsequence(currentPlayer.getPendingBadConsequence());
            pendingBadConsequence1.repaint();
        }
        else if(cR==CombatResult.LOSEANDCONVERT){
            JOptionPane.showMessageDialog(null, "Te has convertido");
            cPlayer.getMyCultistCard();
            currentPlayer=cPlayer;
        }
        jButtonMeetMonster.setEnabled(false);
        setNapakalaki(napakalakiModel);
    }//GEN-LAST:event_jButtonLucharActionPerformed

    
    
    public void setNapakalaki(Napakalaki n){
       this.napakalakiModel=n;   
       playerView2.repaint();
       playerView2.setPlayer(napakalakiModel.getCurrentPlayer());
        
       currentMonster=n.getCurrentMonster();
       monsterView1.setMonster(currentMonster);
       currentPlayer=n.getCurrentPlayer();
       playerView2.setPlayer(currentPlayer);
       napakalakiModel.setEnemies();
       playerView2.setNapakalaki(napakalakiModel);
       
       repaint();
       
    }
     
     public void setNapakalakiModel(){
         
     }
     
     
     
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonLuchar;
    private javax.swing.JButton jButtonMeetMonster;
    private javax.swing.JButton jButtonNextTurn;
    private javax.swing.JPanel jPanel1;
    private GUI.MonsterView monsterView1;
    private GUI.PendingBadConsequence pendingBadConsequence1;
    private GUI.PlayerView playerView2;
    // End of variables declaration//GEN-END:variables
}
