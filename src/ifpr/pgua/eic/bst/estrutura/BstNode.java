package ifpr.pgua.eic.bst.estrutura;

public class BstNode<T extends Comparable<T>> {
    private T valor;
    private BstNode<T> esquerda;
    private BstNode<T> direita;

    public BstNode(T valor) {
        this.valor = valor;
        this.esquerda = null;
        this.direita = null;
    }

    public T getValor() {
        return valor;
    }

    public void setValor(T valor) {
        this.valor = valor;
    }

    public BstNode<T> getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(BstNode<T> node) {
        this.esquerda = node;
    }

    public BstNode<T> getDireita() {
        return direita;
    }

    public void setDireita(BstNode<T> node) {
        this.direita = node;
    }
}
