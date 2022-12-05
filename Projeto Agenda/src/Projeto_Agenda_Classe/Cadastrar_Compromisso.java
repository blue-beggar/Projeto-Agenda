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

public class Cadastrar_Compromisso {

    private static ArrayList<Contato_Classe> contato;
    private static ArrayList<Endereco_Classe> endereco;
    private static ArrayList<Compromisso_Classe> compromisso;
    private static String IdContato_fk;

    public void setUsuario(ArrayList<Contato_Classe> newContato) {
        this.contato = newContato;
    }

    public void setEndereco(ArrayList<Endereco_Classe> newEndereco) {
        this.endereco = newEndereco;
    }

    public void setCompromisso(ArrayList<Compromisso_Classe> newCompromisso) {
        this.compromisso = newCompromisso;
    }

    public boolean Select_IdContato() {
        Connection con;

        String query = "SELECT IdComunicacao FROM Comunicacao WHERE IdComunicacao = ?";
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
                IdContato_fk = rs.getString("IdContato");
            }
            System.out.println(IdContato_fk);
            ps.close();

            System.out.println("Select ID");
            
            CadastrarCom_TbCom();
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }


    public boolean CadastrarCom_TbCom() {
        Connection con;

        String query = "INSERT INTO Compromisso VALUES (default, ?, ?, ?, ?, ?, ?);";
        PreparedStatement ps;

        java.sql.Date dataISql = new java.sql.Date(this.compromisso.get(0).getDtInicio().getTime());
        java.sql.Date dataFSql = new java.sql.Date(this.compromisso.get(0).getDtFim().getTime());
        try {
            con = ConnectionFactory.getConnection();
            con.setAutoCommit(false);

            ps = con.prepareStatement(query);
            ps.setString(1, this.compromisso.get(0).getTitulo());
            ps.setString(2, this.compromisso.get(0).getDescricao());
            ps.setDate(3, dataISql);
            ps.setDate(4, dataFSql);
            ps.setInt(5, Integer.parseInt(IdContato_fk));
            ps.execute();

            con.commit();
            ps.close();

            System.out.println("Cadastro feito com sucesso!");
            return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }
}
