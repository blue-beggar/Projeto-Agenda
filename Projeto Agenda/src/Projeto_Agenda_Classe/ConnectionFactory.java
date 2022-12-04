package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    public static Connection getConnection() throws SQLException{
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/Projeto_Agenda?useSSL=false", "root", "");
            
        } catch(ClassNotFoundException ex){
            
            throw new SQLException(ex.getMessage());
        }
    }
}