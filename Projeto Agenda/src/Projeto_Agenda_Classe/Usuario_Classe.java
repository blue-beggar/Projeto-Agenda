package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Usuario_Classe {

    public String usuarioNomeU, nomeU, data_nascU, senha;
    public Endereco_Classe logradouro, CEP, complemento;
    public Contacto_Classe email, telefone1, telefone2;

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

    public Endereco_Classe getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(Endereco_Classe logradouro) {
        this.logradouro = logradouro;
    }

    public Endereco_Classe getCEP() {
        return CEP;
    }

    public void setCEP(Endereco_Classe CEP) {
        this.CEP = CEP;
    }

    public Endereco_Classe getComplemento() {
        return complemento;
    }

    public void setComplemento(Endereco_Classe complemento) {
        this.complemento = complemento;
    }

    public Contacto_Classe getEmail() {
        return email;
    }

    public void setEmail(Contacto_Classe email) {
        this.email = email;
    }

    public Contacto_Classe getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(Contacto_Classe telefone1) {
        this.telefone1 = telefone1;
    }

    public Contacto_Classe getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(Contacto_Classe telefone2) {
        this.telefone2 = telefone2;
    }

}
