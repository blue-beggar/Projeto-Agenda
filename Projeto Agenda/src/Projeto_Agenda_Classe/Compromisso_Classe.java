package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Compromisso_Classe {

    public String titulo, descricao, DtInicio, DtFim;
    public Contato_Classe nomeC, emailC;
    public Usuario_Classe nomeU, emailU;
    public Endereco_Classe logradouro, CEP, complemento;

    public Compromisso_Classe(String titulo, String descricao, String DtInicio, String DtFim) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.DtInicio = DtInicio;
        this.DtFim = DtFim;
    }

    public Compromisso_Classe() {
    }

    public int compareTo(Compromisso_Classe x) {
        if (this.titulo.compareTo(x.titulo) > 0) {
            return 1;
        }
        if (this.titulo.compareTo(x.titulo) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.titulo + "," + this.descricao + "," + this.DtInicio + "," + this.DtFim;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDtInicio() {
        return DtInicio;
    }

    public void setDtInicio(String DtInicio) {
        this.DtInicio = DtInicio;
    }

    public String getDtFim() {
        return DtFim;
    }

    public void setDtFim(String DtFim) {
        this.DtFim = DtFim;
    }

    public Contato_Classe getNomeC() {
        return nomeC;
    }

    public void setNomeC(Contato_Classe nomeC) {
        this.nomeC = nomeC;
    }

    public Contato_Classe getEmailC() {
        return emailC;
    }

    public void setEmailC(Contato_Classe emailC) {
        this.emailC = emailC;
    }

    public Usuario_Classe getNomeU() {
        return nomeU;
    }

    public void setNomeU(Usuario_Classe nomeU) {
        this.nomeU = nomeU;
    }

    public Usuario_Classe getEmailU() {
        return emailU;
    }

    public void setEmailU(Usuario_Classe emailU) {
        this.emailU = emailU;
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

}
