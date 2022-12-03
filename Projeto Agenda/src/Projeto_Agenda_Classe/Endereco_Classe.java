package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Endereco_Classe {

    public String logradouro, complemento;
    public int CEP;

    public Endereco_Classe(String logradouro, String complemento, String CEP) {
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.CEP = Integer.parseInt(CEP);
    }

    public Endereco_Classe() {
    }

    @Override
    public String toString() {
        return this.logradouro + "," + this.CEP + "," + this.complemento;
    }

    public String getLogradouro() {
        return logradouro;
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
