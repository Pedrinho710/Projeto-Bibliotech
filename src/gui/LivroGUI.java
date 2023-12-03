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
        checkAA = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();

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

        checkAA.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(checkAA);
        checkAA.setForeground(new java.awt.Color(0, 0, 0));
        checkAA.setText("Ação e Aventura");

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox2.setText("Culinária");

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox3.setText("Arte");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });

        jCheckBox4.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox4);
        jCheckBox4.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox4.setText("Fantasia");

        jCheckBox5.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox5);
        jCheckBox5.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox5.setText("Ficção");

        jCheckBox6.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox6);
        jCheckBox6.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox6.setText("Horror");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox7);
        jCheckBox7.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox7.setText("Infantil");

        jCheckBox8.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox8);
        jCheckBox8.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox8.setText("Mistério e Crime");

        jCheckBox9.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox9);
        jCheckBox9.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox9.setText("Poesia");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox10);
        jCheckBox10.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox10.setText("Religião");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox11);
        jCheckBox11.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox11.setText("Romance");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox12);
        jCheckBox12.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox12.setText("Viagem");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox13);
        jCheckBox13.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox13.setText("Tecnologia");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox14);
        jCheckBox14.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox14.setText("Saúde e Bem-Estar");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox15);
        jCheckBox15.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox15.setText("Sociologia");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelGeneroLayout = new javax.swing.GroupLayout(panelGenero);
        panelGenero.setLayout(panelGeneroLayout);
        panelGeneroLayout.setHorizontalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(checkAA)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox2))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox5)
                    .addComponent(jCheckBox4)
                    .addComponent(jCheckBox6))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox9, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox7))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox10, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox14))
                .addGap(35, 35, 35)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox12, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCheckBox13)
                    .addComponent(jCheckBox15, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelGeneroLayout.setVerticalGroup(
            panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelGeneroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(checkAA)
                        .addComponent(jCheckBox4)
                        .addComponent(jCheckBox7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox10)
                        .addComponent(jCheckBox13)))
                .addGap(10, 10, 10)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jCheckBox3)
                        .addComponent(jCheckBox5)
                        .addComponent(jCheckBox8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelGeneroLayout.createSequentialGroup()
                        .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCheckBox11)
                            .addComponent(jCheckBox15))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(panelGeneroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox12)
                    .addComponent(jCheckBox14)
                    .addComponent(jCheckBox9)
                    .addComponent(jCheckBox6)
                    .addComponent(jCheckBox2))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
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

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

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
    private javax.swing.JCheckBox checkAA;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
