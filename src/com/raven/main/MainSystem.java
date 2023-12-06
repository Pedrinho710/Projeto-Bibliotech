package com.raven.main;

import com.raven.model.ModelUser;
import gui.CadastrarNota;
import java.awt.Color;
import javax.swing.JFrame;
import gui.LivroGUI;
import gui.LivroVisualizarGUI;

public class MainSystem extends JFrame {

    private final ModelUser user;
    private LivroGUI LivroGUI;
    private LivroVisualizarGUI LivroVisualizarGUI;
    private CadastrarNota CadastrarNota;
    
    public MainSystem(ModelUser user) {
        this.user = user;
        initComponents();
        getContentPane().setBackground(new Color(245, 245, 245));
        lbUser.setText(user.getUserName());
        LivroGUI = new LivroGUI();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        panelSideBar = new javax.swing.JPanel();
        btnCadastrarLivro = new com.raven.swing.Button();
        btnVisualizarLivro = new com.raven.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnCadastrarNota = new com.raven.swing.Button();
        jLabel3 = new javax.swing.JLabel();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        panelSideBar.setBackground(new java.awt.Color(87, 17, 206));
        panelSideBar.setForeground(new java.awt.Color(135, 60, 190));

        btnCadastrarLivro.setBackground(new java.awt.Color(87, 17, 206));
        btnCadastrarLivro.setBorder(null);
        btnCadastrarLivro.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/CadastroLivro.png"))); // NOI18N
        btnCadastrarLivro.setText("Cadastrar Livro");
        btnCadastrarLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarLivroActionPerformed(evt);
            }
        });

        btnVisualizarLivro.setBackground(new java.awt.Color(87, 17, 206));
        btnVisualizarLivro.setBorder(null);
        btnVisualizarLivro.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Vizualizar.png"))); // NOI18N
        btnVisualizarLivro.setText("Visualizar Livro");
        btnVisualizarLivro.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizarLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarLivroActionPerformed(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("User Name");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/userIconSideBar.png"))); // NOI18N

        btnCadastrarNota.setBackground(new java.awt.Color(87, 17, 206));
        btnCadastrarNota.setBorder(null);
        btnCadastrarNota.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarNota.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/usericon.png"))); // NOI18N
        btnCadastrarNota.setText("Cadastrar Nota");
        btnCadastrarNota.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarNotaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelSideBarLayout = new javax.swing.GroupLayout(panelSideBar);
        panelSideBar.setLayout(panelSideBarLayout);
        panelSideBarLayout.setHorizontalGroup(
            panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSideBarLayout.createSequentialGroup()
                        .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnVisualizarLivro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadastrarNota, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSideBarLayout.setVerticalGroup(
            panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideBarLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSideBarLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(panelSideBarLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVisualizarLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadastrarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(202, Short.MAX_VALUE))
        );

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logoRoxo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelSideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarLivroActionPerformed
        if (LivroGUI == null) {
        LivroGUI = new LivroGUI();
        }
            LivroGUI.setVisible(true);
    }//GEN-LAST:event_btnCadastrarLivroActionPerformed

    private void btnVisualizarLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarLivroActionPerformed
        if (LivroVisualizarGUI == null) {
        LivroVisualizarGUI = new LivroVisualizarGUI();
        }
                LivroVisualizarGUI.setVisible(true);
    }//GEN-LAST:event_btnVisualizarLivroActionPerformed

    private void btnCadastrarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarNotaActionPerformed
        if (CadastrarNota == null) {
        CadastrarNota = new CadastrarNota();
        }
                CadastrarNota.setVisible(true);
    }//GEN-LAST:event_btnCadastrarNotaActionPerformed

    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystem(user).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Button btnCadastrarLivro;
    private com.raven.swing.Button btnCadastrarNota;
    private com.raven.swing.Button btnVisualizarLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel panelSideBar;
    // End of variables declaration//GEN-END:variables
}
