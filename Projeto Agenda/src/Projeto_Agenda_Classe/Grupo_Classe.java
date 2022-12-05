package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Grupo_Classe {

    public static int IdGrupo;
    public static String titulo;
    public static boolean grupado;

    public Grupo_Classe(String titulo) {
        this.titulo = titulo;
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

    public static int getIdGrupo() {
        return IdGrupo;
    }

    public static void setIdGrupo(int IdGrupo) {
        Grupo_Classe.IdGrupo = IdGrupo;
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
