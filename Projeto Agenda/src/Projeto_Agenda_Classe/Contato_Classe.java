package Projeto_Agenda_Classe;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Contato_Classe {

    public static String nomeC, data_nascC;
    public Contacto_Classe contacto_classe;
    public Endereco_Classe endereco_classe;
    public Grupo_Classe grupo_classe;

    public Contato_Classe(String nome, String data_nasc) {
        this.nomeC = nome;
        this.data_nascC = data_nasc;
    }

    public Contato_Classe() {
    }

    public int compareTo(Contato_Classe x) {
        if (this.nomeC.compareTo(x.nomeC) > 0) {
            return 1;
        }
        if (this.nomeC.compareTo(x.nomeC) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        //nome,cpf,data_nasc,endereco,numero,cidade,estado
        return this.nomeC + "," + this.data_nascC;
    }

    public Grupo_Classe getGrupo_classe() {
        return grupo_classe;
    }

    public void setGrupo_classe(Grupo_Classe grupo_classe) {
        this.grupo_classe = grupo_classe;
    }
    
    public String getNomeC() {
        return nomeC;
    }

    public void setNomeC(String nomeC) {
        this.nomeC = nomeC;
    }

    public String getData_nascC() {
        return data_nascC;
    }

    public void setData_nascC(String data_nascC) {
        this.data_nascC = data_nascC;
    }

    public Contacto_Classe getContacto_classe() {
        return contacto_classe;
    }

    public void setContacto_classe(Contacto_Classe contacto_classe) {
        this.contacto_classe = contacto_classe;
    }

    public Endereco_Classe getEndereco_classe() {
        return endereco_classe;
    }

    public void setEndereco_classe(Endereco_Classe endereco_classe) {
        this.endereco_classe = endereco_classe;
    }
    
}
