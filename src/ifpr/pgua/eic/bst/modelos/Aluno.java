package ifpr.pgua.eic.bst.modelos;

public class Aluno {
    private int matricula;
    private String nome;
    private Data nascimento;

    public Aluno(int matricula, String nome, Data nascimento) {
        this.matricula = matricula;
        this.nome = nome;
        this.nascimento = nascimento;
    }

    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Data getNascimento() {
        return nascimento;
    }
    public void setNascimento(Data nascimento) {
        this.nascimento = nascimento;
    }

    public String toString() {
        String str = "";

        str +="Matricula: "+matricula;
        str +=" - Nome: "+nome;
        str +=" - Data de Nascimento: "+nascimento.toString();

        return str;
    }
}
