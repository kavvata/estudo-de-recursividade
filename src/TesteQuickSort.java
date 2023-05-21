import ifpr.pgua.eic.quick.QuickSortInt;

public class TesteQuickSort {
    public static void main(String[] args) {
        int[] valores = {4, 7, 2, 6, 5, 8, 3};
    
        System.out.print("Vetor: ");
        mostraValores(valores);

        QuickSortInt.sort(valores);

        System.out.print("Vetor ordenado: ");
        mostraValores(valores);
    }

    static void mostraValores(int[] vetor) {
        String str = "";

        for(int valor : vetor) {
            str += valor + " ";
        }

        System.out.println(str);
    }
}
