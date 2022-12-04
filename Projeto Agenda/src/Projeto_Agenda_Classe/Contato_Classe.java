package Projeto_Agenda_Classe;

import java.util.Date;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Contato_Classe {

    public static String nomeC;
    public static Date ndata_nascC;
    public Contacto_Classe contacto_classe;
    public Endereco_Classe endereco_classe;
    public Grupo_Classe grupo_classe;

    public Contato_Classe(String nome) {
        this.nomeC = nome;
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
        return this.nomeC;
    }

    public static String getNomeC() {
        return nomeC;
    }

    public static void setNomeC(String nomeC) {
        Contato_Classe.nomeC = nomeC;
    }

    public static Date getNdata_nascC() {
        return ndata_nascC;
    }

    public static void setNdata_nascC(Date ndata_nascC) {
        Contato_Classe.ndata_nascC = ndata_nascC;
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

    public Grupo_Classe getGrupo_classe() {
        return grupo_classe;
    }

    public void setGrupo_classe(Grupo_Classe grupo_classe) {
        this.grupo_classe = grupo_classe;
    }
    
}
