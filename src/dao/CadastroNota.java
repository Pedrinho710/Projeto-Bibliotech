package dao;

import com.raven.connection.DatabaseConnection;
import com.raven.model.ModelNotas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroNota {

    private final Connection con;

    public CadastroNota() {
        con = DatabaseConnection.getInstance().getConnection();
    }
    
    public void insertNota(ModelNotas nota) {
      
    try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO notas (avaliacao) VALUES (?)");
            ps.setInt(1, nota.getNota());
           
            ps.execute();
                JOptionPane.showMessageDialog(null, "Avaliação Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateNota(ModelNotas nota) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE user SET avaliacao=? WHERE id=?");
            ps.setInt(1, nota.getAvaliacao());
            ps.setInt(2, nota.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Livro Atualizado");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertNotaOrUpdateNota(ModelNotas nota) {
        if (nota.getId()== 0) {
            insertNota(nota);
        } else {
            updateNota(nota);
        }
    }
}