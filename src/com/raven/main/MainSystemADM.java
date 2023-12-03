package com.raven.main;

import com.raven.model.ModelUser;
import gui.CadastroUsuarioGUI;
import java.awt.Color;
import javax.swing.JFrame;


public class MainSystemADM extends JFrame {

    private final ModelUser user;
    private CadastroUsuarioGUI CadastroUsuarioGUI;
    
    public MainSystemADM(ModelUser user) {
        this.user = user;
        initComponents();
        getContentPane().setBackground(new Color(245, 245, 245));
        lbUser.setText(user.getUserName());
        CadastroUsuarioGUI = new CadastroUsuarioGUI();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        panelSideBarAdm = new javax.swing.JPanel();
        btnCadastrarUsuario = new com.raven.swing.Button();
        btnVisualizarUsuario = new com.raven.swing.Button();
        jLabel2 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        PanelADM = new javax.swing.JLabel();

        jMenuItem1.setText("jMenuItem1");

        panelSideBarAdm.setBackground(new java.awt.Color(87, 17, 206));
        panelSideBarAdm.setForeground(new java.awt.Color(135, 60, 190));

        btnCadastrarUsuario.setBackground(new java.awt.Color(87, 17, 206));
        btnCadastrarUsuario.setBorder(null);
        btnCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/userRegister.png"))); // NOI18N
        btnCadastrarUsuario.setText("Cadastrar Usuário");
        btnCadastrarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarUsuarioActionPerformed(evt);
            }
        });

        btnVisualizarUsuario.setBackground(new java.awt.Color(87, 17, 206));
        btnVisualizarUsuario.setBorder(null);
        btnVisualizarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        btnVisualizarUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/Vizualizar.png"))); // NOI18N
        btnVisualizarUsuario.setText("Visualizar Livro");
        btnVisualizarUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnVisualizarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVisualizarUsuarioActionPerformed(evt);
            }
        });

        lbUser.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        lbUser.setForeground(new java.awt.Color(255, 255, 255));
        lbUser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUser.setText("User Name");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/userIconSideBar.png"))); // NOI18N

        javax.swing.GroupLayout panelSideBarAdmLayout = new javax.swing.GroupLayout(panelSideBarAdm);
        panelSideBarAdm.setLayout(panelSideBarAdmLayout);
        panelSideBarAdmLayout.setHorizontalGroup(
            panelSideBarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lbUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelSideBarAdmLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSideBarAdmLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelSideBarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelSideBarAdmLayout.createSequentialGroup()
                        .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addComponent(btnVisualizarUsuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelSideBarAdmLayout.setVerticalGroup(
            panelSideBarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSideBarAdmLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbUser, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panelSideBarAdmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSideBarAdmLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel2))
                    .addGroup(panelSideBarAdmLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnVisualizarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelADM.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PanelADM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logoRoxo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelSideBarAdm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelADM, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelSideBarAdm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelADM, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarUsuarioActionPerformed
        if (CadastroUsuarioGUI == null) {
            CadastroUsuarioGUI = new CadastroUsuarioGUI();
        }
        CadastroUsuarioGUI.setVisible(true);
    }//GEN-LAST:event_btnCadastrarUsuarioActionPerformed

    private void btnVisualizarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVisualizarUsuarioActionPerformed

    }//GEN-LAST:event_btnVisualizarUsuarioActionPerformed
    
    public static void main(ModelUser user) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainSystemADM(user).setVisible(true);
            }
        });
    }
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel PanelADM;
    private com.raven.swing.Button btnCadastrarUsuario;
    private com.raven.swing.Button btnVisualizarUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JPanel panelSideBarAdm;
    // End of variables declaration//GEN-END:variables
}
