
package Projeto_Agenda_Classe;

/**@author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza*/
public class Contacto_Classe {
    public String email;
    public int telefone1, telefone2;

    public Contacto_Classe(String telefone1, String telefone2, String email) {
        this.email = email;
        this.telefone1 = Integer.parseInt(telefone1);
        this.telefone2 = Integer.parseInt(telefone2);
    }

    public Contacto_Classe() {
    }

    public int compareTo(Usuario_Classe x) {
        if (this.email.compareTo(x.nome) > 0) {
            return 1;
        }
        if (this.email.compareTo(x.nome) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.email + "," + this.telefone1 + "," + this.telefone2 + ",";
    }  

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefone1() {
        return telefone1;
    }

    public void setTelefone1(int telefone1) {
        this.telefone1 = telefone1;
    }

    public int getTelefone2() {
        return telefone2;
    }

    public void setTelefone2(int telefone2) {
        this.telefone2 = telefone2;
    }
     
}
