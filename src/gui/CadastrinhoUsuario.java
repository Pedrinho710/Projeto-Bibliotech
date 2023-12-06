package gui;

import com.raven.model.ModelUser;
import dao.CadastrooUsuarioDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CadastrinhoUsuario extends javax.swing.JFrame implements ActionListener{

    
    public CadastrinhoUsuario() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setSize(960, 800);
        setLocationRelativeTo(null);
        BotaoCadastrarUsuario.addActionListener(this);
    }
    
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == BotaoCadastrarUsuario) {
            ModelUser user = new ModelUser();
            user.setEmail(lbEmail.getText());
            user.setPassword(lbSenha.getText());
            user.setNome(lbNome.getText());
            user.setCpf(lbCPF.getText());
            user.setTelefone(lbTelefone.getText());
            user.setUserName(lbUsername.getText());
            user.setStatus(lbPerfil.getText());
            try {
                int idade = Integer.parseInt(lbIdade.getText());
                user.setIdade(idade);
            } catch (NumberFormatException ex) {
                System.out.println("Erro ao converter");
            }
            if (checkFeminino.isSelected()) {
                user.setSexo("Feminino");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkMasculino.isSelected()) {
                user.setSexo("Masculino");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            
            CadastrooUsuarioDAO cadastroUsuario = new CadastrooUsuarioDAO();
            cadastroUsuario.insertUserOrUpdateUser(user);
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        BotaoCadastrarUsuario = new javax.swing.JButton();
        lbSenha = new javax.swing.JTextField();
        lbNome = new javax.swing.JTextField();
        lbCPF = new javax.swing.JTextField();
        lbTelefone = new javax.swing.JTextField();
        lbPerfil = new javax.swing.JTextField();
        lbIdade = new javax.swing.JTextField();
        lbUsername = new javax.swing.JTextField();
        lbEmail = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        checkFeminino = new javax.swing.JCheckBox();
        checkMasculino = new javax.swing.JCheckBox();
        panelGenero = new javax.swing.JPanel();
        checkAventura = new javax.swing.JCheckBox();
        checkCulinaria = new javax.swing.JCheckBox();
        checkArte = new javax.swing.JCheckBox();
        checkFantasia = new javax.swing.JCheckBox();
        checkFiccao = new javax.swing.JCheckBox();
        checkHorror = new javax.swing.JCheckBox();
        checkInfantil = new javax.swing.JCheckBox();
        checkMisterioCrime = new javax.swing.JCheckBox();
        checkPoesia = new javax.swing.JCheckBox();
        checkReligiao = new javax.swing.JCheckBox();
        checkRomance = new javax.swing.JCheckBox();
        checkTecnico = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(87, 17, 206));
        jPanel2.setForeground(new java.awt.Color(87, 17, 206));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Usuário");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Olá amigo(a) Admin");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastre os dados dos usuários");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("com muita atenção!");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logoBrancoPequeno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(37, 37, 37)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/userRegisterRoxo.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(87, 17, 206));
        jLabel7.setText("Credencias para autenticação do usuário");

        jLabel9.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(87, 17, 206));
        jLabel9.setText("Informações Pessoais");

        jLabel14.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(87, 17, 206));
        jLabel14.setText("Escolha um Username ");

        jLabel15.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(87, 17, 206));
        jLabel15.setText("Digite \"Comum\" para o perfil");

        BotaoCadastrarUsuario.setBackground(new java.awt.Color(87, 17, 206));
        BotaoCadastrarUsuario.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        BotaoCadastrarUsuario.setForeground(new java.awt.Color(255, 255, 255));
        BotaoCadastrarUsuario.setText("Cadastrar");
        BotaoCadastrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotaoCadastrarUsuarioActionPerformed(evt);
            }
        });

        lbSenha.setBackground(new java.awt.Color(255, 255, 255));
        lbSenha.setForeground(new java.awt.Color(0, 0, 0));
        lbSenha.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbNome.setBackground(new java.awt.Color(255, 255, 255));
        lbNome.setForeground(new java.awt.Color(0, 0, 0));
        lbNome.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nome", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbNomeActionPerformed(evt);
            }
        });

        lbCPF.setBackground(new java.awt.Color(255, 255, 255));
        lbCPF.setForeground(new java.awt.Color(0, 0, 0));
        lbCPF.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CPF", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbCPFActionPerformed(evt);
            }
        });

        lbTelefone.setBackground(new java.awt.Color(255, 255, 255));
        lbTelefone.setForeground(new java.awt.Color(0, 0, 0));
        lbTelefone.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Telefone", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbPerfil.setBackground(new java.awt.Color(255, 255, 255));
        lbPerfil.setForeground(new java.awt.Color(0, 0, 0));
        lbPerfil.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Perfil", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbIdade.setBackground(new java.awt.Color(255, 255, 255));
        lbIdade.setForeground(new java.awt.Color(0, 0, 0));
        lbIdade.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Idade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbUsername.setBackground(new java.awt.Color(255, 255, 255));
        lbUsername.setForeground(new java.awt.Color(0, 0, 0));
        lbUsername.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbEmail.setBackground(new java.awt.Color(255, 255, 255));
        lbEmail.setForeground(new java.awt.Color(0, 0, 0));
        lbEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        buttonGroup1.add(checkFeminino);
        checkFeminino.setForeground(new java.awt.Color(87, 17, 206));
        checkFeminino.setText("Feminino");

        buttonGroup1.add(checkMasculino);
        checkMasculino.setForeground(new java.awt.Color(87, 17, 206));
        checkMasculino.setText("Masculino");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(checkFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkMasculino)
                .addGap(23, 23, 23))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(checkFeminino)
                .addComponent(checkMasculino))
        );

        panelGenero.setBackground(new java.awt.Color(255, 255, 255));
        panelGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selecione 2 gêneros preferidos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        panelGenero.setForeground(new java.awt.Color(0, 0, 0));

        checkAventura.setBackground(new java.awt.Color(255, 255, 255));
        checkAventura.setForeground(new java.awt.Color(0, 0, 0));
        checkAventura.setText("Ação e Aventura");

        checkCulinaria.setBackground(new java.awt.Color(255, 255, 255));
        checkCulinaria.setForeground(new java.awt.Color(0, 0, 0));
        checkCulinaria.setText("Culinária");

        checkArte.setBackground(new java.awt.Color(255, 255, 255));
        checkArte.setForeground(new java.awt.Color(0, 0, 0));
        checkArte.setText("Arte");
        checkArte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkArteActionPerformed(evt);
            }
        });

        checkFantasia.setBackground(new java.awt.Color(255, 255, 255));
        checkFantasia.setForeground(new java.awt.Color(0, 0, 0));
        checkFantasia.setText("Fantasia");

        checkFiccao.setBackground(new java.awt.Color(255, 255, 255));
        checkFiccao.setForeground(new java.awt.Color(0, 0, 0));
        checkFiccao.setText("Ficção");

        checkHorror.setBackground(new java.awt.Color(255, 255, 255));
        checkHorror.setForeground(new java.awt.Color(0, 0, 0));
        checkHorror.setText("Horror");
        checkHorror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHorrorActionPerformed(evt);
            }
        });

        checkInfantil.setBackground(new java.awt.Color(255, 255, 255));
        checkInfantil.setForeground(new java.awt.Color(0, 0, 0));
        checkInfantil.setText("Infantil");

        checkMisterioCrime.setBackground(new java.awt.Color(255, 255, 255));
        checkMisterioCrime.setForeground(new java.awt.Color(0, 0, 0));
        checkMisterioCrime.setText("Mistério ");

        checkPoesia.setBackground(new java.awt.Color(255, 255, 255));
        checkPoesia.setForeground(new java.awt.Color(0, 0, 0));
        checkPoesia.setText("Poesia");
        checkPoesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPoesiaActionPerformed(evt);
            }
        });

        checkReligiao.setBackground(new java.awt.Color(255, 255, 255));
        checkReligiao.setForeground(new java.awt.Color(0, 0, 0));
        checkReligiao.setText("Religião");
        checkReligiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkReligiaoActionPerformed(evt);
            }
        });

        checkRomance.setBackground(new java.awt.Color(255, 255, 255));
        checkRomance.setForeground(new java.awt.Color(0, 0, 0));
        checkRomance.setText("Romance");
        checkRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRomanceActionPerformed(evt);
            }
        });

        checkTecnico.setBackground(new java.awt.Color(255, 255, 255));
        checkTecnico.setForeground(new java.awt.Color(0, 0, 0));
        checkTecnico.setText("Técnico");
        checkTecnico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkTecnicoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneroLayout = new javax.swing.GroupLayout(panelGenero);
        panelGenero.setLayout(panelGeneroLayout);
        panelGeneroLayout.setHorizontalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAventura)
                    .addComponent(checkArte)
                    .addComponent(checkCulinaria))
                .addGap(25, 25, 25)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFiccao)
                    .addComponent(checkFantasia)
                    .addComponent(checkHorror))
                .addGap(25, 25, 25)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPoesia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMisterioCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInfantil))
                .addGap(20, 20, 20)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRomance, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTecnico))
                .addGap(171, 171, 171))
        );
        panelGeneroLayout.setVerticalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkAventura)
                        .addComponent(checkFantasia)
                        .addComponent(checkInfantil))
                    .addComponent(checkReligiao, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkArte)
                    .addComponent(checkFiccao)
                    .addComponent(checkMisterioCrime)
                    .addComponent(checkRomance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkPoesia)
                        .addComponent(checkHorror)
                        .addComponent(checkCulinaria))
                    .addComponent(checkTecnico))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lbNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel7)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jLabel14)
                                                .addComponent(lbTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(30, 30, 30)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabel15)
                                                .addComponent(lbIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                                .addComponent(lbPerfil, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addComponent(BotaoCadastrarUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTelefone))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPerfil))
                .addGap(9, 9, 9)
                .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoCadastrarUsuario)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotaoCadastrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotaoCadastrarUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotaoCadastrarUsuarioActionPerformed

    private void lbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbNomeActionPerformed

    private void lbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbCPFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbCPFActionPerformed

    private void checkArteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkArteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkArteActionPerformed

    private void checkHorrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHorrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHorrorActionPerformed

    private void checkPoesiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkPoesiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkPoesiaActionPerformed

    private void checkReligiaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkReligiaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkReligiaoActionPerformed

    private void checkRomanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkRomanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkRomanceActionPerformed

    private void checkTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTecnicoActionPerformed

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
            java.util.logging.Logger.getLogger(CadastrinhoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrinhoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrinhoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrinhoUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrinhoUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoCadastrarUsuario;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkArte;
    private javax.swing.JCheckBox checkAventura;
    private javax.swing.JCheckBox checkCulinaria;
    private javax.swing.JCheckBox checkFantasia;
    private javax.swing.JCheckBox checkFeminino;
    private javax.swing.JCheckBox checkFiccao;
    private javax.swing.JCheckBox checkHorror;
    private javax.swing.JCheckBox checkInfantil;
    private javax.swing.JCheckBox checkMasculino;
    private javax.swing.JCheckBox checkMisterioCrime;
    private javax.swing.JCheckBox checkPoesia;
    private javax.swing.JCheckBox checkReligiao;
    private javax.swing.JCheckBox checkRomance;
    private javax.swing.JCheckBox checkTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField lbCPF;
    private javax.swing.JTextField lbEmail;
    private javax.swing.JTextField lbIdade;
    private javax.swing.JTextField lbNome;
    private javax.swing.JTextField lbPerfil;
    private javax.swing.JTextField lbSenha;
    private javax.swing.JTextField lbTelefone;
    private javax.swing.JTextField lbUsername;
    private javax.swing.JPanel panelGenero;
    // End of variables declaration//GEN-END:variables
}
