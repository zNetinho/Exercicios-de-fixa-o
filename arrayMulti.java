import java.util.Random;

public class arrayMulti {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for (int i = 0; i < M.length; i++) {
            for (int j = 0; j < M[i].length; j++) {
                M[i][j] = random.nextInt(9);
            }

        }
        System.out.println("matriz: ");
        for (int[] line : M) {
            for (int coluna : line) {
                System.out.println(coluna + " ");
            }
            System.out.println();
        }
    }
}
