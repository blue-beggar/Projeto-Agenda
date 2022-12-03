package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Contato_Classe {

    public String nomeC, data_nascC;
    public Endereco_Classe logradouro, CEP, complemento;
    public Contacto_Classe email, telefone1, telefone2;

    public Contato_Classe(String nome, String data_nasc) {
        this.nomeC = nome;
        this.data_nascC = data_nasc;
    }

    public Contato_Classe() {
    }

    public int compareTo(Contato_Classe x) {
        if (this.nomeC.compareTo(x.nomeC) > 0) {
            return 1;
        }
        if (this.nomeC.compareTo(x.nomeC) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        //nome,cpf,data_nasc,endereco,numero,cidade,estado
        return this.nomeC + "," + this.data_nascC;
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

    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getData_nascC() {
        return data_nascC;
    }

    public void setData_nascC(String data_nascC) {
        this.data_nascC = data_nascC;
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
