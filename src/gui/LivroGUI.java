package gui;

import com.raven.model.ModelLivro;
import dao.LivroDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LivroGUI extends javax.swing.JFrame  implements ActionListener{

    public LivroGUI() {
        initComponents();
        btnCadastrar.addActionListener(this); // Adiciona o ActionListener
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
            if (checkSaude.isSelected()) {
                livro.setGenero("Saúde e Bem-estar");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkTecnico.isSelected()) {
                livro.setGenero("Técnico");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkSociologia.isSelected()) {
                livro.setGenero("Sociologiaa");// Aqui você pode realizar outras ações com base na seleção do CheckBox
            }
            if (checkViagem.isSelected()) {
                livro.setGenero("Viagem");// Aqui você pode realizar outras ações com base na seleção do CheckBox
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
        lbNota = new javax.swing.JTextField();
        lbTitulo = new javax.swing.JTextField();
        lbResumo = new javax.swing.JTextField();
        lbEstante = new javax.swing.JTextField();
        lbEditora = new javax.swing.JTextField();
        lbAutor = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbPrateleira = new javax.swing.JTextField();
        lbIBSN = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
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
        checkViagem = new javax.swing.JCheckBox();
        checkTecnico = new javax.swing.JCheckBox();
        checkSaude = new javax.swing.JCheckBox();
        checkSociologia = new javax.swing.JCheckBox();

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

        lbNota.setBackground(new java.awt.Color(255, 255, 255));
        lbNota.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

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

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 17, 206));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastro de Livro");

        lbPrateleira.setBackground(new java.awt.Color(255, 255, 255));
        lbPrateleira.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Prateleira", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N

        lbIBSN.setBackground(new java.awt.Color(255, 255, 255));
        lbIBSN.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "IBSN", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(87, 17, 206))); // NOI18N
        lbIBSN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lbIBSNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 183, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 176, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(87, 17, 206));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Olá amigo(a) leitor. Este é o seu momento!");

        jLabel3.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(87, 17, 206));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Chegou a hora de cadastrar seus livros preferidos. Ah, não se esqueça");

        jLabel4.setFont(new java.awt.Font("SansSerif", 2, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(87, 17, 206));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText(" de atribuir uma nota, sua opinião é muito importante para nós.");

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

        checkViagem.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkViagem);
        checkViagem.setForeground(new java.awt.Color(0, 0, 0));
        checkViagem.setText("Viagem");
        checkViagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkViagemActionPerformed(evt);
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

        checkSaude.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkSaude);
        checkSaude.setForeground(new java.awt.Color(0, 0, 0));
        checkSaude.setText("Saúde e Bem-Estar");
        checkSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSaudeActionPerformed(evt);
            }
        });

        checkSociologia.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkSociologia);
        checkSociologia.setForeground(new java.awt.Color(0, 0, 0));
        checkSociologia.setText("Sociologia");
        checkSociologia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkSociologiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneroLayout = new javax.swing.GroupLayout(panelGenero);
        panelGenero.setLayout(panelGeneroLayout);
        panelGeneroLayout.setHorizontalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAventura)
                    .addComponent(checkArte)
                    .addComponent(checkCulinaria))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkFiccao)
                    .addComponent(checkFantasia)
                    .addComponent(checkHorror))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkPoesia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkMisterioCrime, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkInfantil))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkReligiao, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkRomance, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkSaude))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkViagem, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(checkTecnico)
                    .addComponent(checkSociologia, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkReligiao)
                        .addComponent(checkTecnico)))
                .addGap(10, 10, 10)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkArte)
                        .addComponent(checkFiccao)
                        .addComponent(checkMisterioCrime))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneroLayout.createSequentialGroup()
                        .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(checkRomance)
                            .addComponent(checkSociologia))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(checkViagem)
                    .addComponent(checkSaude)
                    .addComponent(checkPoesia)
                    .addComponent(checkHorror)
                    .addComponent(checkCulinaria))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTitulo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 555, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(50, 50, 50))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lbResumo, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lbNota, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(panelGenero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)))
                .addComponent(lbResumo, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbPrateleira, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbIBSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbEditora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEstante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(panelGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
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

    private void checkViagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkViagemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkViagemActionPerformed

    private void checkTecnicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkTecnicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkTecnicoActionPerformed

    private void checkSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSaudeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSaudeActionPerformed

    private void checkSociologiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkSociologiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkSociologiaActionPerformed

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
    private javax.swing.JCheckBox checkSaude;
    private javax.swing.JCheckBox checkSociologia;
    private javax.swing.JCheckBox checkTecnico;
    private javax.swing.JCheckBox checkViagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
