public class BinSeq {
    public static int nComparacoes;
    public static int indice;
    public static int[] A = { 10, 12, 20, 22, 35, 37, 39, 40, 56, 70, 71, 75 };

    public static void main(String[] args) throws Exception {
        int n = 72;
        nComparacoes = 0;
        System.out.println(" ----- Busca Binária ----- ");
        binSearch(n, 0, A.length - 1);
        if (indice != -1) {
            System.out.println("Valor encontrado na posição = " + indice);
            System.out.println("Total de comparações = " + nComparacoes);
        } else {
            System.out.println("Valor NÃO encontrado na posição = " + indice);
            System.out.println("Total de comparações = " + nComparacoes);
        }
    }

    public static void binSearch(int n, int begin, int end) {
            int metade = (begin + end) / 2;
            if (begin > end){
                indice = -1;
                nComparacoes++;
                return;
            }
            if ( A[metade] == n){
                indice = metade;
                nComparacoes++;
                return;
            }
            if (A[metade] < n){
                nComparacoes++;
                binSearch(n, metade+1, end);
            }
            else{
                nComparacoes++;
                binSearch(n, begin, metade-1);
            }

    }
}
