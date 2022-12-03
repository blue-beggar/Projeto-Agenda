package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection() throws SQLException {

        try {

            Class.forName("com.mysql.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/crudads?useSSL=false";
            String user = "root";
            String password = "";

            return DriverManager.getConnection(url, user, password);

        } catch (ClassNotFoundException ex) {

            throw new SQLException(ex.getMessage());
        }
    }
}
