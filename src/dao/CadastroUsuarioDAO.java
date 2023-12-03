package dao;

import com.raven.connection.DatabaseConnection;
import com.raven.model.ModelUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

    public class CadastroUsuarioDAO {
    private final Connection con;

    public CadastroUsuarioDAO() {
        con = DatabaseConnection.getInstance().getConnection();
    }
    
    public void insertUser(ModelUser user) {
        try {
            PreparedStatement ps = con.prepareStatement("INSERT INTO user (userName, Email, Password, Status, nome, cpf, telefone, sexo) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getStatus());
            ps.setString(5, user.getNome());
            ps.setString(6, user.getCpf());
            ps.setString(7, user.getTelefone());
            ps.setString(8, user.getSexo());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuário Cadastrado");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
     public void updateUser(ModelUser user) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE user SET userName=?, Email=?, Password=?, Status=?, nome=?, cpf=?, telefone=? sexo=? WHERE UserID=?");
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setString(4, user.getStatus());
            ps.setString(5, user.getNome());
            ps.setString(6, user.getCpf());
            ps.setString(7, user.getTelefone());
            ps.setString(8, user.getSexo());
            ps.setInt(8, user.getUserID());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario Atualizado");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void insertUserOrUpdateUser(ModelUser user) {
        if (user.getUserID()== 0) {
            insertUser(user);
        } else {
            updateUser(user);
        }
    }
}