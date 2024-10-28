public class Sequencias {

    public static void main(String[] args) {

        int[] seqA = {1, 3, 5, 7};
        int nextA = seqA[seqA.length - 1] + 2;
        System.out.println("Próximo número da sequência a): " + nextA);

        int[] seqB = {2, 4, 8, 16, 32, 64};
        int nextB = seqB[seqB.length - 1] * 2;
        System.out.println("Próximo número da sequência b): " + nextB);

        int[] seqC = {0, 1, 4, 9, 16, 25, 36};
        int nextC = (seqC.length) * (seqC.length);
        System.out.println("Próximo número da sequência c): " + nextC);

        int[] seqD = {4, 16, 36, 64};
        int nextD = (seqD.length * 2 + 2) * (seqD.length * 2 + 2);
        System.out.println("Próximo número da sequência d): " + nextD);

        int[] seqE = {1, 1, 2, 3, 5, 8};
        int nextE = seqE[seqE.length - 1] + seqE[seqE.length - 2];
        System.out.println("Próximo número da sequência e): " + nextE);

        int[] seqF = {2, 10, 12, 16, 17, 18, 19};
        int nextF = 27;
        System.out.println("Próximo número da sequência f): " + nextF);
    }
}