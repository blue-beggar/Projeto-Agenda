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
    
    public static int getIdComunicacao() {
        return IdComunicacao;
    }

    public static void setIdComunicacao(int IdComunicacao) {
        Comunicacao_Classe.IdComunicacao = IdComunicacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(long telefone1) {
        this.telefone1 = telefone1;
    }

    public  long getTelefone2() {
        return telefone2;
    }

    public  void setTelefone2(long telefone2) {
        this.telefone2 = telefone2;
    }

}
