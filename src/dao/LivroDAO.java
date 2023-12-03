
package dao;

import com.raven.connection.DatabaseConnection;
import com.raven.model.ModelLivro;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class LivroDAO {
       private final Connection con;        
       
        public LivroDAO() {
        con = DatabaseConnection.getInstance().getConnection();
    }
      
        public void insertLivro(ModelLivro livro) {
    try {
        PreparedStatement ps = con.prepareStatement("INSERT INTO livro (titulo, editora, nota, prateleira, estante, ibsn, autor) VALUES (?,?,?,?,?,?,?)");
        ps.setString(1, livro.getTitulo());
        ps.setString(2, livro.getEditora());
        ps.setInt(3, livro.getNota());
        ps.setString(4, livro.getPrateleira());
        ps.setString(5, livro.getEstante());
        ps.setString(6, livro.getIbsn());
        ps.setString(7, livro.getAutor());
        ps.execute();
        JOptionPane.showMessageDialog(null, "Livro Cadastrado");
    } catch (SQLException ex) {
        ex.printStackTrace();
    }

    }
         
       public void updateLivo(ModelLivro livro) {
        try {
            PreparedStatement ps = con.prepareStatement("UPDATE livro SET titulo=? editora=? nota=? prateleira=? estante=? ibsn=? autor=? WHERE ID=?");
            ps.setString(1, livro.getTitulo());
            ps.setString(2, livro.getEditora());
            ps.setInt(3, livro.getNota());
            ps.setString(4, livro.getPrateleira());
            ps.setString(5, livro.getEstante());
            ps.setString(6, livro.getIbsn());
            ps.setString(7, livro.getAutor());
            ps.setInt(8, livro.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Livro Atualizado");
        } catch (SQLException ex) {
            System.out.print("não foi");
        }
    }
       
       public void insertLivroORuodateLivro(ModelLivro livro) {
           if(livro.getId()==0){
               insertLivro(livro);
           } else {
               updateLivo(livro);
           }
       }
       
        public void deleteLivo(ModelLivro livro) {
        try {
            PreparedStatement ps = con.prepareStatement("DELETE FROM livro WHERE ID=?");
            ps.setInt(1, livro.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Livro Deletado");
        } catch (SQLException ex) {
            System.out.print("não foi");
        }
    }
           
}
