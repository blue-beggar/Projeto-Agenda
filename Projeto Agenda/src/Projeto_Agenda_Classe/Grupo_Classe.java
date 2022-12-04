package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Grupo_Classe {

    public static String titulo;
    public static boolean grupado;

    public Grupo_Classe(String titulo) {
        this.titulo = titulo;
    }

    public Grupo_Classe() {
    }

    public int compareTo(Grupo_Classe c) {
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
    
    public static boolean isGrupado() {
        return grupado;
    }

    public static void setGrupado(boolean grupado) {
        Grupo_Classe.grupado = grupado;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
