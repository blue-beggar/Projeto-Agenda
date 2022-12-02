package Projeto_Agenda_Classe;

/**@author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza*/
public class Compromisso_Classe {
    public String x;

    public Compromisso_Classe(String x) {
        this.x = x;
    }

    public Compromisso_Classe() {
    }

    public int compareTo(Usuario_Classe x) {
        if (this.x.compareTo(x.nome) > 0) {
            return 1;
        }
        if (this.x.compareTo(x.nome) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        return this.x + "," + this;
    }  
    
    //alt+insert = get setter    
}
