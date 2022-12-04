package Projeto_Agenda_Classe;

import java.util.Date;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Usuario_Classe {

    public static String usuarioNomeU, nomeU, senha;
    public static Date data_nascU;
    public Contacto_Classe contacto_classe;
    public Endereco_Classe endereco_classe;

    public Usuario_Classe(String usuarioNomeU, String nomeU, String data_nascU, String senha) {
        this.usuarioNomeU = usuarioNomeU;
        this.nomeU = nomeU;
        this.senha = senha;
        this.senha = senha;
        //senha
    }

    public Usuario_Classe() {
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

    @Override
    public String toString() {
        return this.nomeU + "," + this.data_nascU;//senha
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

    public static String getSenha() {
        return senha;
    }

    public static void setSenha(String senha) {
        Usuario_Classe.senha = senha;
    }

    public static Date getData_nascU() {
        return data_nascU;
    }

    public static void setData_nascU(Date data_nascU) {
        Usuario_Classe.data_nascU = data_nascU;
    }

    public Contacto_Classe getContacto_classe() {
        return contacto_classe;
    }

    public void setContacto_classe(Contacto_Classe contacto_classe) {
        this.contacto_classe = contacto_classe;
    }

    public Endereco_Classe getEndereco_classe() {
        return endereco_classe;
    }

    public void setEndereco_classe(Endereco_Classe endereco_classe) {
        this.endereco_classe = endereco_classe;
    }

}
