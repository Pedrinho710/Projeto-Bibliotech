package dao;

import com.raven.connection.DatabaseConnection;
import com.raven.model.ModelUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class CadastrooUsuarioDAO {
    private final Connection con;

    public CadastrooUsuarioDAO() {
        con = DatabaseConnection.getInstance().getConnection();
    }

  public void insertUsuario(ModelUser user) {
      
    try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO user (Email, password, nome, cpf, telefone, UserName,Status, idade) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getNome());
            ps.setString(4, user.getCpf());
            ps.setString(5, user.getTelefone());
            ps.setString(6, user.getUserName());
            ps.setString(7, user.getStatus());
            ps.setInt(8, user.getIdade());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado com Sucesso!");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void updateUser(ModelUser user) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE user SET email=?, password=?, nome=?, telefone=?, idade=?, UserName=?, cpf=?, status=? WHERE UserID=?");
            ps.setString(1, user.getEmail());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getNome());
            ps.setString(5, user.getTelefone());
            ps.setInt(6, user.getIdade());
            ps.setString(7, user.getUserName());
            ps.setString(8, user.getCpf());
            ps.setInt(9, user.getUserID());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Livro Atualizado");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertUserOrUpdateUser(ModelUser user) {
        if (user.getUserID()== 0) {
            insertUsuario(user);
        } else {
            updateUser(user);
        }
    }
}
