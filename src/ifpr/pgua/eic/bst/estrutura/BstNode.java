package ifpr.pgua.eic.bst.estrutura;
import ifpr.pgua.eic.bst.modelos.Aluno;

public class BstNode {
    private Aluno aluno;
    private BstNode esquerda;
    private BstNode direita;

    public BstNode(Aluno aluno) {
        this.aluno = aluno;
        this.esquerda = null;
        this.direita = null;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public BstNode getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(BstNode node) {
        this.esquerda = node;
    }

    public BstNode getDireita() {
        return direita;
    }

    public void setDireita(BstNode node) {
        this.direita = node;
    }
}
