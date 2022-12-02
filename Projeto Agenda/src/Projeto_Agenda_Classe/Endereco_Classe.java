package Projeto_Agenda_Classe;

/**@author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza*/
public class Endereco_Classe {
    public String Logradouro;
    public int CEP;

    public Endereco_Classe(String Logradouro, String CEP) {
        this.Logradouro = Logradouro;
        this.CEP = Integer.parseInt(CEP);
    }

    public Endereco_Classe() {
    }


    @Override
    public String toString() {
        return this.Logradouro + "," + this.CEP;
    }   

    public String getLogradouro() {
        return Logradouro;
    }

    public void setLogradouro(String Logradouro) {
        this.Logradouro = Logradouro;
    }

    public int getCEP() {
        return CEP;
    }

    public void setCEP(int CEP) {
        this.CEP = CEP;
    }
}