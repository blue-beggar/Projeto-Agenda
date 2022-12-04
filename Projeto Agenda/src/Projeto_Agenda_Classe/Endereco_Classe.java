package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Endereco_Classe {

    public static String logradouro, complemento, cidade, estado;
    public static int CEP, IdEndereco;

    public Endereco_Classe(String logradouro, String complemento, String CEP,String cidade,String estado) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.CEP = Integer.parseInt(CEP);
        this.cidade = cidade;
        this.estado = estado;
    }

    public Endereco_Classe() {
    }

    @Override
    public String toString() {
        return this.logradouro + "," + this.CEP + "," + this.complemento + "," + this.cidade + "," + this.estado;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }

}
