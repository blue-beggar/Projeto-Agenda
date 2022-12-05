package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Comunicacao_Classe {

    public static int IdComunicacao;
    public static String email;
    public static long telefone1, telefone2;

    public Comunicacao_Classe(long telefone1, long telefone2, String email) {
        this.email = email;
        this.telefone1 = telefone1;
        this.telefone2 = telefone2;
    }

    @Override
    public String toString() {
        return this.email + "," + this.telefone1 + "," + this.telefone2 + ",";
    }

    public static int getIdComunicacao() {
        return IdComunicacao;
    }

    public static void setIdComunicacao(int IdComunicacao) {
        Comunicacao_Classe.IdComunicacao = IdComunicacao;
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Comunicacao_Classe.email = email;
    }

    public static long getTelefone1() {
        return telefone1;
    }

    public static void setTelefone1(long telefone1) {
        Comunicacao_Classe.telefone1 = telefone1;
    }

    public static long getTelefone2() {
        return telefone2;
    }

    public static void setTelefone2(long telefone2) {
        Comunicacao_Classe.telefone2 = telefone2;
    }

}
