package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Contacto_Classe {

    public static String email;
    public static long telefone1, telefone2;

    public Contacto_Classe(String telefone1, String telefone2, String email) {
        this.email = email;
        this.telefone1 = Integer.parseInt(telefone1);
        this.telefone2 = Integer.parseInt(telefone2);
    }

    public Contacto_Classe() {
    }

    @Override
    public String toString() {
        return this.email + "," + this.telefone1 + "," + this.telefone2 + ",";
    }

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Contacto_Classe.email = email;
    }

    public static long getTelefone1() {
        return telefone1;
    }

    public static void setTelefone1(long telefone1) {
        Contacto_Classe.telefone1 = telefone1;
    }

    public static long getTelefone2() {
        return telefone2;
    }

    public static void setTelefone2(long telefone2) {
        Contacto_Classe.telefone2 = telefone2;
    }
    
}
