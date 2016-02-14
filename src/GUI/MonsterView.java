/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import napakalaki.*;

/**
 *
 * @author Admin1
 */
public class MonsterView extends javax.swing.JPanel {

    /**
     * Creates new form MonsterView
     */
    
    Monster monsterModel;
    public MonsterView() {
        initComponents();
    }
    
    public void setMonster(Monster m){
        
        monsterModel = m; 
        prizeView1.repaint();
        badConsequenceView1.repaint();
        badConsequenceView1.setBadConsequence(m.getBadConsequence());
        prizeView1.setPrize(m.getPrize());
        jLabelMonsterName.setText(monsterModel.getName());
        jLabelMonsterLevel.setText(Integer.toString(monsterModel.getCombatLevel()));
        
        repaint();
        revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prizeView1 = new GUI.PrizeView();
        monsterName = new javax.swing.JLabel();
        monsterLevel = new javax.swing.JLabel();
        jLabelMonsterName = new javax.swing.JLabel();
        jLabelMonsterLevel = new javax.swing.JLabel();
        MONSTER = new javax.swing.JLabel();
        badConsequenceView1 = new GUI.BadConsequenceView();

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(255, 255, 255));

        prizeView1.setBackground(new java.awt.Color(153, 255, 153));

        monsterName.setForeground(new java.awt.Color(255, 255, 255));
        monsterName.setText("Nombre:");

        monsterLevel.setForeground(new java.awt.Color(255, 255, 255));
        monsterLevel.setText("Nivel:");

        jLabelMonsterName.setForeground(new java.awt.Color(255, 255, 255));

        jLabelMonsterLevel.setForeground(new java.awt.Color(255, 255, 255));

        MONSTER.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        MONSTER.setForeground(new java.awt.Color(255, 255, 255));
        MONSTER.setText("MONSTRUO:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(prizeView1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monsterName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelMonsterName))
                            .addComponent(badConsequenceView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(monsterLevel)
                                .addGap(18, 18, 18)
                                .addComponent(jLabelMonsterLevel))
                            .addComponent(MONSTER))
                        .addGap(0, 4, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MONSTER)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monsterName)
                    .addComponent(jLabelMonsterName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(monsterLevel)
                    .addComponent(jLabelMonsterLevel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prizeView1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(badConsequenceView1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel MONSTER;
    private GUI.BadConsequenceView badConsequenceView1;
    private javax.swing.JLabel jLabelMonsterLevel;
    private javax.swing.JLabel jLabelMonsterName;
    private javax.swing.JLabel monsterLevel;
    private javax.swing.JLabel monsterName;
    private GUI.PrizeView prizeView1;
    // End of variables declaration//GEN-END:variables
}