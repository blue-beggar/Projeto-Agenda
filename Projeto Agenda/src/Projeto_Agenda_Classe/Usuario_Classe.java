package Projeto_Agenda_Classe;

/**@author Eduardo Luiz Sales do Prado / João Pedro Bettin de Souza*/
public class Usuario_Classe {

    public String nome, data_nasc;

    public Usuario_Classe(String nome, String data_nasc) {
        this.nome = nome;
        this.data_nasc = data_nasc;
    }

    public Usuario_Classe() {
    }

    public int compareTo(Usuario_Classe x) {
        if (this.nome.compareTo(x.nome) > 0) {
            return 1;
        }
        if (this.nome.compareTo(x.nome) < 0) {
            return -1;
        }

        return 0;
    }

    @Override
    public String toString() {
        //nome,cpf,data_nasc,endereco,numero,cidade,estado
        return this.nome + "," + this.data_nasc;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(String data_nasc) {
        this.data_nasc = data_nasc;
    }
}
