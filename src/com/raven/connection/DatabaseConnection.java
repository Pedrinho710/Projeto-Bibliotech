
package com.raven.connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseConnection {
    
    private static DatabaseConnection instance;
    private Connection connection;

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    private DatabaseConnection() {

    }

    /**
     *
     * @throws SQLException
     */
    public void connectToDatabase() throws SQLException {
        String server = "localhost";
        String port = "3306";
        String database = "bibliotech";
        String userName = "root";
        /*String password = "20012003";*/
        String password = "Val302302302";
        connection = java.sql.DriverManager.getConnection("jdbc:mysql://" + server + ":" + port + "/" + database, userName, password);
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    public PreparedStatement prepareStatement(String insert_into_livro_titulo_editora_nota_pra) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

