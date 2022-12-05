package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
import java.awt.Color;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

public class Login_Usuario {

    private static ArrayList<Usuario_Classe> usuario;

    public boolean LogarUsuario() {
        Connection con;
        
        String query = "SELECT UsuarioNome, Senha from Usuario WHERE IdUsuario = \"1\" AND UsuarioNome = ? AND Senha = ?;";
        PreparedStatement ps;
        ResultSet rs;

        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.usuario.get(0).getUsuarioNomeU());
            ps.setString(2, this.usuario.get(0).getSenha());
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Login Sucesso");
            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Usuário existente");
            return false;
        }
    }
}
