package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Usuario_Classe {

    public static String usuarioNomeU, nomeU, data_nascU, senha;
    public Contacto_Classe contacto_classe;
    public Endereco_Classe endereco_classe;

    public Usuario_Classe(String usuarioNomeU, String nomeU, String data_nascU, String senha) {
        this.usuarioNomeU = usuarioNomeU;
        this.nomeU = nomeU;
        this.data_nascU = data_nascU;
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

    public String getUsuarioNomeU() {
        return usuarioNomeU;
    }

    public void setUsuarioNomeU(String usuarioNomeU) {
        this.usuarioNomeU = usuarioNomeU;
    }

    public String getNomeU() {
        return nomeU;
    }

    public void setNomeU(String nomeU) {
        this.nomeU = nomeU;
    }

    public String getData_nascU() {
        return data_nascU;
    }

    public void setData_nascU(String data_nascU) {
        this.data_nascU = data_nascU;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
