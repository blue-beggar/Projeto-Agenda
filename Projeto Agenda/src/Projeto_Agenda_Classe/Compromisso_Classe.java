package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Compromisso_Classe {

    public static String titulo, descricao, DtInicio, DtFim;
    public Contato_Classe contato_classe;
    public Usuario_Classe usuario_classe;
    public Endereco_Classe endereco_classe;

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

    public Contato_Classe getContato_classe() {
        return contato_classe;
    }

    public void setContato_classe(Contato_Classe contato_classe) {
        this.contato_classe = contato_classe;
    }

    public Usuario_Classe getUsuario_classe() {
        return usuario_classe;
    }

    public void setUsuario_classe(Usuario_Classe usuario_classe) {
        this.usuario_classe = usuario_classe;
    }

    public Endereco_Classe getEndereco_classe() {
        return endereco_classe;
    }

    public void setEndereco_classe(Endereco_Classe endereco_classe) {
        this.endereco_classe = endereco_classe;
    }
    
}
