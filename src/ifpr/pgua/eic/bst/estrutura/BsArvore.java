package ifpr.pgua.eic.bst.estrutura;

public class BsArvore {

    private BstNode raiz;

    public BsArvore() {
        this.raiz = null;
    }

    public BstNode getRaiz() {
        return raiz;
    }

    public void insert(BstNode novoNode) {
        insert(raiz, novoNode);
    }
    public void delete(int chave) {
        delete(raiz, chave);
    }
    
    public BstNode search(int chave) {
        return search(raiz, chave);
    }

    /* =================================================== */

    /* Percorre árvore até o fim de seu lado direito */
    private BstNode achaMax(BstNode node) {
        if (this.raiz == null) {
            return null;
        }

        if (node.getDireita() != null) {
            return node.getDireita();
        }

        return node;
    }

    private BstNode insert(BstNode raiz, BstNode novoNode) {

        if (this.raiz == null) {
            return this.raiz = novoNode;
        }

        /*
         * se a raiz dessa iteração do método for null,
         * retornar novoNode para o método set[LADO] que o chamou.
         */

        if (raiz == null) {
            return novoNode;
        }

        /*
         * Se chave nova for menor/igual ou maior que chave do node atual,
         * atualizar o node do lado especificado com o retorno da próxima 
         * iteração do método, que contém o novoNode inserido na árvore.
         */

        if (novoNode.getAluno().getMatricula() <= raiz.getAluno().getMatricula()) {

            raiz.setEsquerda(insert(raiz.getEsquerda(), novoNode));

        } else {
            raiz.setDireita(insert(raiz.getDireita(), novoNode));
        }
    
        return raiz;
    }

    private BstNode delete(BstNode raiz, int chave) {             

        /*
         * se o node atual for null, retornar null para o método set[LADO] que o chamou.
         */

        if (raiz == null) {
            return null;
        }

        if (chave < raiz.getAluno().getMatricula()) {

            raiz.setEsquerda(
                delete(raiz.getEsquerda(), chave));

        } else if (chave > raiz.getAluno().getMatricula()) {

            raiz.setDireita(
                delete(raiz.getDireita(), chave));
        }
        else { /* SE CHAVE FOR ENCONTRADA: */

            /* 
             * caso tiver um ou nenhum filho: se um lado for null, retorna o outro
             * dessa forma, se os dois lados forem null,
             * será retornado null assim como no caso base.
             */

            if (raiz.getEsquerda() == null) {
                return raiz.getDireita();
            } else if (raiz.getDireita() == null) {
                return raiz.getEsquerda();
            }
            else { /* caso tiver dois filhos */
                
                /*
                 * reduz o problema para o caso tiver apenas um/nenhum filho,
                 * achando o MAIOR valor do seu lado ESQUERDO e copiando os dados desse node para a "raiz" atual.
                 */

                raiz.setAluno(achaMax(raiz.getEsquerda()).getAluno());

                /* 
                 * chama o método delete usando a chave do maior valor esquerdo
                 */

                raiz.setEsquerda(delete(raiz.getEsquerda(), raiz.getAluno().getMatricula()));
            }
        }
        
        return raiz;
    }                                                              


    private BstNode search(BstNode raiz, int chave) {
        if (raiz == null) {
            return null;
        }
    
        if (raiz.getAluno().getMatricula() > chave) {
            return search(raiz.getEsquerda(), chave);
        } else if (raiz.getAluno().getMatricula() < chave) {
            return search(raiz.getDireita(), chave);
        } else {
            return raiz;
        }
    }

}
