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

    private static ArrayList<Usuario_Classe> usuario;
    private static ArrayList<Endereco_Classe> endereco;
    private static ArrayList<Comunicacao_Classe> comunicacao;
    private static String IdEndereco_fk;
    private static String IdComunicacao_fk;

    public void setUsuario(ArrayList<Usuario_Classe> newUsuario) {
        this.usuario = newUsuario;
    }

    public void setEndereco(ArrayList<Endereco_Classe> newEndereco) {
        this.endereco = newEndereco;
    }

    public void setCompromisso(ArrayList<Comunicacao_Classe> newComunicacao) {
        this.comunicacao = newComunicacao;
    }

    public boolean CadastrarU_TbC() {
        Connection con;

        String query = "INSERT INTO Comunicacao VALUES (default, ?, ?, ?);";
        PreparedStatement ps;
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.comunicacao.get(0).getEmail());
            ps.setLong(2, this.comunicacao.get(0).getTelefone1());
            ps.setLong(3, this.comunicacao.get(0).getTelefone2());
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Cadastro Comunicação");

            Select_IdC();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean Select_IdC() {
        Connection con;

        String query = "SELECT IdComunicacao FROM Comunicacao WHERE IdComunicacao = \"1\"";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            con.commit();
            while (rs.next()) {
                IdComunicacao_fk = rs.getString("IdComunicacao");
            }
            System.out.println(IdComunicacao_fk);
            ps.close();

            System.out.println("Select ID");
            
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean CadastrarU_TbE() {
        Connection con;

        String query = "INSERT INTO Endereco VALUES (default, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps;
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.endereco.get(0).getLogradouro());
            ps.setInt(2, this.endereco.get(0).getCep());
            ps.setString(3, this.endereco.get(0).getComplemento());
            ps.setString(4, this.endereco.get(0).getBairro());
            ps.setString(5, this.endereco.get(0).getCidade());
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Cadastro Endereço");
            Select_IdE();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean Select_IdE() {
        Connection con;

        String query = "SELECT IdEndereco FROM Endereco WHERE IdEndereco = \"1\"";
        PreparedStatement ps;
        ResultSet rs;
        try {
            ConnectionFactory cf = new ConnectionFactory();
            con = cf.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            rs = ps.executeQuery();

            con.commit();
            while (rs.next()) {
                IdEndereco_fk = rs.getString("IdEndereco");
            }
            System.out.println(IdEndereco_fk);
            ps.close();

            System.out.println("ID endereço");
            CadastrarU_TbU();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public boolean CadastrarU_TbU() {
        Connection con;

        String query = "INSERT INTO USUARIO VALUES (default, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps;

        java.sql.Date dataSql = new java.sql.Date(this.usuario.get(0).getData_nascU().getTime());
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.usuario.get(0).getUsuarioNomeU());
            ps.setString(2, this.usuario.get(0).getNomeU());
            ps.setDate(3, dataSql);
            ps.setString(4, this.usuario.get(0).getSenha());
            ps.setInt(5, Integer.parseInt(IdEndereco_fk));
            ps.setInt(6, Integer.parseInt(IdComunicacao_fk));
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
