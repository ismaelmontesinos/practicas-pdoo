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
public class TreasureView extends javax.swing.JPanel {

    /**
     * Creates new form TreasureView
     */
    Treasure treasureModel;
    boolean selected=false;
    
    
    public TreasureView() {
        initComponents();
    }
    
    
    public void setTreasure (Treasure aTreasure) {
        treasureModel = aTreasure;
        this.jLabelTreasureName.setText (treasureModel.getName());
        this.jLabelTreasureKind.setText(treasureModel.getType().toString());
        this.jLabelTreasureBonus.setText("+"+treasureModel.getBonus());
        repaint();
    }
    
    public boolean isSelected(){
        return selected;
    }
    public Treasure getTreasure(){
        
        return treasureModel;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        bonus = new javax.swing.JLabel();
        kindOfTreasure = new javax.swing.JLabel();
        jLabelTreasureName = new javax.swing.JLabel();
        jLabelTreasureBonus = new javax.swing.JLabel();
        jLabelTreasureKind = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        name.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        name.setText("Nombre:");

        bonus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        bonus.setText("Bonus:");

        kindOfTreasure.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        kindOfTreasure.setText("Tipo de Tesoro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kindOfTreasure)
                            .addComponent(bonus))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabelTreasureBonus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTreasureName, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTreasureKind, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name)
                    .addComponent(jLabelTreasureName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTreasureBonus, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bonus, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kindOfTreasure)
                    .addComponent(jLabelTreasureKind)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        if(!selected){
            selected=true;
            setBackground(new java.awt.Color(0,0,0));
            setForeground(new java.awt.Color(255,255,255));
        }
        else{
            selected=false;
            setBackground(new java.awt.Color(255,255,255));
            setForeground(new java.awt.Color(0,0,0));
        }
        repaint();
    }//GEN-LAST:event_formMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bonus;
    private javax.swing.JLabel jLabelTreasureBonus;
    private javax.swing.JLabel jLabelTreasureKind;
    private javax.swing.JLabel jLabelTreasureName;
    private javax.swing.JLabel kindOfTreasure;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}
