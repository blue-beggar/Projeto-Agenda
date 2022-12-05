package Projeto_Agenda_Classe;

import java.util.Date;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Usuario_Classe {

    public static String usuarioNomeU, nomeU, senha;
    public static Date data_nascU;
    public Comunicacao_Classe comunicacao_classe;
    public Endereco_Classe endereco_classe;
    

    public Usuario_Classe(String nomeU, Date data_nascU) {
        this.data_nascU = data_nascU;
        this.nomeU = nomeU;
        //senha
    }

    public Usuario_Classe(String Usuario, String Senhahex) {
        this.usuarioNomeU = Usuario;
        this.senha = Senhahex;
    }

    public Usuario_Classe(String Nome, Date Data_nasc, long Telefone1, long Telefone2) {
        this.data_nascU = Data_nasc;
        this.nomeU = Nome;
    }
    
    public int compareTo(Usuario_Classe x) {
        if (this.nomeU.compareTo(x.nomeU) > 0) {
            return 1;
        }
        if (this.nomeU.compareTo(x.nomeU) < 0) {
            return -1;
        }

        return 0;
    }
    
    public static String getUsuarioNomeU() {
        return usuarioNomeU;
    }

    public static void setUsuarioNomeU(String usuarioNomeU) {
        Usuario_Classe.usuarioNomeU = usuarioNomeU;
    }

    public static String getNomeU() {
        return nomeU;
    }

    public static void setNomeU(String nomeU) {
        Usuario_Classe.nomeU = nomeU;
    }

    public String getSenha() {
        return senha;
    }

    public  void setSenha(String senha) {
        this.senha = senha;
    }

    public static Date getData_nascU() {
        return data_nascU;
    }

    public static void setData_nascU(Date data_nascU) {
        Usuario_Classe.data_nascU = data_nascU;
    }

    public Comunicacao_Classe getComunicacao_classe() {
        return comunicacao_classe;
    }

    public void setComunicacao_classe(Comunicacao_Classe comunicacao_classe) {
        this.comunicacao_classe = comunicacao_classe;
    }

    public Endereco_Classe getEndereco_classe() {
        return endereco_classe;
    }

    public void setEndereco_classe(Endereco_Classe endereco_classe) {
        this.endereco_classe = endereco_classe;
    }
    
}