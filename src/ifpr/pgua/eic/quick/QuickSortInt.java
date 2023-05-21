package ifpr.pgua.eic.quick;

public class QuickSortInt {

    public static void sort(int[] vetor) {
        sort(vetor, 0, vetor.length - 1);
    }

    /* ====================================================== */

    private static void sort(int[] vetor, int inicio, int fim) {
        if(inicio >= fim) {
            return;
        }

        int pivot = vetor[fim];
        int ponteiroEsquerdo = inicio;
        int ponteiroDireito = fim - 1;

        // pivot: valor que estamos procurando sua posicao certa
        // i: ponteiro para o ultimo valor menor que pivot
        // j: ponteiro para o ultimo valor maior que pivot

        // percorre o vetor com i, procurando um valor maior que o pivot
        // percorre o vetor com j, procurando um menor que o pivot

        // se os ponteiros i e j nao se cruzarem, significa que foi achado um
        // um valor menor que o pivot na particao errada e um valor maior que
        // o pivot na particao errada. entao troca valor de i com valor de j
        // isso se repete ate os ponteiros se cruzarem.

        while (ponteiroEsquerdo < ponteiroDireito) {
            while (ponteiroEsquerdo <= ponteiroDireito && vetor[ponteiroEsquerdo] <= pivot) {
                ponteiroEsquerdo += 1;
            }

            while (ponteiroDireito > ponteiroEsquerdo && vetor[ponteiroDireito] > pivot) {
                ponteiroDireito -= 1;
            }

            if (ponteiroEsquerdo < ponteiroDireito) {
                troca(vetor, ponteiroEsquerdo, ponteiroDireito);
            }
        }

        troca(vetor, fim, ponteiroEsquerdo);

        sort(vetor, inicio, ponteiroEsquerdo - 1);
        sort(vetor, ponteiroEsquerdo + 1, fim);
    }

    private static void troca(int[] vetor, int primeiraPosicao, int segundaPosicao)  {
        int swap = vetor[primeiraPosicao];
        vetor[primeiraPosicao] = vetor[segundaPosicao];
        vetor[segundaPosicao] = swap;
    }
}
