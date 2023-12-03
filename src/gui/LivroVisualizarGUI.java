
package gui;


import com.raven.connection.DatabaseConnection;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.PreparedStatement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;



public class LivroVisualizarGUI extends javax.swing.JFrame {
    
    private DefaultTableModel modeloTabela;
    
    

    public LivroVisualizarGUI() {
        initComponents();
        carregarDadosParaTabela();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        aplicarOrdenacaoPorNota();
        configurarEventoBotaoPesquisar();
        
    }
    
    

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        PesquisaLivro = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        BotaoPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaLivro = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("TelaVisualizar");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setMaximumSize(new java.awt.Dimension(93552, 95548));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(932, 948));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(87, 17, 206));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VISUALIZAR LIVROS");
        jLabel1.setToolTipText("");
        jLabel1.setMaximumSize(new java.awt.Dimension(204, 32));
        jLabel1.setMinimumSize(new java.awt.Dimension(204, 32));
        jLabel1.setPreferredSize(new java.awt.Dimension(204, 32));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/lupa.png"))); // NOI18N
        jLabel2.setText("jLabel2");

        BotaoPesquisar.setBackground(new java.awt.Color(87, 17, 206));
        BotaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPesquisar.setText("PESQUISAR");

        TabelaLivro.setBackground(new java.awt.Color(204, 204, 204));
        TabelaLivro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "titulo", "autor", "prateleria", "estante", "editora", "genero", "ibsn", "nota", "resumo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaLivro);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(703, 703, 703)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PesquisaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotaoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaLivro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BotaoPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1192, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1278, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void aplicarOrdenacaoPorNota() {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabela);
            TabelaLivro.setRowSorter(sorter);

        sorter.setComparator(7, (Object o1, Object o2) -> {
            // Comparador para a coluna "nota" (índice 7)
            Double nota1 = Double.parseDouble(o1.toString());
            Double nota2 = Double.parseDouble(o2.toString());
            return nota2.compareTo(nota1); // Ordenação decrescente
        });
        sorter.setSortable(7, true); // Habilita a ordenação para a coluna "nota"
        sorter.toggleSortOrder(7); // Aplica a ordenação inicial
    }
    
    
    private void configurarEventoBotaoPesquisar() {
        BotaoPesquisar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                pesquisarNaTabela(PesquisaLivro.getText().trim());
            }
        });
    }
    
    private void pesquisarNaTabela(String textoPesquisa) {
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modeloTabela);
        TabelaLivro.setRowSorter(sorter);

        // Verifica se o texto de pesquisa não está vazio
        if (!textoPesquisa.isEmpty()) {
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + textoPesquisa)); // Ignora maiúsculas e minúsculas ao pesquisar
        } else {
            TabelaLivro.setRowSorter(sorter); // Se o texto de pesquisa estiver vazio, restaura o sorter padrão
        }
    }
    
    
    
    
    private void configurarInterface() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Visualizar Livros");
        setResizable(false);

        JPanel jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jScrollPane1 = new JScrollPane();
        TabelaLivro = new JTable();
        jLabel2 = new JLabel();
        PesquisaLivro = new JTextField();
        BotaoPesquisar = new JButton();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24));
        jLabel1.setForeground(new java.awt.Color(87, 17, 206));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VISUALIZAR LIVROS");
        

        modeloTabela = new DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Título", "Autor", "Prateleira", "Estante", "Editora", "Gênero", "ISBN", "Nota", "Resumo"
            }
        );
        TabelaLivro.setModel(modeloTabela);
        jScrollPane1.setViewportView(TabelaLivro);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/lupa.png"))); // Adicione o caminho correto para o ícone

        BotaoPesquisar.setBackground(new java.awt.Color(87, 17, 206));
        BotaoPesquisar.setForeground(new java.awt.Color(255, 255, 255));
        BotaoPesquisar.setText("PESQUISAR");

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(265, 265, 265)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(PesquisaLivro, GroupLayout.PREFERRED_SIZE, 309, GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BotaoPesquisar, GroupLayout.PREFERRED_SIZE, 133, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(PesquisaLivro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(BotaoPesquisar))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE))
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
        
    }
    
    
    
        private void carregarDadosParaTabela() {
        try {
            DatabaseConnection dbConnection = DatabaseConnection.getInstance();
            dbConnection.connectToDatabase(); // Conectar ao banco de dados

            Connection conexao = dbConnection.getConnection();

            String sql = "SELECT * FROM livro"; // Sua consulta SQL aqui

            PreparedStatement stmt = conexao.prepareStatement(sql);
            ResultSet resultado = stmt.executeQuery();

            modeloTabela = new DefaultTableModel(
                    new Object[][]{},
                    new String[]{
                            "titulo", "autor", "prateleira", "estante", "editora", "genero", "ibsn", "nota", "resumo"
                    }
            );

            TabelaLivro.setModel(modeloTabela);

            while (resultado.next()) {
                Object[] linha = new Object[9];
                // Preencha o array 'linha' com os valores obtidos do banco de dados (exemplo):
                linha[0] = resultado.getString("titulo");
                linha[1] = resultado.getString("autor");
                linha[2] = resultado.getString("prateleira");
                linha[3] = resultado.getString("estante");
                linha[4] = resultado.getString("editora");
                linha[5] = resultado.getString("genero");
                linha[6] = resultado.getString("ibsn");
                linha[7] = resultado.getString("nota");
                linha[8] = resultado.getString("resumo");
                // ... preencha os outros campos conforme necessário ...
                modeloTabela.addRow(linha); // Adiciona a linha à tabela
                
            }

            resultado.close();
            stmt.close();
            conexao.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LivroVisualizarGUI().setVisible(true);
        });
    }
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotaoPesquisar;
    private javax.swing.JTextField PesquisaLivro;
    private javax.swing.JTable TabelaLivro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
    
        
    





}
