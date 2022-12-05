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


    public static String getBairro() {
        return bairro;
    }

    public static void setBairro(String bairro) {
        Endereco_Classe.bairro = bairro;
    }

    public static int getCep() {
        return cep;
    }

    public static void setCep(int cep) {
        Endereco_Classe.cep = cep;
    }

    public static int getIdEndereco() {
        return IdEndereco;
    }

    public static void setIdEndereco(int IdEndereco) {
        Endereco_Classe.IdEndereco = IdEndereco;
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
