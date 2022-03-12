public class OrdemInversa {
    public static void main(String[] args) {

        int[] vetor = { 0, -5, 8, 9, 15, 17 };

        int count = 0;
        while (count < (vetor.length - 1)) {
            System.out.print(vetor[count] + " ");
            count++;

        }
        System.out.println("\nVetor: ");
        for (int i = (vetor.length - 1); i >= 0; i--)
            System.out.print(vetor[i] + " ");
        {

        }

    }
}
