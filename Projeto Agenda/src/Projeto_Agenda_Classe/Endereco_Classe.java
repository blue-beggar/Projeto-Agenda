package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Endereco_Classe {

    public static String logradouro, bairro, complemento, cidade, estado;
    public static int cep, IdEndereco;

    
    public Endereco_Classe(String logradouro, String bairro, int cep, String complemento, String cidade,String estado) {
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }


    public  String getBairro() {
        return bairro;
    }

    public  void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public  int getCep() {
        return cep;
    }

    public  void setCep(int cep) {
        this.cep = cep;
    }

    public  int getIdEndereco() {
        return IdEndereco;
    }

    public  void setIdEndereco(int IdEndereco) {
        this.IdEndereco = IdEndereco;
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
}
