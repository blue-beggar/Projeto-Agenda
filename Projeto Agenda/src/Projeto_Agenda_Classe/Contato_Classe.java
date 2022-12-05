package Projeto_Agenda_Classe;

import java.util.Date;

/**
 * @author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza
 */
public class Contato_Classe {

    public static String nomeC;
    public static Date data_nascC;
    public static boolean grupado;
    public Comunicacao_Classe comunicacao_classe;
    public Endereco_Classe endereco_classe;
    public Grupo_Classe grupo_classe;

    public Contato_Classe(String nome) {
        this.nomeC = nome;
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

    public static boolean isGrupado() {
        return grupado;
    }

    public static void setGrupado(boolean grupado) {
        Contato_Classe.grupado = grupado;
    }

    
    public static String getNomeC() {
        return nomeC;
    }

    public static void setNomeC(String nomeC) {
        Contato_Classe.nomeC = nomeC;
    }

    public static Date getData_nascC() {
        return data_nascC;
    }

    public static void setData_nascC(Date data_nascC) {
        Contato_Classe.data_nascC = data_nascC;
    }

    public Comunicacao_Classe getComunicacao_classe() {
        return comunicacao_classe;
    }

    public void setComunicacao_classe(Comunicacao_Classe comunicacao_classe) {
        this.comunicacao_classe = comunicacao_classe;
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