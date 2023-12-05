package gui;

import com.raven.model.ModelLivro;
import dao.LivroDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivroGUI extends javax.swing.JFrame  implements ActionListener{

    public LivroGUI() {
        initComponents();
        btnCadastrar.addActionListener(this); // Adiciona o ActionListener
         setSize(980, 800);
        setLocationRelativeTo(null);
    }            
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCadastrar) {
            ModelLivro livro = new ModelLivro();
            livro.setTitulo(lbTitulo.getText());
            livro.setAutor(lbAutor.getText());
            livro.setEditora(lbEditora.getText());
            livro.setPrateleira(lbPrateleira.getText());
            livro.setEstante(lbEstante.getText());
            livro.setResumo(lbResumo.getText());
            livro.setIbsn(lbIBSN.getText());
            try {
                int nota = Integer.parseInt(lbNota.getText());
                livro.setNota(nota);
            } catch (NumberFormatException ex) {
                System.out.println("Erro ao converter");
            }
          if (checkAventura.isSelected()) {
                livro.setGenero("Aventura");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkArte.isSelected()) {
                livro.setGenero("Arte");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkCulinaria.isSelected()) {
                livro.setGenero("Culinaria");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkFantasia.isSelected()) {
                livro.setGenero("Fantasia");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkFiccao.isSelected()) {
                livro.setGenero("Ficção");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkHorror.isSelected()) {
                livro.setGenero("Horror");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkInfantil.isSelected()) {
                livro.setGenero("Infantil");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkMisterioCrime.isSelected()) {
                livro.setGenero("Misterio e Crime");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkPoesia.isSelected()) {
                livro.setGenero("Poesia");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkReligiao.isSelected()) {
                livro.setGenero("Religião");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkRomance.isSelected()) {
                livro.setGenero("Romance");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkTecnico.isSelected()) {
                livro.setGenero("Técnico");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            
            LivroDAO livroDAO = new LivroDAO();
            livroDAO.insertLivroOrUpdateLivro(livro);
        }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JTextField();
        lbResumo = new javax.swing.JTextField();
        lbEstante = new javax.swing.JTextField();
        lbEditora = new javax.swing.JTextField();
        lbAutor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        lbPrateleira = new javax.swing.JTextField();
        lbIBSN = new javax.swing.JTextField();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbNota = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela de Livros");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        lbTitulo.setBackground(new java.awt.Color(255, 255, 255));
        lbTitulo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Título", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbTitulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbTituloActionPerformed(evt);
            }
        });

        lbResumo.setBackground(new java.awt.Color(255, 255, 255));
        lbResumo.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "RESUMO", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbResumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbResumoActionPerformed(evt);
            }
        });

        lbEstante.setBackground(new java.awt.Color(255, 255, 255));
        lbEstante.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Estante", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbEditora.setBackground(new java.awt.Color(255, 255, 255));
        lbEditora.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Editora", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbAutor.setBackground(new java.awt.Color(255, 255, 255));
        lbAutor.setForeground(new java.awt.Color(0, 0, 0));
        lbAutor.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Autor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        btnCadastrar.setBackground(new java.awt.Color(87, 17, 206));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("CADASTRAR");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        lbPrateleira.setBackground(new java.awt.Color(255, 255, 255));
        lbPrateleira.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prateleira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbIBSN.setBackground(new java.awt.Color(255, 255, 255));
        lbIBSN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IBSN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbIBSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbIBSNActionPerformed(evt);
            }
        });

        panelGenero.setBackground(new java.awt.Color(255, 255, 255));
        panelGenero.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Gênero", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        panelGenero.setForeground(new java.awt.Color(0, 0, 0));

        checkAventura.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkAventura);
        checkAventura.setForeground(new java.awt.Color(0, 0, 0));
        checkAventura.setText("Ação e Aventura");

        checkCulinaria.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkCulinaria);
        checkCulinaria.setForeground(new java.awt.Color(0, 0, 0));
        checkCulinaria.setText("Culinária");

        checkArte.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkArte);
        checkArte.setForeground(new java.awt.Color(0, 0, 0));
        checkArte.setText("Arte");
        checkArte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkArteActionPerformed(evt);
            }
        });

        checkFantasia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkFantasia);
        checkFantasia.setForeground(new java.awt.Color(0, 0, 0));
        checkFantasia.setText("Fantasia");

        checkFiccao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkFiccao);
        checkFiccao.setForeground(new java.awt.Color(0, 0, 0));
        checkFiccao.setText("Ficção");

        checkHorror.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkHorror);
        checkHorror.setForeground(new java.awt.Color(0, 0, 0));
        checkHorror.setText("Horror");
        checkHorror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkHorrorActionPerformed(evt);
            }
        });

        checkInfantil.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkInfantil);
        checkInfantil.setForeground(new java.awt.Color(0, 0, 0));
        checkInfantil.setText("Infantil");

        checkMisterioCrime.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkMisterioCrime);
        checkMisterioCrime.setForeground(new java.awt.Color(0, 0, 0));
        checkMisterioCrime.setText("Mistério e Crime");

        checkPoesia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkPoesia);
        checkPoesia.setForeground(new java.awt.Color(0, 0, 0));
        checkPoesia.setText("Poesia");
        checkPoesia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkPoesiaActionPerformed(evt);
            }
        });

        checkReligiao.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkReligiao);
        checkReligiao.setForeground(new java.awt.Color(0, 0, 0));
        checkReligiao.setText("Religião");
        checkReligiao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkReligiaoActionPerformed(evt);
            }
        });

        checkRomance.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkRomance);
        checkRomance.setForeground(new java.awt.Color(0, 0, 0));
        checkRomance.setText("Romance");
        checkRomance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkRomanceActionPerformed(evt);
            }
        });

        checkTecnico.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkTecnico);
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
                .addGap(50, 50, 50)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFiccao)
                    .addComponent(checkFantasia)
                    .addComponent(checkHorror))
                .addGap(50, 50, 50)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPoesia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMisterioCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInfantil))
                .addGap(50, 50, 50)
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
                    .addGroup(panelGeneroLayout.createSequentialGroup()
                        .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkPoesia)
                            .addComponent(checkHorror)
                            .addComponent(checkCulinaria))
                        .addContainerGap())
                    .addGroup(panelGeneroLayout.createSequentialGroup()
                        .addComponent(checkTecnico)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );

        jPanel2.setBackground(new java.awt.Color(87, 17, 206));
        jPanel2.setForeground(new java.awt.Color(87, 17, 206));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Livro");

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Olá amigo(a) leitor. Este é o seu momento!");

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chegou a hora de cadastrar seus livros preferidos. ");

        jLabel6.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText(" Ah, não se esqueça  de atribuir uma nota");

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Sua opinião é muito importante para nós!");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/logoBrancoPequeno.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(61, 61, 61)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(19, 19, 19))
        );

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/BookRegisterRoxo.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(87, 17, 206));
        jLabel8.setText("Atribuia uma nota para demonstrar a sua opinião sobre o livro");

        lbNota.setBackground(new java.awt.Color(255, 255, 255));
        lbNota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lbIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                                    .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(lbAutor)
                                .addComponent(lbResumo)
                                .addComponent(lbTitulo)
                                .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addComponent(lbNota))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lbPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbIBSNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbIBSNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbIBSNActionPerformed

    private void lbResumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbResumoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbResumoActionPerformed

    private void lbTituloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lbTituloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lbTituloActionPerformed

    private void checkArteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkArteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkArteActionPerformed

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

    private void checkHorrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkHorrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkHorrorActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadastrarActionPerformed

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
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LivroGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LivroGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JCheckBox checkArte;
    private javax.swing.JCheckBox checkAventura;
    private javax.swing.JCheckBox checkCulinaria;
    private javax.swing.JCheckBox checkFantasia;
    private javax.swing.JCheckBox checkFiccao;
    private javax.swing.JCheckBox checkHorror;
    private javax.swing.JCheckBox checkInfantil;
    private javax.swing.JCheckBox checkMisterioCrime;
    private javax.swing.JCheckBox checkPoesia;
    private javax.swing.JCheckBox checkReligiao;
    private javax.swing.JCheckBox checkRomance;
    private javax.swing.JCheckBox checkTecnico;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField lbAutor;
    private javax.swing.JTextField lbEditora;
    private javax.swing.JTextField lbEstante;
    private javax.swing.JTextField lbIBSN;
    private javax.swing.JTextField lbNota;
    private javax.swing.JTextField lbPrateleira;
    private javax.swing.JTextField lbResumo;
    private javax.swing.JTextField lbTitulo;
    private javax.swing.JPanel panelGenero;
    // End of variables declaration//GEN-END:variables
}
