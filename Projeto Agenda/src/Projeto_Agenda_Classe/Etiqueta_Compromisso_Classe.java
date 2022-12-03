package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Etiqueta_Compromisso_Classe {

    public String titulo;

    public Etiqueta_Compromisso_Classe(String titulo) {
        this.titulo = titulo;
    }

    public Etiqueta_Compromisso_Classe() {
    }

    public int compareTo(Etiqueta_Compromisso_Classe c) {
        if (this.titulo.compareTo(c.titulo) > 0) {
            return 1;
        }
        if (this.titulo.compareTo(c.titulo) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
