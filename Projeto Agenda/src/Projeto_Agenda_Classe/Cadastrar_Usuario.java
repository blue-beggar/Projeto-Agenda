package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Cadastrar_Usuario {
    private static ArrayList<Usuario_Classe> login;
    
    public void setUsuario(ArrayList<Usuario_Classe> newLogin){
        this.login = newLogin;
    }
    
     public boolean CadastrarU(){
        Connection con;

        String query = "INSERT INTO USUARIO VALUES (default, \"Duds\", \"Eduardo Luiz\", \"2022-12-04\", \"1234\", default, default);)";
        PreparedStatement ps;try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.execute();
            con.commit();
            ps.close();

            System.out.println("Cadastro feito com sucesso! Realize o login para continuar");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
     }
}
